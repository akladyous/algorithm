package easy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Practice {
  public static void main(String[] args) {
    System.out.println(isPalindrome_1(121));
    System.out.println(isPalindrome_1(1410110141));
  }

  static boolean isPalindrome_1(int x) {
    int xCopy = x;
    int xReversed = 0;
    while (x > 0) {
      // 121
      // move the right digit in xReversed by one digit by multiplying xReversed by 10
      int lestDigit = x & 10; // get the right digit
      xReversed = xReversed * 10 + lestDigit;
      x /= 10;
    }
    return xReversed == x;
  }



}

