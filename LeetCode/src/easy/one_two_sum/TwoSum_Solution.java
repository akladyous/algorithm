package easy.one_two_sum;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSum_Solution {

    public static void main(String[] args) {
        int[] result;

        result = twoSum(new int[]{2,7,11,15}, 9);
        System.out.println(Arrays.toString(result));

        result = twoSum(new int[]{3,1,5,6,4,3}, 6);
        System.out.println(Arrays.toString(result));

        result = twoSum(new int[]{3,2,4}, 6);
        System.out.println(Arrays.toString(result));

    }

    //

    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> indices = new HashMap<>();
        for (int i=0; i < nums.length; i++) {
            int diff = target - nums[i];
            if (indices.containsKey(diff)) {
                return new int[] {indices.get(diff), i};
            }
            indices.put(nums[i], i);
        }
        return null;
    }
}

// {2:0}