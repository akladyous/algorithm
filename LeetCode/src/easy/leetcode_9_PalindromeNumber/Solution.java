package easy.leetcode_9_PalindromeNumber;

public class Solution {
    public static void main(String[] args) {
        System.out.println(isPalindrome(121));
        System.out.println(isPalindrome(1410110141));
        System.out.println(isPalindrome_2(121));
        System.out.println(isPalindrome_2(1410110141));

    }

    public static boolean isPalindrome(int x) {
        char[] nums = String.valueOf(x).toCharArray();
        int left = 0;
        int right = nums.length - 1;
        while ( left < right) {
            if (nums[left] != nums[right]) {
                return false;
            }
            left ++;
            right --;
        }
        return true;
    }

    public static boolean isPalindrome_2(int x) {
        int reversedNumber = 0;
        int originalNumber = x;

        while (x > 0) {
            int digit = x % 10;
            reversedNumber = reversedNumber * 10 + digit;
            x /= 10;
        }
        return originalNumber == reversedNumber;
    }

    public static int getHighestPowerOf10(int x) {
        return (int) Math.pow(10, (int) Math.floor(Math.log10(x)));
    }
}

/*
    Initialization:

    Initially, the reversedNumber is set to 0.
    Iteration:

    In each iteration of the while loop, we extract the rightmost digit of the original number using the modulo operator `%`.
    The extracted digit is added to the reversedNumber by multiplying it by 10 and then adding the digit.
    The multiplication by 10 shifts the existing digits in reversedNumber to the left, creating a vacant space in the ones place.
    Then, the extracted digit is added to this vacant space by the addition operation.

    For example, let's consider the number 123:

    In the first iteration, the rightmost digit is 3.
    Initially, reversedNumber is 0.
    reversedNumber = reversedNumber * 10 + 3 becomes 3.
    In the second iteration, the rightmost digit is 2.
    reversedNumber is currently 3.
    reversedNumber = reversedNumber * 10 + 2 becomes 32.
    In the third iteration, the rightmost digit is 1.
    reversedNumber is currently 32.
    reversedNumber = reversedNumber * 10 + 1 becomes 321.
    After these iterations, reversedNumber will contain the reversed form of the original number.

*/

//----------------------------------------------------------------------
