package easy.leetcode_58_LengthOfLastWord;

public class Solution {
    public static void main(String[] args) {
        String s1 = "Hello World";
        System.out.println(lengthOfLastWord(s1));
        s1 = "   fly me   to   the moon  ";
        System.out.println(lengthOfLastWord(s1));
        s1 = "luffy is still joyboy";
        System.out.println(lengthOfLastWord(s1));
        s1 = "Today is a nice day";
        System.out.println(lengthOfLastWord(s1));
    }

    static int lengthOfLastWord(String s) {
        int length = 0;
        for (int i=s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) != ' ') {
                length++;
            }
            else if (length > 0) {
                break;
            }
        }
        return length;
    }

}
