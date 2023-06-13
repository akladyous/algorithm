package easy;

import java.util.Arrays;
import java.util.HashMap;

public class Practice {
  public static void main(String[] args) {
    String s1 = "please refer to the document";
    String s2 = "good morning madam, How can I assist you today?";

    int i = 0;

  }



  static void _13_test() {
    System.out.println(_13("XXIV")); //24
    System.out.println(_13("MCMXCIV")); //1994
    System.out.println(_13("LVIII")); //58
  }

  static int _13(String s) {
    int currentValue = 0;
    int prevValue = 0;
    int result = 0;
    for (int i = s.length() - 1; i >= 0; i--) {
      switch (s.charAt(i)) {
        case 'I' -> currentValue = 1;
        case 'V' -> currentValue = 5;
        case 'X' -> currentValue = 10;
        case 'L' -> currentValue = 50;
        case 'C' -> currentValue = 100;
        case 'D' -> currentValue = 500;
        case 'M' -> currentValue = 1000;
      }
      if (currentValue >= prevValue) {
        result += currentValue;
      } else {
        result -= currentValue;
      }
      prevValue = currentValue;
    }
    return result;
  }

  static void _1_test() {
    int[] result;

    result = _1(new int[]{2, 7, 11, 15}, 9);
    System.out.println(Arrays.toString(result));

    result = _1(new int[]{3, 1, 5, 6, 4, 3}, 6);
    System.out.println(Arrays.toString(result));

    result = _1(new int[]{3, 2, 4}, 6);
    System.out.println(Arrays.toString(result));
  }

  static int[] _1(int[] nums, int target) {

    return null;
  }




}

