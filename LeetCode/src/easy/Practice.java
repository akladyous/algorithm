package easy;

import java.util.*;

public class Practice {
  public static void main(String[] args) {
    System.out.println(Arrays.toString(countCharsInString2("aabbbcccc")));
  }

  static int[] countCharsInString1(String s) {
    int[] counts = new int[26];
    for (int n: s.getBytes()) {
      counts[n - 97] ++;
    }
    return counts;
  }

  static int[] countCharsInString2(String s) {
    int[] counts = new int[127];
    for (char c: s.toCharArray()) {
      counts[c] ++;
    }
    return counts;
  }
}
