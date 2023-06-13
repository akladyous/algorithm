package easy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Practice {
  public static void main(String[] args) {
    _1_test();
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
    result = _1_brute_force(new int[]{2, 7, 11, 15}, 9);
    System.out.println(Arrays.toString(result));

    result = _1(new int[]{3, 1, 5, 6, 4, 3}, 6);
    System.out.println(Arrays.toString(result));
    result = _1_brute_force(new int[]{3, 1, 5, 6, 4, 3}, 6);
    System.out.println(Arrays.toString(result));

    result = _1(new int[]{3, 2, 4}, 6);
    System.out.println(Arrays.toString(result));
    result = _1_brute_force(new int[]{3, 2, 4}, 6);
    System.out.println(Arrays.toString(result));
  }

  static int[] _1(int[] nums, int target) {
    HashMap<Integer, Integer> indices = new HashMap<>();
    for (int i=0; i < nums.length; i++) {
      int diff = target - nums[i];
      if (indices.containsKey(diff)) {
        return new int[] {indices.get(diff), i};
      } else {
        indices.put(nums[i], i);
      }
    }
    return null;
  }
  static int[] _1_brute_force(int[] nums, int target) {
    for (int left=0; left<nums.length; left++) {
      for (int right=left+1; right<nums.length; right ++) {
        if (nums[left] + nums[right] == target) {
          return new int[] {left, right};
        }
      }
    }
    return null;
  }

}

