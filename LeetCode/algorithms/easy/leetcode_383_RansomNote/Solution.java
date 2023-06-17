package easy.leetcode_383_RansomNote;

public class Solution {
    public static void main(String[] args) {
        System.out.println(canConstruct("a", "b")); // false
        System.out.println(canConstruct("aa", "ab")); // false
        System.out.println(canConstruct("aa", "aab")); // true
    }

    static boolean canConstruct(String ransomNote, String magazine) {
        int[] magazineFreq = new int[26];

        for (int i=0; i<magazine.length(); i++) {
            int c = magazine.charAt(i) - 97;
            magazineFreq[ c ] ++;
        }

        for (int i=0; i< ransomNote.length(); i++) {
            int c = ransomNote.charAt(i) - 97;
            if ( magazineFreq[c] == 0 ) {
                return false;
            } else {
                magazineFreq[c] --;
            }
        }
        return true;
    }

    static boolean canConstruct2(String ransomNote, String magazine) {
      for (int i=0; i < ransomNote.length(); i++) {
        char r = ransomNote.charAt(i);

        int matchIndex = -1;
        for (int j=0; j < magazine.length(); j++) {
            if (magazine.charAt(j) == ransomNote.charAt(i)) {
                matchIndex = j;
            }
        }
        if (matchIndex == -1) {
            return false;
        }
        magazine = magazine.substring(0, matchIndex) + magazine.substring(matchIndex + 1);
      }
      return true;
    }


}
