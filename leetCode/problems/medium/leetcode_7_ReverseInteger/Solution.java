package medium.leetcode_7_ReverseInteger;

public class Solution {
    public static void main(String[] args) {
        System.out.println(reverseInteger(123));
    }

    static int reverseInteger(int x) {
        long reversed = 0;
        while (x != 0) {
            int leastSignificantDigit = x % 10;
            reversed = reversed * 10 + leastSignificantDigit;
            x /= 10;
        }
        return (reversed < Integer.MIN_VALUE || reversed > Integer.MAX_VALUE) ? 0 : (int) reversed;
    }
}
