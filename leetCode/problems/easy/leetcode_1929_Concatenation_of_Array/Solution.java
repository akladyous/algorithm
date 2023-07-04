package easy.leetcode_1929_Concatenation_of_Array;

import java.util.Arrays;

public class Solution {
  public static void main(String[] args) {
    System.out.println(Arrays.toString(getConcatenation(new int[]{1,2,3})));
    System.out.println(Arrays.toString(getConcatenation(new int[]{1,3,2,1})));
  }
  static int[] getConcatenation(int[] nums) {
    int[] ans = new int[nums.length * 2];
    int n = nums.length;
    for (int i=0; i < n; i++) {
      ans[i] = nums[i];
      ans[i + n] = nums[i];
    }
    return ans;
  }
}
