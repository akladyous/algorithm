package easy.leetcode_27_RemoveElement;

/*
Given an integer array nums and an integer val, remove all occurrences of val in nums in-place.
The order of the elements may be changed. Then return the number of elements in nums which are not equal to val.

Consider the number of elements in nums which are not equal to val be k, to get accepted,
you need to do the following things:

Change the array nums such that the first k elements of nums contain the elements which are not equal to val.
The remaining elements of nums are not important as well as the size of nums.
Return k.

Input: nums = [3,2,2,3], val = 3
Output: 2, nums = [2,2,_,_]

Input: nums = [0,1,2,2,3,0,4,2], val = 2
Output: 5, nums = [0,1,4,0,3,_,_,_]
*/

import java.util.Arrays;

public class Leetcode_27 {

  public static void main(String[] args) {
    System.out.println(leetcode_27_removeElement(new int[]{3,2,2,3}, 3));
    // Output: 2
    System.out.println(leetcode_27_removeElement(new int[]{5, 5, 5, 5}, 5));
    // Output: 0
    System.out.println(leetcode_27_removeElement(new int[]{1, 2, 3, 4, 5}, 3));
    // Output: 4
    System.out.println(leetcode_27_removeElement(new int[]{0,1,2,2,3,0,4,2}, 2));
    // Output: 5
  }
  /*
  In this solution, we use two pointers: `right` to iterate over the elements of the nums array,
  and `left` to keep track of the position where the non-val elements should be placed.
  If nums[right] is not equal to `val`, we move it to the front of the array at position `left` and increment `left`.
  Finally, we return `left`, which represents the number of elements not equal to val.
  */
  /*

    L
    3 2 2 3     Initial state:
    R
    L
    2 2 3 3     Step 1:
    R
    L
    2 2 3 3     Step 2:
      R
    L
    2 2 3 3     Step 3:
        R
  */
  static int leetcode_27_removeElement(int[] nums, int val) {
    int left = 0;
    for (int right=0; right < nums.length; right ++) {
      if (nums[right] != val) {
        int temp = nums[left];
        nums[left] = nums[right];
        nums[right] = temp;
        left ++;
    System.out.println(Arrays.toString(nums));
      }
    }
    return left;
  }
}