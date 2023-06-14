package easy;

import java.util.*;

public class Practice {
  public static void main(String[] args) {
    System.out.println(Arrays.toString(countCharsInString1("aabbcc")));
  }

  static int[] 1(String s) {
    int[] counts = new int[26];
    for (int n: s.getBytes()) {
      counts[n - 97] ++;
    }
    return counts;
  }

}
