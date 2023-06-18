package easy;

import java.util.*;

public class Practice {
    public static void main(String[] args) {
        System.out.println(missingNumber2(new int[]{1,2,3,1}));
        System.out.println(isPalindrome(1221));
        System.out.println(isPalindrome2(1221));

    }

    public static boolean isPalindrome2(int x) {
        char[] num = String.valueOf(x).toCharArray();
        int left = 0, right = num.length - 1;
        while ( left < right ) {
            if ( num[left] != num[right]) return false;
            left ++; right --;
        }
        return true;
    }

    public static boolean isPalindrome(int x) {
        int originalNumber = x;
        int reversed = 0;
        while (x > 0) {
            int leastSignificantDigit = x % 10;
            reversed = reversed * 10 + leastSignificantDigit;
            x /= 10;
        }
        return originalNumber == reversed;
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

