package easy;

import java.util.*;

public class Practice {
    public static void main(String[] args) {

    }

    int removeElement(int[] nums, int val) {

    }


    static int removeDuplicatesFromSortedArray_26(int[] nums) {
        int left = 0;
        for (int right=0; right < nums.length; right++) {
            if ( nums[right] > nums[left] ) {
                left ++;
                nums[left] = nums[right];
            }
        }
        return left + 1;
    }



    static boolean isValid(String s) {
        HashMap<Character, Character> parentheses = new HashMap<>();
        parentheses.put('(', ')');
        parentheses.put('[', ']');
        parentheses.put('{', '}');
        Stack<Character> stack = new Stack<>();

        for (int i=0; i< s.length(); i++) {
            char currentChar = s.charAt(i);
            if (parentheses.containsKey(currentChar)) {
                stack.push(currentChar);
            } else {
                if (stack.isEmpty()) {
                    return false;
                }
                char lastOpeningParentheses = stack.pop(); // ( [ {
                if ( ! (parentheses.get(lastOpeningParentheses) == currentChar) ) {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }



    public static String longestCommonPrefix(String[] strs) {
        String prefix = strs[0];
        for(int i=1;i<strs.length;i++){
            while ( !strs[i].startsWith(prefix) ) {
                prefix = prefix.substring(0, prefix.length() - 1);
                if (prefix.isEmpty()) return prefix;
            }
        }
        return prefix;

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

