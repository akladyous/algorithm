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
    static String longestPalindrome(String s) {
        if (s == null || s.length() < 1) {
            return "";
        }

        int start = 0;
        int end = 0;

        for (int i = 0; i < s.length(); i++) {
//            int len1 = expandAroundCenter(s, i, i); // Check for odd-length palindromes
//            int len2 = expandAroundCenter(s, i, i + 1); // Check for even-length palindromes
//            int len = Math.max(len1, len2);
            int len = expandAroundCenter2(s, i);

            if (len > end - start) {
                start = i - (len - 1) / 2;
                end = i + len / 2;
            }
        }

        return s.substring(start, end + 1);
    }
    /*
    condition  =
        L>= 0
        r < s.length()
        charAt(left) equal charAt(right)
    L
    C B B D
    R
    */

    static int expandAroundCenter(String s, int left, int right) {
        boolean leftGT = left >= 0;
        boolean rightLT = right < s.length();
        boolean eqChar = s.charAt(left) == s.charAt(right);
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }
        int size = right - left - 1;
        return right - left - 1;
    }
    // -------------------------------------------------------------------------------------

    static int expandAroundCenter2( String s, int fromIndex ) {
        // 1 1 -> L=0 : left = 2/2 = 1 if left is even then subtract 1 so left = 0;
        // 1 1 -> R=1 it's value is the first assigned to left pointer (1)
        // 1 2 3 4 3 2 1
        int left =  fromIndex / 2;
        int right = left;
        if (left % 2 == 0) left --;
        while ( left >= 0 && right < fromIndex) {
            if (s.charAt(left) != s.charAt(right)) {
                left --;
                right ++;
            }
        }
        return right - left - 1;
    }





}
