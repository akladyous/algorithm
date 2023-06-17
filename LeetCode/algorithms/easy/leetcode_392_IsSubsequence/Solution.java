package easy.leetcode_392_IsSubsequence;

import java.util.HashSet;
import java.util.Set;

/*
Given two strings s and t, return true if s is a subsequence of t, or false otherwise.

A subsequence of a string is a new string that is formed from the original string by deleting
some (can be none) of the characters without disturbing the relative positions
of the remaining characters. (i.e., "ace" is a subsequence of "abcde" while "aec" is not).



Example 1:
Input: s = "abc", t = "ahbgdc"
Output: true

Example 2:
Input: s = "axc", t = "ahbgdc"
Output: false
*/
public class Solution {

    public static void main(String[] args) {
        String s = "abc";
        String t = "ahbgdc";
        System.out.println(isSubsequence(s, t));  // Output: true

        String s1 = "abc";
        String t1 = "ahbgdc";
        System.out.println(isSubsequence(s1, t1)); // Output: true

        // Test case 2: s = "axc", t = "ahbgdc"
        String s2 = "axc";
        String t2 = "ahbgdc";
        System.out.println(isSubsequence(s2, t2)); // Output: false
    }

    static boolean isSubsequence(String s, String t) {
        int sPointer = 0;
        int tPointer = 0;

        while (sPointer < s.length() && tPointer < t.length()) {
            if (s.charAt(sPointer) == t.charAt(tPointer)) {
                sPointer++;
            }
            tPointer++;
        }
        return sPointer == s.length();
    }
    // n-1
    // E
    // k=0
    static boolean solution2(String s, String t) {
        int sPointer = 0;

        for (int tPointer = 0; tPointer < t.length(); tPointer++) {
            if (sPointer < s.length() && s.charAt(sPointer) == t.charAt(tPointer)) {
                sPointer++;
            }
        }
        return sPointer == s.length();
    }
}
