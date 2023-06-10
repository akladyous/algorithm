package easy.leetcode_67_Add_Binary;

public class Solution {

    public static void main(String[] args) {
        // Test Case 1
        String a1 = "11";
        String b1 = "1";
        // Expected output: "100"
        String result1 = addBinary(a1, b1);
        System.out.println("Result 1: " + result1); // Output: 100
        System.out.println();

        // Test Case 2
        String a2 = "1010";
        String b2 = "1011";
        // Expected output: "10101"
        String result2 = addBinary(a2, b2);
        System.out.println("Result 2: " + result2); // Output: 10101
        System.out.println();

        // You can add more test cases here...
    }

    public static String addBinary(String a, String b) {
        int i = a.length() - 1;
        int j = b.length() - 1;
        int carry = 0;
        StringBuilder result = new StringBuilder();

        while ( i >= 0 || j >= 0 ) {
            int sum = carry;
            if (i >= 0)
                sum += a.charAt(i--) - '0';
            if (j >= 0)
                sum += b.charAt(j--) - '0';

            result.append(sum % 2);
            carry = sum / 2;
        }

        if (carry > 0)
            result.append(carry);

        return result.reverse().toString();
    }
}
