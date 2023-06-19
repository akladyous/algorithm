package practice;

import easy.leetcode_1_twoSum.Leetcode_1;

import java.util.*;

public class Practice {
    public static void main(String[] args) {
        int[] nums0 = {1,1,2,2,3};
        int k0 = leetcode_26_removeDuplicatesFromSortedArray(nums0);
        System.out.println(k0); // Output: 2
    }

    static int leetcode_26_removeDuplicatesFromSortedArray(int[] nums) {
        int left = 0;
        // 0 1 2 3 4
        // 1 1 2 2 3
        // L R
        // L   R        match
        //   L R
        //   L     R
        //     L   R
        for (int right = 1; right < nums.length; right ++) {
            if ( nums[right] > nums[left]) {
                left ++;
                nums[left] = nums[right];
            }
        }
        return left + 1;
    }

}

