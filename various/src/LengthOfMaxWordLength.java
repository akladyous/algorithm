public class LengthOfMaxWordLength {
    public static void main(String[] args) {
        String s1 = "Hello World";
        System.out.println(lengthOfMaxWord(s1));
        s1 = "   fly me   to   the moon  ";
        System.out.println(lengthOfMaxWord(s1));
        s1 = "luffy is still joyboy";
        System.out.println(lengthOfMaxWord(s1));
        s1 = "Today is a nice day";
        System.out.println(lengthOfMaxWord(s1));

    }

    static int lengthOfMaxWord(String s) {
        int max = 0;
        int wordMax = 0;
        for (int i=0; i< s.length(); i++) {
            if (s.charAt(i) == ' ') {
                wordMax = 0;
            } else {
                wordMax ++;
            }
            if (wordMax > max) {
                max = wordMax;
            }
        }
        return max;
    }
}
