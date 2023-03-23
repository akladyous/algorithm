public class CountCharsInString {

    public static void main(String[] args) {


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
}
