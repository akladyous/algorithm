package easy.leetcode_205_IsomorphicStrings;

import java.util.HashMap;

public class Solution {
  public static void main(String[] args) {
    System.out.println(isIsomorphic("bbbaaaba", "aaabbbba"));
    System.out.println(isIsomorphic("egg", "acc"));

  }

  static boolean isIsomorphic(String s, String t) {
    /*
    The idea of the solution is to check if the characters in string s can be replaced to obtain string t,
    while preserving the order of characters and ensuring that no two characters map to the same character.

    The solution uses two arrays, mapS and mapT, to store the mappings between characters in s and t.
    Each index in the arrays represents an ASCII character, and the value at each index represents the mapped character.

    The algorithm iterates over the characters of s and t simultaneously. For each character at index i, it performs the following steps:

    1- Retrieve the characters charS and charT at index i from s and t, respectively.
       Check if there is a mapping for charS in mapS and if it matches charT. Similarly,
    2-check if there is a mapping for charT in mapT and if it matches charS.
    3- If the mappings are not consistent (either charS maps to a different character than charT
       or charT maps to a different character than charS),
       it means that the strings are not isomorphic. Return false.
    4- If the mappings are consistent, update the mappings in mapS and mapT by setting charS
       to map to charT and charT to map to charS.
    5- Repeat the above steps for each character in the strings.

    If the algorithm completes the iteration without finding any inconsistent mappings,
    it means that the strings are isomorphic. Return true.

    The solution is efficient as it requires a single pass through the strings and uses fixed-size arrays for character
    mappings, resulting in a time complexity of O(n), where n is the length of the strings.
    */
    int[] mapS = new int[128];
    int[] mapT = new int[128];

    for (int i = 0; i < s.length(); i++) {
      char charS = s.charAt(i);
      char charT = t.charAt(i);

      if (mapS[charS] != 0 && mapS[charS] != charT || mapT[charT] != 0 && mapT[charT] != charS) {
        return false;
      }

      mapS[charS] = charT;
      mapT[charT] = charS;
    }

    return true;
  }

  static boolean isIsomorphic1(String s, String t) {
    HashMap<Character, Character> mapS = new HashMap<>();
    HashMap<Character, Character> mapT = new HashMap<>();

    for (int i=0; i< s.length(); i++) {
      char charS = s.charAt(i);
      char charT = t.charAt(i);

      if ( mapS.containsKey(charS) && mapS.get(charS) != charT || mapT.containsKey(charT) && mapT.get(charT) != charS ) {
        return false;
      }
      mapS.put(charS, charT);
      mapT.put(charT, charS);
    }
    return true;
  }



  static  boolean isIsomorphic3(String s, String t) {
    int[] sCounts = new int[128];
    int[] tCounts = new int[128];

    for(int i = 0; i < s.length(); i++){

      if(sCounts[(int) (s.charAt(i) - 97) ] != tCounts[ (int) (t.charAt(i) - 97) ]) {
        return false;
      }
      sCounts[ (int) (s.charAt(i) - 97) ] = i + 1;
      tCounts[ (int) (t.charAt(i) - 97) ] = i + 1;
    }
    return true;
  }
}
