package easy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Practice {
  public static void main(String[] args) {
    System.out.println(isPalindrome_1(121));
    System.out.println(isPalindrome_1(1221));
    System.out.println(isPalindrome_1(1234));
  }

  static boolean isPalindrome_1(int x) {
    int reversedNumber = 0;
    int originalNumber = x;
    while ( x > 0 ) {
      int leastSignificantDigit = x % 10;
      reversedNumber = reversedNumber * 10 + leastSignificantDigit;
      x /= 10;
    }
    return originalNumber == reversedNumber;
  }


  static boolean isPalindrome_2(int x) {
    String number = Integer.toString(x);
    int left = 0;
    int right = number.length() - 1;
    while ( left < right ) {

    }
  }

}

