package easy;

import java.util.*;

public class Practice {
    public static void main(String[] args) {
        System.out.println(leetcode_27_removeElement(new int[]{3,2,2,3}, 3));
        System.out.println(leetcode_27_removeElement(new int[]{5, 5, 5, 5}, 5));
        System.out.println(leetcode_27_removeElement(new int[]{1, 2, 3, 4, 5}, 3));
        System.out.println(leetcode_27_removeElement(new int[]{0,1,2,2,3,0,4,2}, 2));
    }

    //-----------------------------------------------------------------------------------------------------------------
    public int leetcode_28_find_the_Index_of_the_First_Occurrence_in_a_String(String haystack, String needle) {
        for (int i = 0; i <= haystack.length() - needle.length(); i++) {
            int j;
            for (j = 0; j < needle.length(); j++) {
                if (haystack.charAt(i + j) != needle.charAt(j)) break;
            }
            if (j == needle.length()) {
                return i;
            }
        }
        return -1;
    }
    //-----------------------------------------------------------------------------------------------------------------
    static int leetcode_27_removeElement(int[] nums, int val) {
        /*
            0 0 0 0 1
            L R
            3 2 2 3     [3]
              2 != 3
              shift 2 to left
            2 2 2 3
        */
        int left = 0;
        for (int right=0; right < nums.length; right ++) {
            if (nums[right] != val) {
                int temp = nums[left];
                nums[left] = nums[right];
                nums[right] = temp;
                left ++;
            }
        }
        return left;
    }

    //-----------------------------------------------------------------------------------------------------------------
    static int leetcode_26_removeDuplicatesFromSortedArray(int[] nums) {
        int left = 0;
        for (int right=0; right < nums.length; right++) {
            if ( nums[right] > nums[left] ) {
                left ++;
                nums[left] = nums[right];
            }
        }
        return left + 1;
    }
    //-----------------------------------------------------------------------------------------------------------------
    static boolean leetcode_20_isValidParentheses(String s) {
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
    //-----------------------------------------------------------------------------------------------------------------
    public static String leetcode_14_longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }
        String prefix = strs[0];
        for (int i=1; i<strs.length; i++) {
            while ( !strs[i].startsWith(prefix) ) {
                prefix = prefix.substring(0, prefix.length() - 1);
                if ( prefix.isEmpty()) return "";
            };
        }
        return prefix;
    }
    //-----------------------------------------------------------------------------------------------------------------
    public static int leetcode_13_RomanToInteger(String s) {
        int result = 0;
        int prevValue = 0;
        int currentValue = 0;

        for (int i = s.length() - 1; i >= 0; i --) {
            switch (s.charAt(i)) {
                case 'I' -> currentValue = 1;
                case 'V' -> currentValue = 5;
                case 'X' -> currentValue = 10;
                case 'L' -> currentValue = 50;
                case 'C' -> currentValue = 100;
                case 'D' -> currentValue = 500;
                case 'M' -> currentValue = 1000;
            }
            if (currentValue >= prevValue) {
                result += currentValue;
            } else {
                result -= currentValue;
            }
            prevValue = currentValue;
        }
        return result;
    }
    //-----------------------------------------------------------------------------------------------------------------
    public static boolean leetcode_9_isPalindromeNumber_1(int x) {
        int originalNumber = x;
        int reversed = 0;
        while (x > 0) {
            int leastSignificantDigit = x % 10;
            reversed = reversed * 10 + leastSignificantDigit;
            x /= 10;
        }
        return originalNumber == reversed;
    }
    public static boolean leetcode_9_isPalindromeNumber_2(int x) {
        char[] num = String.valueOf(x).toCharArray();
        int left = 0, right = num.length - 1;
        while ( left < right ) {
            if ( num[left] != num[right]) return false;
            left ++; right --;
        }
        return true;
    }
    //-----------------------------------------------------------------------------------------------------------------
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
    //-----------------------------------------------------------------------------------------------------------------
    static int missingNumber(int[] nums) {
        int missing = nums.length; // Initialize missing as the last index of nums
        // XOR all the numbers and their indices
        for (int i = 0; i < nums.length; i++) {
            missing ^= i ^ nums[i];
        }
        return missing;
    }
    //-----------------------------------------------------------------------------------------------------------------
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

