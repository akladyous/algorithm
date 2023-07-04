public class ContainDuplicateInteger1_10 {
    public static boolean ContainDuplicateInteger1_10(int[] nums) {
        int[] occurrences = new int[10];
        for (int num: nums) {
            occurrences[num] ++;
            if (occurrences[num] > 1) {
                return true;
            }
        }
        return false;
    }
}
