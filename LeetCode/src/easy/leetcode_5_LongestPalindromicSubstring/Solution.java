package easy.leetcode_5_LongestPalindromicSubstring;


public class Solution {
    public static void main(String[] args) {
        System.out.println(longestPalindrome("babad"));
        System.out.println(longestPalindrome("ac"));
        System.out.println(longestPalindrome("bb"));
        System.out.println(longestPalindrome("cbbd"));
        System.out.println("-".repeat(60));
    }
    //----------------------------------------------------------------
    // Check for odd-length palindromes
    // Check for even-length palindromes
    static String longestPalindrome(String s) {
        if (s == null || s.length() < 1) {
            return "";
        }
        // star & end to keep track of matching palindrome
        int start = 0;
        int end = 0;

        for (int i = 0; i < s.length(); i++) {
            int len1 = expandAroundCenter(s, i, i);
            int len2 = expandAroundCenter(s, i, i + 1);

            // represents the length of the longest palindromic substring found so far.
            int len = Math.max(len1, len2);
            // if current palindrome length is greater than the length of the last palindrome
            if (len > end - start) {
                start = i - ( (len - 1) / 2 );
                /*
                (len - 1) gives us the number of characters between the center of the palindrome and its edge on one side.
                (len - 1) / 2 calculates the number of characters to move towards the left from the center to reach the start index of the palindrome.
                 */
                end = i + len / 2;
            }
        }

        return s.substring(start, end + 1);
    }
/*
    X X X B A B A D       first match bab
      I index = 4
      start = i - len - 1 -> 4 - (1-1)

*/


    static int expandAroundCenter(String s, int left, int right) {
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }

        return right - left - 1;
    }

}
