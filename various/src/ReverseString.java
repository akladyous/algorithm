public class ReverseString {

    public static void main(String[] args) {
        System.out.println(solution("hello, world!"));
    }

    public static String solution(String str) {
        char[] strArray = str.toCharArray();
        int left = 0, right = str.length() - 1;
        while ( left < right) {
            strArray[left] = str.charAt(right);
            strArray[right] = str.charAt(left);
            left ++;
            right --;
        }

        return String.valueOf(strArray);
    }
}
