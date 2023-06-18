package practice;

import easy.leetcode_1_twoSum.Leetcode_1;

import java.util.*;

public class Practice {
    public static void main(String[] args) {
        int[] nums3 = {1, 2, 3, 3, 4, 4, 5};
        int k3 = leetcode_26_removeDuplicatesFromSortedArray(nums3);
        System.out.println(k3); // Output: 5

        int[] nums2 = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        int k2 = leetcode_26_removeDuplicatesFromSortedArray(nums2);
        System.out.println(k2); // Output: 5
        System.out.println("-".repeat(50));

        int[] nums1 = {1, 1, 2};
        int k1 = leetcode_26_removeDuplicatesFromSortedArray(nums1);
        System.out.println(k1); // Output: 2
        System.out.println("-".repeat(50));


    }

    public static int leetcode_26_removeDuplicatesFromSortedArray(int[] nums) {
        int left = 0;
        for (int right=1; right < nums.length; right ++) {
            if (nums[right] > nums[left]) {
                left ++;
                nums[left] = nums[right];
            }
        }
        return left + 1;
    }

}

