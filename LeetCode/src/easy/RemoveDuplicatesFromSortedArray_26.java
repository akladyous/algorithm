package easy;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

public class RemoveDuplicatesFromSortedArray_26 {

    public static void main(String[] args) {
        int[] nums1 = {1, 1, 2};
        int k1 = removeDuplicatesFromSortedArray_26(nums1);
        System.out.println(k1); // Output: 2

        int[] nums2 = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        int k2 = removeDuplicatesFromSortedArray_26(nums2);
        System.out.println(k2); // Output: 5

        int[] nums3 = {1, 2, 3, 3, 4, 4, 5};
        int k3 = removeDuplicatesFromSortedArray_26(nums3);
        System.out.println(k3); // Output: 5
    }


    public static int removeDuplicatesFromSortedArray_26(int[] nums) {
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
