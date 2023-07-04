package easy.leetcode_88_merge_sorted_array;

import java.util.Arrays;

public class Leetcode_88 {
    public static void main(String[] args) {
        // Test Case 1
        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int m = 3;
        int[] nums2 = {2, 5, 6};
        int n = 3;
        leetcode_88_merge_sorted_array(nums1, m, nums2, n);
        System.out.println(Arrays.toString(nums1));  // Output: [1, 2, 2, 3, 5, 6]

        // Test Case 2
        int[] nums3 = {1};
        int m2 = 1;
        int[] nums4 = {};
        int n2 = 0;
        leetcode_88_merge_sorted_array(nums3, m2, nums4, n2);
        System.out.println(Arrays.toString(nums3));  // Output: [1]

        // Test Case 3
        int[] nums5 = {0, 0, 0};
        int m3 = 0;
        int[] nums6 = {1, 2, 3};
        int n3 = 3;
        leetcode_88_merge_sorted_array(nums5, m3, nums6, n3);
        System.out.println(Arrays.toString(nums5));  // Output: [1, 2, 3]
    }

    static void leetcode_88_merge_sorted_array(int[] nums1, int m, int[] nums2, int n) {
        int mPointer = m - 1;
        int nPointer = n - 1;
        int index = m + n - 1;

        while (nPointer >= 0) {
            if (mPointer >= 0 && nums1[mPointer] > nums2[nPointer]) {
                nums1[index--] = nums1[mPointer--];
            } else {
                nums1[index--] = nums2[nPointer--];
            }
        }
    }

    static void leetcode_88_merge_sorted_array_II(int[] nums1, int m, int[] nums2, int n) {
        int nums1Pointer = m - 1;
        int nums2Pointer = n - 1;
        int current = m + n - 1;

        while (nums1Pointer >= 0 && nums2Pointer >= 0) {
            if (nums1[nums1Pointer] > nums2[nums2Pointer]) {
                nums1[current] = nums1[nums1Pointer];
                nums1Pointer--;
            } else {
                nums1[current] = nums2[nums2Pointer];
                nums2Pointer--;
            }
            current--;
        }

        // Copy remaining elements from nums2 to nums1, if any
        while (nums2Pointer >= 0) {
            nums1[current] = nums2[nums2Pointer];
            nums2Pointer--;
            current--;
        }
    }


}
