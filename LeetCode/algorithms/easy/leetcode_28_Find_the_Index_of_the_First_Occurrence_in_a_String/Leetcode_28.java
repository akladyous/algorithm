package easy.leetcode_28_Find_the_Index_of_the_First_Occurrence_in_a_String;

public class Leetcode_28 {

    public static void main(String[] args) {
        Leetcode_28 leetcode_28 = new Leetcode_28();

        // Test Case 1
        String haystack1 = "sadbutsad";
        String needle1 = "sad";
        int result1 = leetcode_28.strStr(haystack1, needle1);
        System.out.println("Test Case 1 Result: " + result1);

        // Test Case 2
        String haystack2 = "leetcode";
        String needle2 = "leeto";
        int result2 = leetcode_28.strStr(haystack2, needle2);
        System.out.println("Test Case 2 Result: " + result2);

        // Test Case 3
        String haystack3 = "hello world";
        String needle3 = "world";
        int result3 = leetcode_28.strStr(haystack3, needle3);
        System.out.println("Test Case 3 Result: " + result3);
    }
    //Find_the_Index_of_the_First_Occurrence_in_a_String
    public int strStr(String haystack, String needle) {

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

}
