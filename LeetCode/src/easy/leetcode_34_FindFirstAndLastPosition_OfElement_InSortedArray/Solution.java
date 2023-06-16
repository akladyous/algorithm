package easy.leetcode_34_FindFirstAndLastPosition_OfElement_InSortedArray;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {

    public static void main(String[] args) {
        System.out.println(
                Arrays.toString(searchRange(new int[]{5,7,7,8,8,10}, 8))
        );
    }

    static int[] searchRange(int[] nums, int target) {
        int[] indices = new int[2];
        indices[0] = find_first_index_of_element_in_sorted_array(nums,target);
        indices[1] = find_last_index_of_element_in_sorted_array(nums,target);
        return indices;
    }

    static int find_first_index_of_element_in_sorted_array(int[] nums, int target) {
        int index = -1;
        int left = 0;
        int right = nums.length - 1;

        while ( left <= right ) {
            int mid = left + (right - left ) / 2;

            if ( nums[mid] <= target ) {
                right = mid - 1;
            }
        }

        return index;
    }
    static int find_last_index_of_element_in_sorted_array(int[] nums, int target) {
        int index = -1;


        return index;
    }

}