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

    public static Boolean solution2(String s) {
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


    public static Boolean solution3(String s) {
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
