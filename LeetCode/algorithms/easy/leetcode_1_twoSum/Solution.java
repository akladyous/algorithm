package easy.leetcode_1_twoSum;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.HashMap;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class Solution {

    public static void main(String[] args) {
        int[] result;
        Solution solution = new Solution();

        result = solution.twoSum(new int[]{2,7,11,15}, 9);
        System.out.println(Arrays.toString(result));

        result = solution.twoSum(new int[]{3,1,5,6,4,3}, 6);
        System.out.println(Arrays.toString(result));

        result = solution.twoSum(new int[]{3,2,4}, 6);
        System.out.println(Arrays.toString(result));

    }
    public int[] twoSum(int[] nums, int target) {
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
    public static int[] bruteForce(int[] nums, int target) {
        for (int left=0; left < nums.length; left ++) {
            for (int right=left + 1; right < nums.length; right ++) {
                if (nums[left] + nums[right] == target) {
                    return new int[]{left, right};
                }
            }
        }
        return null;
    }

    //{2,7,11,15}, 9
    // Given a sorted array of unique integers and a target integer
    public static int[] twoPointers(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        while ( left < right ) {
            int currentSum = nums[left] + nums[right];
            if ( currentSum == target) {
                return new int[] {left, right};
            }

            if ( currentSum > target) {
                right --;
            } else {
                left ++;
            }
        }
        return new int[]{-1, -1};
    }
}

class TwoSumTest {
    @Test
    void testTwoSum() {
        Solution solution = new Solution();

        int[] result = new int[2];
        result = solution.twoSum(new int[]{2,7,11,15}, 9);
        System.out.println(Arrays.toString(result));
        assertArrayEquals( new int[]{0,1}, result);

        result = solution.twoSum(new int[]{3,1,5,6,4,3}, 6);
        System.out.println(Arrays.toString(result));
        assertArrayEquals( new int[]{1,2}, result);

        result = solution.twoSum(new int[]{3,2,4}, 6);
        System.out.println(Arrays.toString(result));
        assertArrayEquals( new int[]{1,2}, result);
    }
}
