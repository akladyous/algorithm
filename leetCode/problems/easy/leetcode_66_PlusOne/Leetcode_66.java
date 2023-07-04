package easy.leetcode_66_PlusOne;

import java.util.Arrays;

public class Leetcode_66 {

    public static void main(String[] args) {
        int[] digits1 = {1, 2, 3};
        System.out.println(Arrays.toString(plusOne(digits1))); // [1, 2, 4]

        int[] digits2 = {4, 3, 2, 1};
        System.out.println(Arrays.toString(plusOne(digits2))); // [4, 3, 2, 2]

        int[] digits3 = {9};
        System.out.println(Arrays.toString(plusOne(digits3))); // [1, 0]

        int[] digits4 = {9,9,9,9};
        System.out.println(Arrays.toString(plusOne(digits4))); // [1, 0, 0, 0, 0]
    }

    public static int[] plusOne(int[] digits) {
        int carry = 1;
        int n = digits.length;

        for (int i = n - 1; i >= 0; i--) {
            int sum = digits[i] + carry;
            if (sum < 10) {
                digits[i] = sum;
                carry = 0;
            } else {
                digits[i] = sum % 10;
                carry = 1;
            }
        }

        if (carry == 1) {
            int[] result = new int[n + 1];
            result[0] = 1;
            for (int i = 0; i < n; i++) {
                result[i + 1] = digits[i];
            }
            return result;
        }
        return digits;
    }
}
