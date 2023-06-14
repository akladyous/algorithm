package easy;

import java.util.*;

public class Practice {
  public static void main(String[] args) {
    System.out.println(isIsomorphic2("bbbaaaba", "aaabbbba"));
    System.out.println(isIsomorphic("egg", "acc"));
  }

  static  boolean isIsomorphic(String s, String t) {
    int[] sCounts = new int[128];
    int[] tCounts = new int[128];

    for (int i=0; i < s.length(); i++) {
      sCounts[ s.charAt(i) ] ++;
      tCounts[ t.charAt(i) ] ++;

      if(sCounts[s.charAt(i)] != tCounts[t.charAt(i)]) {
        return false;
      }
    }
    return true;
  }
  static  boolean isIsomorphic2(String s, String t) {
      int[] sCounts = new int[128];
      int[] tCounts = new int[128];

      for(int i = 0; i < s.length(); i++){
        char sChar = s.charAt(i);
        char tChar = t.charAt(i);

        int sCount = sCounts[s.charAt(i)];
        int tCount = tCounts[t.charAt(i)];

        if(sCounts[s.charAt(i)] != tCounts[t.charAt(i)])
          return false;
        // [_1] [_2] [_3] [43] [53] [63] [67]
        // [1_] [2_] [3_] [34] [35] [36] [
        sCounts[s.charAt(i)] = i + 1;
        tCounts[t.charAt(i)] = i + 1;


        sCount = sCounts[s.charAt(i)];
        tCount = tCounts[t.charAt(i)];
        System.out.println("-");
      }
      return true;
  }

}

