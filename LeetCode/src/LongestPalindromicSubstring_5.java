// https://leetcode.com/problems/longest-palindromic-substring/description/
// https://www.youtube.com/watch?v=y2BD4MJqV20&t=1s
public class LongestPalindromicSubstring_5 {

    public static void main(String[] args) {
        System.out.println("longestPalindrome   a   : " + longestPalindrome("a"));
//        System.out.println("isPalindrome   a   : " + isPalindrome("a"));
//        System.out.println("isPalindrome   aa  : " + isPalindrome("aa"));
//        System.out.println("isPalindrome   ab  : " + isPalindrome("ab"));
//        System.out.println("isPalindrome   abc : " + isPalindrome("abc"));
//        System.out.println("isPalindrome   aba : " + isPalindrome("aba"));
//        System.out.println("isPalindrome   aba : " + isPalindrome("cbbd"));
        System.out.println("isPalindrome babad : " + isPalindrome("babad"));
//        System.out.println("isPalindrome   bab : " + isPalindrome("bab"));
//        System.out.println("isPalindrome  cbbd : " + isPalindrome("cbbd"));
    }
    public static String longestPalindrome(String s) {
        if (s == null || s.length() < 1) return "";
        int start = 0, end = 0;
        for (int i = 0; i < s.length(); i++) {
            int len1 = expandAroundCenter(s, i, i);
            int len2 = expandAroundCenter(s, i, i + 1);
            int len = Math.max(len1, len2);
            if (len > end - start) {
                start = i - (len - 1) / 2;
                end = i + len / 2;
            }
        }
        return s.substring(start, end + 1);
    }

    public static  int expandAroundCenter(String s, int left, int right) {
        int L = left, R = right;
        while (L >= 0 && R < s.length() && s.charAt(L) == s.charAt(R)) {
            L--;
            R++;
        }
        return R - L - 1;
    }
    public static String isPalindrome(String s) {
        int left  = s.length() / 2, right = left;
        if (s.length() % 2 == 0) left--;
        String palindrome = new String();
        while (
                left >= 0
                && (left <= right)
                && (right < s.length())
                && (s.charAt(left) == s.charAt(right))
        ) {
            if (right - left >= 1) palindrome = s.substring(left, right + 1);
            left --;
            right ++;
        }
        return palindrome;
    }
    public static String prova(String s) {
        String result = "";
        int resultLen = 0;
        for (int i=0; i< s.length(); i++) {
            int left = i;
            int right = i;
            while ( left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right) ) {
                if ( right - left + 1 > resultLen ) {
                    result = s.substring(left, right + 1);
                    resultLen = right - left + 1;
                }
                left --;
                right ++;
            }
            left = i;
            right = i + 1;
            while ( left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right) ) {
                if ( right - left + 1 > resultLen ) {
                    result = s.substring(left, right + 1);
                    resultLen = right - left + 1;
                }
                left --;
                right ++;
            }
        }
        return result;
    }




    public static String solution(String s) {
        int left, right;
        Boolean isPalindrome = false;
        int matchLeftIndex, matchRightIndex;
        char[] palindrom = new char[s.length()];

        left = s.length() / 2;
        right = s.length() / 2;
        if (s.length() % 2 == 0) {
            left--;
        }
        while (left >= 0 && left <= right && right < s.length()) {
            String leftChar = String.valueOf(s.charAt(left));
            String rightChar = String.valueOf(s.charAt(right));
            if (s.charAt(left) == s.charAt(right)) {
                palindrom[left] = s.charAt(left);
                palindrom[right] = s.charAt(right);
                isPalindrome = true;
            } else {
                break;
            }
            ;
            left--;
            right++;

        }
    return "";
    }
}
