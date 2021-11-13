import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class ValidateParentheses {

    public static boolean isValid(String s) {
        if (s.length() < 2) {
            return false;
        }

        Stack<String> temp = new Stack<>();

        Map<String, String> paranthesesDict = new HashMap<>();
        paranthesesDict.put("{", "}");
        paranthesesDict.put("[", "]");
        paranthesesDict.put("(", ")");

        for (int i = 0; i < s.length(); i++) {
            if (!temp.empty() && paranthesesDict.getOrDefault(temp.peek(), "*").equals(String.valueOf(s.charAt(i)))) {
                temp.pop();
            } else {
                temp.push(String.valueOf(s.charAt(i)));
            }
        }

        return temp.size() == 0;

    }

    public static void main(String[] args) {
        String input = "([)]";

        System.out.println("Is input valid? " + isValid(input));
    }

}
