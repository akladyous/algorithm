package easy.leetcode_643_MaximumAverageSubarrayI;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    public static void main(String[] args) {
        System.out.println(findMaxAverage(new int[]{1, 12, -5, -6, 50, 3}, 4));
    }

    static double findMaxAverage(int[] nums, int k) {
        List<Integer> arr = new ArrayList<>();
        double maxAverage = Double.NEGATIVE_INFINITY;
        for (int i = 0; i <= nums.length - k; i++) {
            int sum = 0;
            arr.clear();
            for (int j = i; j < i+k; j++) {
                sum += nums[j];
                arr.add(nums[j]);
            }
            System.out.println(Arrays.toString(arr.toArray()));
            double currentAverage = (double) sum / k;
            maxAverage = Math.max(maxAverage, currentAverage);
        }
        return maxAverage;
    }


}
