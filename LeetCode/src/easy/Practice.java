package easy;

import java.util.*;

public class Practice {
  public static void main(String[] args) {
    String s1 = "anagram";
    String t1 = "nagaram";
    System.out.println(isAnagram(s1, t1)); // true

    String s2 = "rat";
    String t2 = "car";
    System.out.println(isAnagram(s2, t2)); // false
  }

  static boolean isAnagram(String s, String t) {
    int[] charCounts = new int[26];
    int result = 0;
    for (int i=0; i< s.length(); i++) {
      charCounts[s.charAt(i) - 97] ++;
      charCounts[t.charAt(i) - 97] --;
      result ^= (int) s.charAt(i);
      result ^= t.charAt(i);
    }
    return result == 0;
  }

  }

