package medium.leetcode_3_LongestSubstringWithoutRepeatingCharacters;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Solution {

    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("abcabcbb"));
        System.out.println(lengthOfLongestSubstring("bbbbb"));
        System.out.println(lengthOfLongestSubstring("pwwkew"));
    }
    /*
        ↓                       window
        P  W  W  K  E  W        L=0 R=0 P i not in SET ->[P] -> L++
        ↑  ↑                    L=0 R=0 [P, W] -> L++
        ↑     ↑

    */

    static int lengthOfLongestSubstring(String s) {
        int left = 0;
        int right = 0;
        int maxLen = 0;
        HashSet<Character> window = new HashSet<> ();
        while ( right < s.length() ) {
            if (! window.contains(s.charAt(right))) {
                window.add(s.charAt(right));
                right ++;
                maxLen = Math.max(maxLen, window.size());
            } else {
                window.remove(s.charAt(left));
                left ++;
            }
        }
        return maxLen;
    }
}
