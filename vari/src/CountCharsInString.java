public class CountCharsInString {


    public static void solution1(String s) {
        int[] charCounts = new int[26];
        for (int i : s.getBytes()) {
            charCounts[i - 97] ++ ;
        };
    };

    public static void solution2(String s) {
        // assuming all chars in s string are lowercase
        int[] charCounts = new int[26];
        for (char c : s.toCharArray()) {
            charCounts[c - 'a'] ++;
        };
    };

}
