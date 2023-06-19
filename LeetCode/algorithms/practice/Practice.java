package practice;

import easy.leetcode_1_twoSum.Leetcode_1;

import java.util.*;

public class Practice {
    public static void main(String[] args) {
        System.out.println(leetcode_27_removeElement(new int[]{3,2,2,3}, 3));
        System.out.println(leetcode_27_removeElement(new int[]{5, 5, 5, 5}, 5));
        System.out.println(leetcode_27_removeElement(new int[]{1, 2, 3, 4, 5}, 3));
        System.out.println(leetcode_27_removeElement(new int[]{0,1,2,2,3,0,4,2}, 2));
    }


    static int leetcode_27_removeElement(int[] nums, int val) {
        int left = 0;
        for (int right=0; right < nums.length; right ++) {
            if (nums[right] != val) {
                int temp = nums[left];
                nums[left] = nums[right];
                nums[right] = temp;
                left ++;
            }
        }
        return left;
    }
}

