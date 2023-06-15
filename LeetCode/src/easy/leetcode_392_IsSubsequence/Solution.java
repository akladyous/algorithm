package easy.leetcode_392_IsSubsequence;

import java.util.HashSet;
import java.util.Set;

public class Solution {

    public static void main(String[] args) {
        String s = "abc";
        String t = "ahbgdc";
        System.out.println(isSubsequence(s, t));
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
