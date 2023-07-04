public class ReverseWord {

    public static void main(String[] args) {
        System.out.println(reverseWord("ehT  kciuq nworb xof spmuj revo eht yzal .god"));;
        System.out.println(reverseWord("sihT si eht tsrif .ecnetnes  sihT si eht .dnoces"));;
        System.out.println(reverseWord("elbuod  decaps  sdrow"));;
        System.out.println(reverseWord("elppa"));;
    }

    public static String reverseWord(String original) {
        String result = "";
        int left = 0;
        int right;

        for (right = 0; right < original.length()  ; right++) {
            if (original.charAt(right) == ' ' ) {
                for (int idx = right - 1; idx >= left; idx --) {
                    result += original.charAt(idx);
                }
                left = right + 1;
                result += ' ';
            }
        }
        return result;
    }

    public static String reverseWord1(String original) {
        String words[] = original.trim().split("\\s+");
        for (int word = 0; word < words.length; word++) {
            char[] reversedWord = new char[words[word].length()];
            for (int i = 0; i < words[word].length(); i++) {
                reversedWord[i] = words[word].charAt(words[word].length() - 1 - i);
            }
            words[word] = String.valueOf(reversedWord);
        }
        return String.join(" ", words);
    }

    public static String solution(String original) {
        String reversed = "";


        return reversed;
    }
}
