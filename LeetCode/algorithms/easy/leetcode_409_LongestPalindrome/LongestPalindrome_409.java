package easy.leetcode_409_LongestPalindrome;

// https://leetcode.com/problems/longest-palindrome/
// https://www.youtube.com/watch?v=a_3XDW9P47E
public class LongestPalindrome_409 {
    public static void main(String[] args) {

//        longestPalindrome("abcd");
    }
    public static Integer longestPalindrome(String s) {
        int[] charCounts = new int[128];
        int result = 0;
        for (Character c : s.toCharArray()) {
            charCounts[c] ++;
        }
        for (int n : charCounts) {

        }

      return 0;
    };
}