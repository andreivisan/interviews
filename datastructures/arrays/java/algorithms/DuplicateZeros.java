public class DuplicateZeros {

    public static void duplicateZeros(int[] arr) {
        int numberOfZeros = findNumberOfZeros(arr);
        int n = arr.length;

        for (int i = n - 1; i >= 0; i--) {
            insert(arr, i, numberOfZeros);

            if (arr[i] == 0) {
                numberOfZeros -= 1;

                insert(arr, i, numberOfZeros);
            }
        }
    }

    private static int findNumberOfZeros(int[] arr) {
        int numberOfZeros = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                numberOfZeros += 1;
            }
        }

        return numberOfZeros;
    }

    private static void insert(int[] arr, int i, int numberOfZeros) {
        if (i + numberOfZeros < arr.length) {
            arr[i + numberOfZeros] = arr[i];
        }
    }

    public static void main(String[] args) {
        int[] arr = { 1, 0, 2, 3, 0, 4, 5, 0 };
        duplicateZeros(arr);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

}
