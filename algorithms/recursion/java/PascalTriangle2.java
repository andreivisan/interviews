import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PascalTriangle2 {
    public static List<Integer> getRow(int rowIndex) {
        List<Integer> result = new ArrayList<>();
        if (rowIndex == 0) {
            return Arrays.asList(1);
        }

        if (rowIndex == 1) {
            return Arrays.asList(1, 1);
        }

        result.add(1);

        List<Integer> previous = getRow(rowIndex - 1);
        for (int i = 1; i < rowIndex; i++) {
            result.add(previous.get(i - 1) + previous.get(i));
        }

        result.add(1);
        return result;
    }

    public static void main(String[] args) {
        List<Integer> result = getRow(3);

        result.forEach(System.out::println);
    }
}
