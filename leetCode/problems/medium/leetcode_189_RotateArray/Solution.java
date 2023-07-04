package medium.leetcode_189_RotateArray;

import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();

//        int[] nums1 = {1, 2, 3, 4, 5, 6, 7};
//        int k1 = 3;
//        solution.rotate(nums1, k1);
//        System.out.println("Rotated Array (Test Case 1): " + Arrays.toString(nums1));
//
//        int[] nums2 = {-1, -100, 3, 99};
//        int k2 = 2;
//        solution.rotate(nums2, k2);
//        System.out.println("Rotated Array (Test Case 2): " + Arrays.toString(nums2));
//
//        int[] nums3 = {5, 11, 20, 9, -3};
//        int k3 = 4;
//        solution.rotate(nums3, k3);
//        System.out.println("Rotated Array (Test Case 3): " + Arrays.toString(nums3));

        int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] kValues = {1, 2, 3, 4, 5};

        for (int k : kValues) {
            int[] rotatedNums = Arrays.copyOf(nums, nums.length);
            rotate(rotatedNums, k);
            System.out.println("Rotated Array (k = " + k + "): " +
                                Arrays.toString(rotatedNums));
        }
    }

    static void rotate(int[] nums, int k) {
        if (nums == null || nums.length <= 1 || k == 0) {
            return;
        }

        int n = nums.length;
        k = k % n; // Normalize k
        //                                                                 [1, 2, 3, 4, 5, 6, 7]
        reverse(nums, 0, n - 1); // Reverse the whole array     [7, 6, 5, 4, 3, 2, 1]
        reverse(nums, 0, k - 1); // Reverse the first part      [5, 6, 7, 4, 3, 2, 1]
        reverse(nums, k, n - 1); // Reverse the second part     [5, 6, 7, 1, 2, 3, 4]
    }

    static void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
}
