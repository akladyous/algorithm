package easy.leetcode_217_contains_duplicate;

import java.util.HashSet;
import java.util.Set;

public class Solution {
    public static boolean ContainsDuplicate_217(int[] nums) {
        Set<Integer> uniqueNumbers = new HashSet<>();
        for (int i=0; i < nums.length; i++) {
            if (uniqueNumbers.contains(nums[i])) {
                return true;
            }
            uniqueNumbers.add(nums[i]);
        }
        return false;

    }


}
