public class IsPalindrome125 {

    public static void main(String[] args) {
        System.out.println(solution("A man, a plan, a canal: Panama"));
    };

    public static Boolean solution(String s) {
        int left = 0, right = s.length() - 1;
        while (left < right) {
            while (left < right && !Character.isLetterOrDigit(s.charAt(left))) {
                left ++;
            };
            while (right > left && !Character.isLetterOrDigit(s.charAt(right))) {
                right --;
            };
            if (Character.toLowerCase(s.charAt(right)) != Character.toLowerCase(s.charAt(left))) {
                return false;
            }
            left ++;
            right --;
        }
        return true;
    }
}
