public class LongestPalindromicSubstring {

    public static void main(String[] args) {
//        System.out.println(isPalindrome("a"));
//        System.out.println(isPalindrome("aa"));
//        System.out.println(isPalindrome("ab"));
        System.out.println(isPalindrome("abc"));
        System.out.println(solution("ab"));
        System.out.println(solution("a"));
        System.out.println(solution("babad"));
        System.out.println(solution("bab"));
        System.out.println(solution("cbbd"));
    }

    public static int isPalindrome(String s) {
        if (s.length() == 1) return 1;
        Boolean isEven = s.length() % 2 == 0;

        int left  = s.length() / 2;
        int right = s.length() / 2;
        if ( isEven ) {
            left --;
        } else {
            left  --;
            right ++;
        }
        while (
                left >= 0
                        && (left < right)
                        && (right < s.length())
                        && (s.charAt(left) == s.charAt(right))
        ) {
            left--;
            right++;
        }
        int r = right - left - 1;
        return r;
    }


    public static String solution(String s) {
        int left, right;
        Boolean isPalindrome = false;
        int matchLeftIndex, matchRightIndex;
        char[] palindrom = new char[s.length()];

        left = s.length() / 2;
        right = s.length() / 2;
        if (s.length() % 2 == 0) {
            left--;
        }
        while (left >= 0 && left <= right && right < s.length()) {
            String leftChar = String.valueOf(s.charAt(left));
            String rightChar = String.valueOf(s.charAt(right));
            if (s.charAt(left) == s.charAt(right)) {
                palindrom[left] = s.charAt(left);
                palindrom[right] = s.charAt(right);
                isPalindrome = true;
            } else {
                break;
            }
            ;
            left--;
            right++;

        }
        if (isPalindrome == true) {
            return s.substring(left + 1, right - 1);
        } else {
            return "";
        }
//        int left=0, right = s.length() -1;
//        while (left >=0 && left <= right  && right <= s.length()) {
//            String leftChar = String.valueOf(s.charAt(left));
//            String rightChar = String.valueOf(s.charAt(right));
//            System.out.println("left : " + leftChar + " right: " + rightChar);
//            left ++;
//            right --;
//        }

    }
}
