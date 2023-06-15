package easy;

import java.util.*;

public class Practice {

  public static void main(String[] args) {
    String s1 = "Hello World";
    System.out.println(lengthOfLastWord(s1));
    s1 = "   fly me   to   the moon  ";
    System.out.println(lengthOfLastWord(s1));
    s1 = "luffy is still joyboy";
    System.out.println(lengthOfLastWord(s1));
    s1 = "Today is a nice day";
    System.out.println(lengthOfLastWord(s1));

  }

  static int lengthOfLastWord(String s) {
    int max = 0;
    int wordMax = 0;
    for (int i=s.length(); i< s.length(); i++) {
        if (s.charAt(i) == ' ') {
          wordMax = 0;
        } else {
          wordMax ++;
        }
        if (wordMax > max) {
            max = wordMax;
        }
    }
    return max;
  }


}

