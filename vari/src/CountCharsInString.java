import java.util.HashMap;
import java.util.Map;

public class CountCharsInString {


    public static void main(String[] args) {
//        solution1("aaaA");
        System.out.println(solution3("Hello world"));
        System.out.println(solution2("Hello world"));
        System.out.println(solution3("Hello world"));

    }


    public static void solution1(String input) {
        int[] charCounts = new int[26];
        for (int i : input.getBytes()) {
            charCounts[i - 97] ++ ;
        };
    };

    public static void solution2(String input) {
        // assuming all chars in s string are lowercase
        int[] charCounts = new int[26];
        for (char c : input.toCharArray()) {
            charCounts[c - 'a'] ++;
        };
        return charCounts;
    };


    public static Map<Character, Integer> solution_3(String input) {
        Map<Character, Integer> charCounts = new HashMap<>();
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            charCounts.put(c, charCounts.getOrDefault(c, 0) + 1);
        }
        return charCounts;
    }

    public static Map<Character, Integer> solution3(String input) {
        Map<Character, Integer> charCounts = new HashMap<>();
        for (char c : input.toCharArray()) {
            charCounts.put(c,charCounts.getOrDefault(c,0) + 1);
        }
        return charCounts;
    }
}
