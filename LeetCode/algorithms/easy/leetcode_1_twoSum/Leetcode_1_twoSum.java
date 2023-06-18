package easy.leetcode_1_twoSum;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.HashMap;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class Leetcode_1_twoSum {

    public static void main(String[] args) {
        int[] result;
        Leetcode_1_twoSum solution = new Leetcode_1_twoSum();

        result = solution.leetcode_1_twoSum(new int[]{2,7,11,15}, 9);
        System.out.println(Arrays.toString(result));

        result = solution.leetcode_1_twoSum(new int[]{3,1,5,6,4,3}, 6);
        System.out.println(Arrays.toString(result));

        result = solution.leetcode_1_twoSum(new int[]{3,2,4}, 6);
        System.out.println(Arrays.toString(result));

    }

    public static int[] leetcode_1_twoSum_bruteForce(int[] nums, int target) {
        for (int left=0; left < nums.length; left ++) {
            for (int right=left + 1; right < nums.length; right ++) {
                if (nums[left] + nums[right] == target) {
                    return new int[]{left, right};
                }
            }
        }
        return null;
    }
    public int[] leetcode_1_twoSum(int[] nums, int target) {
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
    public static int[] leetcode_1_twoSum_twoPointers_sorted_array(int[] nums, int target) {
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
    Leetcode_1_twoSum solution = new Leetcode_1_twoSum();
    int[] result = new int[2];

    @Test
    void testTwoSumOne() {
        result = solution.leetcode_1_twoSum(new int[]{2,7,11,15}, 9);
        System.out.println(Arrays.toString(result));
        assertArrayEquals( new int[]{0,1}, result);
    }
    @Test
    void testTwoSumTwo() {
        result = solution.leetcode_1_twoSum(new int[]{3,1,5,6,4,3}, 6);
        System.out.println(Arrays.toString(result));
        assertArrayEquals( new int[]{1,2}, result);
    }

    @Test
    void testTwoSumThree() {
        result = solution.leetcode_1_twoSum(new int[]{3,2,4}, 6);
        System.out.println(Arrays.toString(result));
        assertArrayEquals( new int[]{1,2}, result);
    }
}
