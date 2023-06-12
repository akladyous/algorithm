public class IsPalindrom {
    public static void main(String[] args) {
        System.out.println(solution1("abcba"));
        System.out.println(solution1("abcde"));
        System.out.println(solution1("123454321"));
        System.out.println("-".repeat(50));
        System.out.println(solution2("abcba"));
        System.out.println(solution2("abcde"));
        System.out.println(solution2("123454321"));
    }

    public static Boolean solution1(String s) {
        int left = 0;
        int right = s.length() - 1;
        while ( left < right ) {
            if ( s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left ++;
            right --;
        }
        return true;
    };

    /*
    1 2 3 2 1       CASE 1 -> ODD
    1 2 3 4 3 2 1   CASE 2 -> EVEN
    */
    public static boolean solution2(String s) {
        // 5/2 = 2 -
        int left = s.length() / 2;
        int right = left;
        if ( s.length() % 2 == 0 ) left --;
        while ( left >= 0 && right < s.length() ) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left --;
            right ++;
        }
        return true;
    }

    public static Boolean test1(String s) {
        int left = s.length() /2, right = left;
        if (s.length() %2 == 0) left--;
        String palindrome = "";
        while (
                left >= 0 &&
                left <= right &&
                right < s.length() &&
                s.charAt(left) == s.charAt(right)
        ) {
            if ( right - left >= 1) {
                palindrome = s.substring(left, right + 1);
            }
            left --;
            right ++;
        }
        return palindrome == s;
    }


    public static Boolean test2(String s) {
        int left = s.length() /2, right = left;
        if (s.length() %2 == 0) left--;
        while (
                left >= 0 &&
                left <= right &&
                right < s.length()
        ) {
            if ( s.charAt(left) != s.charAt(right) ) return false;
            left --;
            right ++;
        }
        return true;
    }

}
