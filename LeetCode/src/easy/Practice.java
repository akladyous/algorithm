package easy;

import java.util.*;

public class Practice {
  public static void main(String[] args) {
    char[] s1 = new char[] {'h','e','l','l','o'};
    reverseString(s1);
    System.out.println(s1);
  }

  static void reverseString(char[] s) {
    int left = 0;
    int right = s.length - 1;
    while ( left <= right) {
      char leftTempChar = s[left];
      s[left] = s[right];
      s[right] = leftTempChar;
      left ++;
      right --;
    }

  }
}

