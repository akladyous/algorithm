package easy;

import java.util.*;

public class Practice {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(twoSum(new int[]{2,7,11,15}, 9)));
        System.out.println(Arrays.toString(twoSum(new int[]{2,7,3,10,3}, 5)));
        System.out.println(Arrays.toString(twoSum_bruteForce(new int[]{2,7,11,15}, 9)));
        System.out.println(Arrays.toString(twoSum_bruteForce(new int[]{2,7,3,10,3}, 5)));

        System.out.println(Arrays.toString(twoSum_sortedList(new int[]{2,7,11,15}, 9)));
        System.out.println(Arrays.toString(twoSum_sortedList(new int[]{2,7,3,10,3}, 5)));

    }
    static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> indices = new HashMap<>();
        for (int i=0; i<nums.length; i++) {
            int diff = target - nums[i];
            if (indices.containsKey(diff)) {
                return new int[]{indices.get(diff), i};
            }
            indices.put(nums[i], i);
        }
        return null;
    }

    static int[] twoSum_sortedList(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;

        while ( left < right ) {
            int currentSum = nums[left] + nums[right];
            if ( currentSum == target) {
                return new int[] {left, right};
            }

            if ( currentSum > target) {
                right --;
            } else {
                left ++;
            }
        }
        return null;
    }
    static int[] twoSum_bruteForce(int[] nums, int target) {
          for (int i=0; i < nums.length; i++) {
              for (int j=i+1; j<nums.length; j++) {
                  if (nums[i] + nums[j] == target) {
                      return new int[] {i,j};
                  }
              }
          }
          return null;
    }
}
