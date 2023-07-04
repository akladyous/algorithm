public class WordCheckSum {
    public static void main(String[] args) {
        int result = getWordChecksum("ciao paolo come stai, come andata oggi?");
        System.out.println(Integer.valueOf(result));
        System.out.println(Integer.toHexString(result));
    }
    public static int getWordChecksum(String word) {
        int sum = 0;
        for (int i = 0; i < word.length(); i++) {
            sum += (int) word.charAt(i);
        }
        return sum;
    }
}
