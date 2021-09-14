public class AddBinary {

    public static String addBinary(String a, String b) {
        StringBuilder result = new StringBuilder();

        int carry = 0;
        int i = a.length() - 1;
        int j = b.length() - 1;

        while (i >= 0 || j >= 0) {
            int sum = carry;
            if (i >= 0) {
                sum += a.charAt(i) - '0'; // transforms a char into a number
            }
            if (j >= 0) {
                sum += b.charAt(j) - '0';
            }
            result.append(sum % 2);
            carry = sum / 2;

            i--;
            j--;
        }

        if (carry == 1) {
            result.append(carry);
        }

        return result.reverse().toString();
    }

    public static void main(String[] args) {
        String a = "1010";
        String b = "1011";

        System.out.println(addBinary(a, b));
    }

}
