import java.util.Stack;

public class RevserseWords {

    public static void main(String[] args) {
        System.out.println(solutionI("a b c d"));;
        System.out.println(solutionI("ehT  kciuq nworb xof spmuj revo eht yzal .god"));;
        System.out.println(solutionI("sihT si eht tsrif .ecnetnes  sihT si eht .dnoces"));;
        System.out.println(solutionI("elbuod  decaps  sdrow"));;
        System.out.println(solutionI("elppa"));;
    }

    public static String solutionI(String original) {
        String reversed = "";
        int left = 0;
        for ( int right = 0; right < original.length() ; right++ ) {
            if (original.charAt(right) == ' ') {
                for ( int i = right - 1, j=0; i >= left ; i--, j++ ) {
                    reversed += original.charAt(i);
                }
                left = right + 1;
                reversed += " ";
            }
        }
        return reversed;
    };

    public static String solutionII(String original) {
        String reversed = new String();
        int left = 0;
        for ( int right = 0; right < original.length() ; right++ ) {
            if (original.charAt(right) == ' '){
                reversed += reverseWord(original.substring(left, right));
                reversed += " ";
                left = right + 1;

            }
        }
        return reversed;
    }

    public static String reverseWord(String word) {
        char[] wordArray = word.toCharArray();
        int left=0, right = word.length() - 1;
        while (left < right) {
            wordArray[left] = word.charAt(right);
            wordArray[right] = word.charAt(left);
            left++;
            right--;
        }
        return String.valueOf(wordArray);
    }
}
