public class HasDuplicateChars {
    public static void main(String[] args) {
        hasDuplicateChars("ciao come stai");
    }
    public static boolean hasDuplicateChars(String str) {
        // Create a boolean array to keep track of characters seen
        boolean[] charSet = new boolean[128];
        // Iterate through each character in the string
        for (int i = 0; i < str.length(); i++) {
            int val = str.charAt(i);
            // If the character has already been seen, return true
            if (charSet[val]) {
                return true;
            }
            // Mark the character as seen in the array
            charSet[val] = true;
        }
        // If no duplicate characters were found, return false
        return false;
    }

    public static void solution2(String s) {
        // assuming all chars in s string are lowercase
        int[] charCounts = new int[26];
        for (char c : s.toCharArray()) {
            charCounts[c - 'a'] ++;
        }
        // or
        for (int i : s.getBytes()) {
            charCounts[i - 97] ++ ;
        }
    }

};
