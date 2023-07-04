package easy.leetcode_643_MaximumAverageSubarrayI;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    public static void main(String[] args) {
        System.out.println(findMaxAverage(new int[]{1, 12, -5, -6, 50, 3}, 4));
        System.out.println(findMaxAverage_bruteForce(new int[]{1, 12, -5, -6, 50, 3}, 4));
    }

    static double findMaxAverage(int[] nums, int k) {
        double maxAverage = Double.NEGATIVE_INFINITY;
        double currentSum = 0;
        int left = 0;
        int right = 0;

        while (right < nums.length) {
            currentSum += nums[right];

            if (right - left + 1 >= k) {
                maxAverage = Math.max(maxAverage, currentSum / k);
                currentSum -= nums[left];
                left++;
            }
            right++;
        }
        return maxAverage;
    }

    static double findMaxAverage_bruteForce(int[] nums, int k) {
        double maxAverage = Double.NEGATIVE_INFINITY;
        for (int i = 0; i <= nums.length - k; i++) {
            int sum = 0;
            for (int j = i; j < i+k; j++) {
                sum += nums[j];
            }
            double currentAverage = (double) sum / k;
            maxAverage = Math.max(maxAverage, currentAverage);
        }
        return maxAverage;
    }


}
