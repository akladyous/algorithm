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

    public static Boolean solution1(String str) {
        int left = str.length() /2, right = left;
        if (str.length() %2 == 0) left--;
        String palindrome = "";
        while (
                left >= 0 &&
                left <= right &&
                right < str.length() &&
                str.charAt(left) == str.charAt(right)
        ) {
            if ( right - left >= 1) {
                palindrome = str.substring(left, right + 1);
            }
            left --;
            right ++;
        }
        return palindrome == str;
    }

    public static Boolean solution2(String str) {
        int left = str.length() /2, right = left;
        if (str.length() %2 == 0) left--;
        while (
                left >= 0 &&
                left <= right &&
                right < str.length()
        ) {
            if ( str.charAt(left) != str.charAt(right) ) return false;
            left --;
            right ++;
        }
        return true;
    }

}
