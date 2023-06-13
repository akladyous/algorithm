package easy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Practice {
  public static void main(String[] args) {
    System.out.println(isPalindrome_1(121));
    System.out.println(isPalindrome_1(1410110141));
    System.out.println(isPalindrome_1(121));
    System.out.println(isPalindrome_1(1410110141));
  }

  static boolean isPalindrome_1(int x) {
    int xCopy = x;
    int xReversed = 0;
    while (x > 0) {
      int lsg = x & 10;
      xReversed = xReversed * 10 + lsg;
      x /= 10;
    }
    return xReversed == x;
  }



}

