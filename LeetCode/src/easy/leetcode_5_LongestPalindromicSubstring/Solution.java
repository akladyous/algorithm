package easy.leetcode_5_LongestPalindromicSubstring;

public class Solution {
    public static void main(String[] args) {
        System.out.println(longestPalindrome("ac"));
        System.out.println(longestPalindrome("babad"));
        System.out.println(longestPalindrome("bb"));
        System.out.println(longestPalindrome("cbbd"));
        System.out.println("-".repeat(60));
        System.out.println(longestPalindromeTest1("ac"));
        System.out.println(longestPalindromeTest1("babad"));
        System.out.println(longestPalindromeTest1("bb"));
        System.out.println(longestPalindromeTest1("cbbd"));


    }
    //----------------------------------------------------------------
    static String longestPalindrome(String s) {
        if (s == null || s.length() < 1) {
            return "";
        }

        int start = 0;
        int end = 0;

        for (int i = 0; i < s.length(); i++) {
            int len1 = expandAroundCenter(s, i, i); // Check for odd-length palindromes
            int len2 = expandAroundCenter(s, i, i + 1); // Check for even-length palindromes
            int len = Math.max(len1, len2);

            if (len > end - start) {
                start = i - (len - 1) / 2;
                end = i + len / 2;
            }
        }

        return s.substring(start, end + 1);
    }
    static int expandAroundCenter(String s, int left, int right) {
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }
        return right - left - 1;
    }

    static String longestPalindromeTest1(String s) {
        if (s == null || s.length() < 2) {
            return s;
        }

        int left = s.length() / 2;
        int right = left;
        if (s.length() % 2 == 0) {
            left--;
        }

        String palindrome = "";

        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            palindrome = s.substring(left, right + 1);
            left--;
            right++;
        }

        return palindrome;
    }

}