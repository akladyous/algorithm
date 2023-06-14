package easy.leetcode_205_IsomorphicStrings;

import java.util.HashMap;

public class Solution {
  public static void main(String[] args) {
    System.out.println(isIsomorphic("bbbaaaba", "aaabbbba"));
    System.out.println(isIsomorphic("egg", "acc"));
    HashMap<Integer, Integer> nums = new HashMap<>();

  }

  static boolean isIsomorphic(String s, String t) {
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
}
