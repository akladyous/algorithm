package easy.leetcode_1920_BuildArrayFromPermutation;

import java.util.Arrays;

public class Solution {
  public static void main(String[] args) {
    System.out.println(Arrays.toString(buildArray(new int[]{0,2,1,5,3,4}))); //Output: [0,1,2,4,5,3]
    System.out.println(Arrays.toString(buildArray(new int[]{5,0,1,2,3,4}))); //Output: [4,5,0,1,2,3]
  }

  static int[] buildArray(int[] nums) {
    int[] ans = new int[nums.length];
    for (int i = 0; i < nums.length; i++) {
      ans[i] = nums[nums[i]];
    }
    return ans;
  }
}
