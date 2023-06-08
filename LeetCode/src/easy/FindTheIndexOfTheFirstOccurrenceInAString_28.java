package easy;

public class FindTheIndexOfTheFirstOccurrenceInAString_28 {



    public static void main(String[] args) {
        String haystack = "sadbutsad";
        String needle = "sad";
        int index = findFirstOccurrence(haystack, needle);
        System.out.println(index);

        // findTheIndexOfTheFirstOccurrenceInAString_28("sadbutsad", "sad");
    }


    public static int findFirstOccurrence(String haystack, String needle) {
        int haystackLength = haystack.length();
        int needleLength = needle.length();

        if (needleLength == 0) {
            return 0;
        }

        for (int i = 0; i <= haystackLength - needleLength; i++) {
            if (haystack.charAt(i) == needle.charAt(0)) {
                int j;
                for (j = 1; j < needleLength; j++) {
                    if (haystack.charAt(i + j) != needle.charAt(j)) {
                        break;
                    }
                }
                if (j == needleLength) {
                    return i;
                }
            } //
        }
        return -1;
    }

}
