package easy.leetcode_28_Find_the_Index_of_the_First_Occurrence_in_a_String;

public class Leetcode_28 {

    public static void main(String[] args) {
        Leetcode_28 leetcode_28 = new Leetcode_28();

        // Test Case 1
        String haystack1 = "sadbutsad";
        String needle1 = "sad";
        int result1 = leetcode_28.leetcode_28_find_the_Index_of_the_First_Occurrence_in_a_String(haystack1, needle1);
        System.out.println("Test Case 1 Result: " + result1);

        // Test Case 2
        String haystack2 = "leetcode";
        String needle2 = "leeto";
        int result2 = leetcode_28.leetcode_28_find_the_Index_of_the_First_Occurrence_in_a_String(haystack2, needle2);
        System.out.println("Test Case 2 Result: " + result2);

        // Test Case 3
        String haystack3 = "hello world";
        String needle3 = "world";
        int result3 = leetcode_28.leetcode_28_find_the_Index_of_the_First_Occurrence_in_a_String(haystack3, needle3);
        System.out.println("Test Case 3 Result: " + result3);
    }
    public int leetcode_28_find_the_Index_of_the_First_Occurrence_in_a_String(String haystack, String needle) {
        int n = haystack.length();
        int m = needle.length();

        if (m > n) {
            return -1;
        }

        for (int i = 0; i <= n - m; i++) {
            int j;
            for (j = 0; j < m; j++) {
                if (haystack.charAt(i + j) != needle.charAt(j)) {
                    break;
                    // Characters don't match,
                    // move to the next position in haystack
                }
            }
            if (j == m) {
                return i; // Found a match, return the starting index
            }
        }
        return -1; // No match found
    }



}
