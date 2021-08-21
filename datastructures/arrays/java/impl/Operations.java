import java.util.Arrays;

public class Operations {

    private int[] numbers;
    private int length;

    public Operations(int length) {
        this.length = length;
        numbers = new int[length];
    }

    public int[] insert(int number, int index) {
        if (index < numbers.length) {
            numbers[index] = number;
        }
        return numbers;
    }

    public int[] append(int number) {
        this.length += 1;
        numbers = Arrays.copyOf(numbers, this.length);
        numbers[this.length - 1] = number;

        return numbers;
    }

    public int get(int index) {
        if (index < this.length) {
            return numbers[index];
        }

        return -1;
    }

    public int[] delete(int index) {
        if (index < this.length) {
            for (int i = index; i < this.length - 1; i++) {
                numbers[i] = numbers[i + 1];
            }
            this.length -= 1;
        }

        return numbers;
    }

    public void printArray() {
        for (int i = 0; i < this.length; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Operations operations = new Operations(3);

        operations.insert(1, 0);
        operations.insert(2, 1);
        operations.insert(3, 2);

        operations.append(4);

        operations.printArray();

        operations.delete(2);

        operations.printArray();

        System.out.println(operations.get(1));
    }

}
