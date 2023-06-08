package easy.palindrome_number_9;

public class PalindromeNumber_solution {

    public static void main(String[] args) {
        System.out.println(isPalindrome(121));
        System.out.println(isPalindrome(1410110141));
    }

    public static boolean isPalindrome(int x) {
        char[] nums = String.valueOf(x).toCharArray();
        int left = 0;
        int right = nums.length - 1;
        while ( left < right) {
            if (nums[left] != nums[right]) {
                return false;
            }
            left ++;
            right --;
        }
        return true;
    }
}
