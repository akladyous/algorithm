package easy.leetcode_26_RemoveDuplicatesFromSortedArray;

import java.util.Arrays;

/*
Given an integer array nums sorted in non-decreasing order,
remove the duplicates in-place such that each unique element appears only once.
The relative order of the elements should be kept the same.
Then return the number of unique elements in nums.

Consider the number of unique elements of nums to be k, to get accepted,
you need to do the following things:

Change the array nums such that the first k elements of nums contain
the unique elements in the order they were present in nums initially.
The remaining elements of nums are not important as well as the size of nums.
Return k.
*/
public class Leetcode_26 {

    public static void main(String[] args) {
        int[] nums0 = {1, 2, 2, 3};
        int k0 = leetcode_26_removeDuplicatesFromSortedArray(nums0);
        System.out.println(k0); // Output: 2

        int[] nums1 = {1, 1, 2};
        int k1 = leetcode_26_removeDuplicatesFromSortedArray(nums1);
        System.out.println(k1); // Output: 2


        int[] nums3 = {1, 2, 3, 3, 4, 4, 5};
        int k3 = leetcode_26_removeDuplicatesFromSortedArray(nums3);
        System.out.println(k3); // Output: 5


        int[] nums2 = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        int k2 = leetcode_26_removeDuplicatesFromSortedArray(nums2);
        System.out.println(k2); // Output: 5
    }
    /*
        [1, 2, 2, 3]
        [1, 2, 2, 3]
        [1, 2, 3, 3]
    */

    // it's equivalent to: counts the number of unique elements in the nums array.
    public static int leetcode_26_removeDuplicatesFromSortedArray(int[] nums) {
        int left = 0;
        for (int right=1; right < nums.length; right ++) {
            if (nums[right] > nums[left]) {
                left ++;
                nums[left] = nums[right];
            }
            System.out.println(Arrays.toString(nums));
        }
        return left + 1;
    }
}
