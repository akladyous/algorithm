package easy;

import java.util.*;

public class Practice {
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

    static boolean isSubsequence2(String s, String t) { // [s] -> is a subsequence of [t]
        int sPointer = 0;
        for (int tPointer=0; tPointer < t.length(); tPointer ++) {
            if (sPointer < s.length() && t.charAt(tPointer) == s.charAt(sPointer)) {
                sPointer ++;
            }
        }
        return sPointer == s.length();
    }

    static boolean isSubsequence(String s, String t) {
        int sPointer = 0;
        int tPointer = 0;

        while ( sPointer < s.length() && tPointer < t.length() ) {
            if ( s.charAt(sPointer) == t.charAt(tPointer) ) {
                sPointer ++;
            }
            tPointer ++;
        }

        return sPointer == s.length();
    }
}
