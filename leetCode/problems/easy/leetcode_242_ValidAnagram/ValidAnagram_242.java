package easy.leetcode_242_ValidAnagram;

public class ValidAnagram_242 {
    public static void main(String[] args) {
        String s1 = "anagram";
        String t1 = "nagaram";
        System.out.println(isAnagram(s1, t1)); // true

        String s2 = "rat";
        String t2 = "car";
        System.out.println(isAnagram(s2, t2)); // false
    }

    public static boolean isAnagram(String s,  String t) {
        if (s.length() != t.length()) { return false; };

        int[] charCount = new int[26]; // Assuming lowercase English letters

        for (int i = 0; i < s.length(); i++) {
            charCount[s.charAt(i) - 'a']++; // Increment charCount for character in s
            charCount[t.charAt(i) - 'a']--; // Decrement charCount for character in t
        }

        // If we find a non-zero count,
        // it means the frequencies of some characters in s and t are different,
        // indicating that they are not anagrams.
        for (int c : charCount) {
            if (c != 0) {
                return false;
            }
        }
        return true;
    }
}
