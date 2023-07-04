package practice;

import easy.leetcode_1_twoSum.Leetcode_1;
import easy.leetcode_28_Find_the_Index_of_the_First_Occurrence_in_a_String.Leetcode_28;

import java.util.*;

public class Practice {



    static int[] test(int[] nums, int target) {
        HashMap<Integer, Integer> indices = new HashMap<>();
        for ( int i=0; i< nums.length; i++) {
            int diff =target - nums[i];
            if (indices.containsKey(diff)) {
                return new int[]{indices.get(diff), i};
            }
            indices.put(nums[i],i);
        }
        return null;
    }
}

