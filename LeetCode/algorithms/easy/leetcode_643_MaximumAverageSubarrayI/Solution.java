package easy.leetcode_643_MaximumAverageSubarrayI;

public class Solution {
    public static void main(String[] args) {
        System.out.println(findMaxAverage(new int[]{1,12,-5,-6,50,3}, 4));
    }

    static double findMaxAverage(int[] nums, int k) {
        // 1,12,-5,-6,50,3
        // 1 2 3 4 5 6
        int left = 0;
        int right = nums.length - 1;
        int currentSum = 0;
        int max = 0;
        for (int i=0; i < k; i++) {
            for (int j=i; j<k && j<nums.length; j++) {
             currentSum += nums[j];
            }

            max = Math.max(max, currentSum / k);
        }

        return 0d;
    }


}
