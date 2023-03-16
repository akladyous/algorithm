import java.util.HashMap;
import java.util.HashSet;

public class HasDuplicateWords {
    public static void main(String[] args) {
        System.out.println(" " + hasDuplicateWords_hashSet("apple pear melon apple pear apple"));
        System.out.println(" " + hasDuplicateWords_hashSet("giraffe zebra giraffe"));
        System.out.println(" " + hasDuplicateWords_hashSet("apple pear melon"));
    }
    public static boolean hasDuplicateWords_hashSet(String string) {
        String[] words = string.split("\\s+");
        HashSet<String> uniqueWords = new HashSet<>();
        for (String word: words) {
            if (uniqueWords.contains(word)) return true;
            uniqueWords.add(word);
        }
        return true;
    };
    public static HashMap<String, Integer> hasDuplicateWords(String string) {
        HashMap<String, Integer> wordsCount = new HashMap<>();
        for (String word : string.split("\\s+")) {
            if (wordsCount.containsKey(word)) {
                wordsCount.replace(word, wordsCount.get(word) + 1);
            } else {
                wordsCount.put(word, 1);
            }
        }
        return wordsCount;
    }
};
