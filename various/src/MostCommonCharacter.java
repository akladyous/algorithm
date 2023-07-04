import java.util.HashMap;

public class MostCommonCharacter {
    /**
     * Find the most common character in str.
     * You could use a HashMap that maps a Character key to an Int value to represent how many times a Character has
     * been spotted.
     * @param str A String.
     * @return the most common character within str.
     */
    public char recurringChar(String str) {
        HashMap<Character, Integer> charFrequency = new HashMap<>();
        for (Character ch : str.toCharArray()) {
            if (charFrequency.containsKey( ch )) {
                charFrequency.replace(ch, charFrequency.get(ch) + 1);
            } else {
                charFrequency.put(ch, 1);
            }
        }; //
        int maxFrequency = 0;
        Character mostCommonChar = ' ';
        for (char key: charFrequency.keySet()) {
            int frequency = charFrequency.get(key);
            if ( frequency > maxFrequency ) {
                maxFrequency = frequency;
                mostCommonChar = key;
            }
        }
        return mostCommonChar;
    }
}
