package easy.longest_common_prefix_14;

public class LongestCommonPrefix_solution {

    public static void main(String[] args) {
        String[] strs1 = {"flower", "flow", "flight"};
        String longestPrefix1 = longestCommonPrefix(strs1);
        System.out.println("( " + longestPrefix1 + " )");

        String[] strs2 = {"dog", "racecar", "car"};
        String longestPrefix2 = longestCommonPrefix(strs2);
        System.out.println("( " + longestPrefix2 + " )");
    }

    public static String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }

        // initialize the prefix variable with the first string in the array
        String prefix = strs[0];

        for (int i=1; i<strs.length; i++) {
            // check if the current string does not start with the prefix.
            // if doesn't then remove the last character from prefix'

            while ( !strs[i].startsWith(prefix) ) {
                prefix = prefix.substring(0, prefix.length() - 1);
                // in case prefix becomes empty during the process, it means there
                // is no common prefix among the strings.
                // so we just return an empty string.
                if ( prefix.isEmpty()) return "";
            };
        }   // After iterating through all the strings,
        // `in theory` we have found the longest common prefix!
        // so we return it.
        return prefix;
    }
}
/*
    The time complexity should be O( W * L),
    where W is the number of string(words) in the input array strs,
    and L is the length of the longest string(word) in strs.



 */