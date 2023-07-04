package medium.leetcode_5_LongestPalindromicSubstring;

public class Solution_II {

  public static void main(String[] args) {
    System.out.println(longestPalindrome("babad"));
    System.out.println(longestPalindrome("ac"));
    System.out.println(longestPalindrome("bb"));
    System.out.println(longestPalindrome("cbbd"));
    System.out.println("-".repeat(60));
  }


  static String longestPalindrome(String s) {
    int max = 0, idx = 0;
    for (int i = 0; i < s.length(); i++) {
      int len1 = extend(s, i, i);
      int len2 = extend(s, i, i + 1);

      if (max < Math.max(len1, len2)) {
        idx = (len1 > len2) ? (i - len1 / 2) : (i - len2 / 2 + 1);
        max = Math.max(len1, len2);
      }
    }
    return s.substring(idx, idx + max);
  }

  static int extend(String s, int i, int j) {
    for (; i >= 0 && j < s.length(); i--, j++)
      if (s.charAt(i) != s.charAt(j))
        break;
    return j - i - 2 + 1; // 2 means current two unmatched char
  }

}
