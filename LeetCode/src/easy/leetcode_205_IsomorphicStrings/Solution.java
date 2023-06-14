package easy.leetcode_205_IsomorphicStrings;

import java.util.HashMap;

public class Solution {
  public static void main(String[] args) {
    System.out.println(isIsomorphic("bbbaaaba", "aaabbbba"));
    System.out.println(isIsomorphic("egg", "acc"));

  }

  static boolean isIsomorphic(String s, String t) {
    int[] mapS = new int[128];
    int[] mapT = new int[128];

    for (int i = 0; i < s.length(); i++) {
      char charS = s.charAt(i);
      char charT = t.charAt(i);

    /*
      Check the mappings in the arrays:
      - If mapS[charS] is non-zero (indicating a mapping exists) and mapS[charS] is not equal to charT, or
      - If mapT[charT] is non-zero (indicating a mapping exists) and mapT[charT] is not equal to charS,
        then the characters charS and charT are not isomorphic. Return false.
    */
      if (mapS[charS] != 0 && mapS[charS] != charT || mapT[charT] != 0 && mapT[charT] != charS) {
        return false;
      }
      /*
      Update the mappings in the arrays:
        - Set mapS[charS] to charT to indicate that charS is mapped to charT.
        - Set mapT[charT] to charS to indicate that charT is mapped to charS.
      */
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
