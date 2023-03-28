import java.util.HashMap;
import java.util.Map;

public class CountCharsInString {

    public static void main(String[] args) {
        solution1("aaaA");
    }


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


    public static Map<Character, Integer> countCharacters(String input) {
        Map<Character, Integer> charCounts = new HashMap<>();
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            charCounts.put(c, charCounts.getOrDefault(c, 0) + 1);
        }
        return charCounts;
    }

}
