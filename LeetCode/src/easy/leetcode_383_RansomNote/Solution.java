package easy.leetcode_383_RansomNote;

public class Solution {
    public static void main(String[] args) {
        System.out.println(canConstruct("a", "b")); // false
        System.out.println(canConstruct("aa", "ab")); // false
        System.out.println(canConstruct("aa", "aab")); // true
    }

    static boolean canConstruct(String ransomNote, String magazine) {
      for (int i=0; i < ransomNote.length(); i++) {
        char r = ransomNote.charAt(i);

      }


      return true;
    }
}
