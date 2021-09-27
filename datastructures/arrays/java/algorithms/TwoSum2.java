import java.util.Arrays;

public class TwoSum2 {

    public static int[] twoSum(int[] numbers, int target) {
        int i = 0;
        int j = numbers.length - 1;
        int sum = 0;

        while (i < j) {
            sum = numbers[i] + numbers[j];
            if (sum > target) {
                j--;
            } else if (sum < target) {
                i++;
            } else {
                return new int[] { i + 1, j + 1 };
            }
        }

        return new int[] { -1, -1 };
    }

    public static void main(String[] args) {
        int[] numbers = { 2, 7, 11, 15 };

        int[] result = twoSum(numbers, 9);

        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
    }
}
