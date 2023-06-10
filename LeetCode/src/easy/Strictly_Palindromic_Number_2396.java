package easy;

public class Strictly_Palindromic_Number_2396 {
    public static void main(String[] args) {
        // Test Cases
        System.out.println(isStrictlyPalindromic(9)); // false
        System.out.println(isStrictlyPalindromic(4)); // false
        System.out.println(isStrictlyPalindromic(105)); // true
    }

    public static boolean isStrictlyPalindromic(int n) {
        for (int base = 2; base <= n - 2; base++) {
            String numInBase = Integer.toString(n, base);
            if (!isPalindrome(numInBase)) {
                return false;
            }
        }
        return true;
    }

    private static boolean isPalindrome(String str) {
        int left = 0;
        int right = str.length() - 1;
        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }


}
