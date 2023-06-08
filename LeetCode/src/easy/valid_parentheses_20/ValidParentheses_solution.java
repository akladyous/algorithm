package easy.valid_parentheses_20;

import java.util.HashMap;
import java.util.Stack;

public class ValidParentheses_solution {
    public static void main(String[] args) {
        String s1 = "()";
        String s2 = "()[]{}";
        String s3 = "(]";
        String s4 = "{[]}";

        System.out.println(isValidParentheses(s1)); // true
        System.out.println(isValidParentheses(s2)); // true
        System.out.println(isValidParentheses(s3)); // false
        System.out.println(isValidParentheses(s4)); // true
    }
    public static boolean isValidParentheses(String s) {
        if (s.length() % 2 != 0) return false;
        HashMap<Character, Character> parentheses = new HashMap<>();
        parentheses.put('(', ')');
        parentheses.put('[', ']');
        parentheses.put('{', '}');

        Stack<Character> stack = new Stack<>();

        for (int i=0; i < s.length(); i++) {
            char currentChar = s.charAt(i);
            if ( parentheses.containsKey(currentChar)) {
                // The current character is an opening parentheses
                stack.push(currentChar);
            } else {
                if (stack.isEmpty()) {
                    return false;
                }
                // The current character is a closing parentheses
                char topChar = stack.pop();

                if (! (parentheses.get(topChar) == currentChar) ) {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}
