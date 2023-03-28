import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class CountCharsInString {


    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution1("hello")));
        System.out.println(Arrays.toString(solution2("hello world")));
    }

    // assuming all chars in s string are lowercase
    public static int[] solution1(String input) {
        int[] charCounts = new int[26];
        for (int c : input.getBytes()) {
            charCounts[c -  97] ++ ;
        //  charCounts[c - 'a'] ++;
        };
        return charCounts;
    };

    public static int[] solution2(String input) {
        int[] charCounts = new int[127];
        for (char c : input.toCharArray()) {
            charCounts[c] ++;
        };
        return charCounts;
    };


    public static Map<Character, Integer> solution3(String input) {
        Map<Character, Integer> charCounts = new HashMap<>();
        for (char c : input.toCharArray()) {
            charCounts.put(c, charCounts.getOrDefault(c, 0) + 1);
        };
        return charCounts;
    };


}
