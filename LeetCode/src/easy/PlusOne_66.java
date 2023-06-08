package easy;

import java.util.Arrays;

public class PlusOne_66 {

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
        for (int i = digits.length - 1; i >= 0; i--) {
            int sum = digits[i] + carry;
            digits[i] = sum % 10;
            carry = sum / 10;
        }

        if (carry > 0) {
            int[] result = new int[digits.length + 1];
            result[0] = carry;
            for (int i = 1; i <= digits.length; i++) {
                result[i] = digits[i - 1];
            }
            return result;
        }
        return digits;
    }


}
