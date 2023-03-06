import java.util.HashSet;

// https://leetcode.com/problems/longest-substring-without-repeating-characters/description/
public class LongestSubstringWithoutRepeating_3 {

    public static void main(String[] args) {
        int result = solution("abcabcbb");
        System.out.println("solution : " + result);
    }

    public static int solution(String s) {
       int left = 0, right = 0, max = 0;
       HashSet<Character> window = new HashSet<> ();
       while ( right < s.length() ) {
           if (! window.contains(s.charAt(right))) {
               window.add(s.charAt(right));
               right ++;
               max = Math.max(max, window.size());
           } else {
               window.remove(s.charAt(left));
               left ++;
           }
       }
       return max;
    };
};



