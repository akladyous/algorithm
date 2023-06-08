package easy.longest_common_prefix_14;

public class LongestCommonPrefix_solution {

    public static void main(String[] args) {
        String[] strs1 = {"flower", "flow", "flight"};
        String longestPrefix1 = longestCommonPrefix(strs1);
        System.out.println(longestPrefix1);

        String[] strs2 = {"dog", "racecar", "car"};
        String longestPrefix2 = longestCommonPrefix(strs2);
        System.out.println(longestPrefix2);
    }

    public static String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }

        String prefix = "";
        StringBuffer sb = new StringBuffer(strs[0]);

        for (int i=1; i < strs.length; i++) {
            while ( !strs[i].startsWith(prefix));
        }
        return null;
    }
}
