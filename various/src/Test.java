import java.util.HashMap;
import java.util.Map;

public class Test {

    public static void main(String[] args) {
        System.out.println(solution1("ciao paolo"));
        System.out.println(solution2("ciao paolo"));
    }

    public static char solution1(String input) {
        Map<Character, Integer> charsCount = new HashMap<>();
        for (char c : input.toCharArray()) {
            charsCount.put(c, charsCount.getOrDefault(c, 0) + 1);
        };
        //{a:1,b:2,c:3}
        int maxFrequency = 0;
        Character mostCommonChar = ' ';
        for (char key : charsCount.keySet()) {
            int frequency = charsCount.get(key);
            if( frequency > maxFrequency ) {
                maxFrequency = frequency;
                mostCommonChar = key;
            }
        }
        return mostCommonChar;
    }


    public static char solution2(String str) {
        Map<Character, Integer> charsCount = new HashMap<>();
        int maxFrequency = 0;
        Character mostCommonCharacter = '?';
        for (char ch : str.toCharArray()) {
            if ( charsCount.containsKey(ch)) {
                charsCount.replace(ch, charsCount.get(ch) + 1);
            } else {
                charsCount.put(ch, 1);
            }
        };
        for (char key : charsCount.keySet()) {
            int frequency = charsCount.get(key);
            if (frequency > maxFrequency) {
                maxFrequency = frequency;
                mostCommonCharacter =  key;
            }
        }

        return mostCommonCharacter;
    }


}
