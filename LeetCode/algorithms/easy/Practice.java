package easy;

import java.util.*;

public class Practice {
    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("abcabcbb"));
        System.out.println(lengthOfLongestSubstring("bbbbb"));
        System.out.println(lengthOfLongestSubstring("pwwkew"));

    }

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

