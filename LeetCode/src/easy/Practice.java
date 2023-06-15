package easy;

import java.util.*;

public class Practice {
  public static void main(String[] args) {
    System.out.println(containsDuplicate(new int[] {1,2,3,1}));
  }

  static boolean containsDuplicate(int[] nums) {
    HashSet<Integer> counts = new HashSet<>();
    for (int num: nums) {
      if (counts.contains(num)) {
        return true;
      }
      counts.add(num);
    }
    return false;
  }
}

