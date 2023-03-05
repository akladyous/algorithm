public class LongestPalindromicSubstring {

    public static void main(String[] args) {
//        System.out.println(isPalindrome("a"));
//        System.out.println(isPalindrome("aa"));
//        System.out.println(isPalindrome("ab"));
        System.out.println(prova("a"));
        System.out.println(prova("ab"));
        System.out.println(prova("abc"));
        System.out.println(prova("babad"));
        System.out.println(prova("bab"));
        System.out.println(prova("cbbd"));
    }
    public static String prova(String s) {
        String result = "";
        int resultLen = 0;
        for (int i=0; i< s.length(); i++) {
            int left = i;
            int right = i;
            while ( left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right) ) {
                if ( right - left + 1 > resultLen ) {
                    result = s.substring(left, right + 1);
                    resultLen = right - left + 1;
                }
                left --;
                right ++;
            }
            left = i;
            right = i + 1;
            while ( left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right) ) {
                if ( right - left + 1 > resultLen ) {
                    result = s.substring(left, right + 1);
                    resultLen = right - left + 1;
                }
                left --;
                right ++;
            }
        }
        return result;
    }

    public static int isPalindrome(String s) {
        if (s.length() == 1) return 1;
        int left  = s.length() / 2;
        int right = s.length() / 2;
        Boolean isEven = s.length() % 2 == 0;
//        if ( isEven ) {
//            left --;
//        } else {
//            left  --;
//            right ++;
//        }
        if (s.length() % 2 == 0) {
            left--;
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
    return "";
    }
}
