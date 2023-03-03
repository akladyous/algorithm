import java.util.HashSet;

public class HasDuplicateWords {
    public static void main(String[] args) {
        Boolean result = hasDuplicateWords("ciao paolo come stai?");
        System.out.println(result);
    }
    public static boolean hasDuplicateWords(String string) {
        String[] words = string.split("\\s+");
        HashSet<String> uniqueWords = new HashSet<>();
        for (String word: words) {
            if (uniqueWords.contains(word)) return true;
            uniqueWords.add(word);
        }
        return true;
    };
};
