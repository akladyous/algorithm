package easy;

import java.util.*;

public class Practice {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(twoSum(new int[]{2,7,11,15}, 9)));
        System.out.println(Arrays.toString(twoSum(new int[]{2,7,3,10,3}, 5)));

    }


    static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> indices = new HashMap<>();
        for (int i=0; i<nums.length; i++) {
            // {2:0}
            int diff = target - nums[i];
            if (indices.containsKey(diff)) {
                return new int[] {indices.get(diff), i};
            }
            indices.put(nums[i], i);
        }
        return null;
    }
}
