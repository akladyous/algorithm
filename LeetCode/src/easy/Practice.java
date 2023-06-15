package easy;

import java.util.*;

public class Practice {
    public static void main(String[] args) {
        System.out.println(isIsomorphic("aba", "bab"));
        System.out.println(isIsomorphic("paper", "title"));
        System.out.println(isIsomorphic("egg", "acc"));
        System.out.println(isIsomorphic("bbbaaaba", "aaabbbba"));
    }

    static  boolean isIsomorphic(String s, String t) {
        int[] mapS = new int[128];
        int[] mapT = new int[128];

        for (int i = 0; i < s.length(); i++) {
            char charS = s.charAt(i);
            char charT = t.charAt(i);

            if ( mapS[charS] != 0 && mapS[charS] != charT ||
                    mapT[charT] != 0 && mapT[charT] != charS ) {
                return false;
            }

            mapS[charS] = charT;
            mapT[charT] = charS;
        }

        return true;
    }
}
