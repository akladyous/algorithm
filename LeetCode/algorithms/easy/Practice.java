package easy;

import java.util.*;

public class Practice {
    public static void main(String[] args) {
        System.out.println(missingNumber2(new int[]{1,2,3,1}));
    }
    static int missingNumber(int[] nums) {
        int missing = nums.length; // Initialize missing as the last index of nums
        // XOR all the numbers and their indices
        for (int i = 0; i < nums.length; i++) {
            missing ^= i ^ nums[i];
        }
        return missing;
    }

    static int missingNumber2(int[] nums) {
        int n = nums.length;
        int expectedSum = n * (n + 1) / 2;
        int actualSum = 0;

        for (int num : nums) {
            actualSum += num;
        }

        return expectedSum - actualSum;
    }
}

