package easy.leetcode_5_LongestPalindromicSubstring;


public class Solution {
  public static void main(String[] args) {
    System.out.println(longestPalindrome("babad"));
    System.out.println(longestPalindrome("ac"));
    System.out.println(longestPalindrome("bb"));
    System.out.println(longestPalindrome("cbbd"));
    System.out.println(longestPalindrome("9720235"));
    System.out.println("-".repeat(60));
  }

  static String longestPalindrome(String s) {
    if (s == null || s.length() < 1) {
      return "";
    }
    int start = 0;
    int end = 0;

    for (int i = 0; i < s.length(); i++) {
      int len1 = expandAroundCenter(s, i, i);
      int len2 = expandAroundCenter(s, i, i + 1);

      // represents the length of the longest palindromic substring found so far.
      int len = Math.max(len1, len2);
      // if current palindrome length is greater than the length of the last palindrome
      if (len > end - start) {
        start = i - ((len - 1) / 2);
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
}

/*
    start = i - ((len - 1) / 2);
    end = i + len / 2;


    1) (palindrome length - 1)
       helps us determine how many characters we need to move from
       the center towards the left to find the starting index of the palindrome.

    2) (palindrome length - 1) / 2
       calculates the number of characters to move left
       from the center to reach the start index of the palindrome.

    3) subtract the current index `i` from step 2 `( len - 1) / 2`
       to find the start index of the longest palindrome substring.

    Example - [ EDGE CASE 1  `ODD LENGTH` ]
    good morning madam, How can i assist you today?
                   ↑ i = 15
                   palindrome size 5
                   1) (palindrome length - 1)
                      5 - 1 = `4`
                   2) (palindrome length - 1) / 2
                      (5 - 1) / 2 = `2` -> is the number of characters to move left
                   3) subtract the current index `i` from step 2 `( len-1) / 2`
                      index = 15
                      index - 2 `resulting in step 2`
                      move 2 characters to find the start index of the longest palindrome substring.

    Example - [ EDGE CASE 1  `EVEN LENGTH` ]
    sunny day, peep of joy.
                ↑ i = 12
                   palindrome size 4
                   1) (palindrome length - 1)
                      4 - 1 = `3`
                   2) (palindrome length - 1) / 2
                      (4 - 1) / 2 = `1` -> is the number of characters to move left
                   3) subtract the current index `i` from step 2 `( len-1) / 2`
                      index = 12
                      index - 1 `resulting in step 2`
                      move 1 character to find the start index of the longest palindrome substring.
*/