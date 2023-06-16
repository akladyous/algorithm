package easy;

import java.util.*;

public class Practice {
    public static void main(String[] args) {
        rotate(new int[]{1,2,3,4,5,6,7}, 3);
//        reverse(new int[]{1,2,3,4,5,6});
    }

    static void call_rotate() {

    }

    static void rotate(int[] nums, int k) {
        // Input: nums = [1,2,3,4,5,6,7], k = 3
        // Input: nums = [1,2,3,4,5,6,7], k = 3
        // Output:       [5,6,7,1,2,3,4]
        int left  = 0;
        int right = nums.length - 1;
        /*
        [1, 2, 3, 4, 5, 6, 7]
        [7, 6, 5, 4, 3, 2, 1]
        [5, 6, 7, 4, 3, 2, 1]
        [5, 6, 7, 1, 2, 3, 4]
        */

        for (int i=0; i<nums.length; i++) {
            int position = nums.length -1 - k;
            int temp = nums[position];
            nums[position] = nums[i];
            nums[i] = temp;
            System.out.println("");
        }


//        for (int i=nums.length-1; i>=0; i--) {
//            int reversed = nums.length  + k;
//        }

    }

    static void reverse(int[] nums) {
        // 1,2,3,4,5,6,7
        int left  = 0;
        int right = nums.length - 1;

        while ( left < right ) {
            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;
            left ++;
            right --;
        }
    }


    static void isSubsequence() {
        String s = "abc";
        String t = "ahbgdc";
        System.out.println(isSubsequence(s, t));  // Output: true

        String s1 = "abc";
        String t1 = "ahbgdc";
        System.out.println(isSubsequence(s1, t1)); // Output: true

        // Test case 2: s = "axc", t = "ahbgdc"
        String s2 = "axc";
        String t2 = "ahbgdc";
        System.out.println(isSubsequence(s2, t2)); // Output: false
    }

        static boolean isSubsequence2(String s, String t) { // [s] -> is a subsequence of [t]
        int sPointer = 0;
        for (int tPointer=0; tPointer < t.length(); tPointer ++) {
            if (sPointer < s.length() && t.charAt(tPointer) == s.charAt(sPointer)) {
                sPointer ++;
            }
        }
        return sPointer == s.length();
    }

    static boolean isSubsequence(String s, String t) {
        int sPointer = 0;
        int tPointer = 0;

        while ( sPointer < s.length() && tPointer < t.length() ) {
            if ( s.charAt(sPointer) == t.charAt(tPointer) ) {
                sPointer ++;
            }
            tPointer ++;
        }

        return sPointer == s.length();
    }
}
