package easy;

import java.util.*;

public class Practice {
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
    Stack<Character> stack = new Stack<>();
    for (Character c: s.toCharArray()) {
      if (c == '(') {
        stack.push(')');
      } else if ( c == '[') {
        stack.push(']');
      } else if ( c == '{') {
        stack.push('}');
      } else if (stack.isEmpty() || stack.pop() != c) {
        return false;
      }
    }
  }


}

//800 225 8930 infinity
// 818 875 6020 -> 885049

