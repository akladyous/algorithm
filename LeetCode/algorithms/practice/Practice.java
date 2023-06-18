package practice;

import easy.leetcode_1_twoSum.Leetcode_1;

import java.util.*;

public class Practice {
    public static void main(String[] args) {
        System.out.println(leetcode_9_palindrome_number(121));
        System.out.println(leetcode_9_palindrome_number(1410110141));
//        System.out.println(leetcode_9_palindrome_number_2(121));
//        System.out.println(leetcode_9_palindrome_number_2(1410110141));
    }

    public static boolean leetcode_9_palindrome_number(int x) {
        int original = x;
        int reversed = 0;
        while (x > 0) {
            int leastSignificantDigit = x % 10;
            reversed = reversed * 10 + leastSignificantDigit;
            x /= 10;
        }
        return original == reversed;
    }


}

