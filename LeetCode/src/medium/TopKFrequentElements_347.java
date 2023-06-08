package medium;
import java.util.HashMap;

// -----------------> not completed <-----------------

public class TopKFrequentElements_347 {

    public static void main(String[] args) {
        int[] nums1 = new int[] {1,1,1,2,2,3};
        System.out.println(TopKFrequentElements(nums1, 2));
    }

    public static int[] TopKFrequentElements(int[] nums, int k) {
        HashMap<Integer, Integer> frequency = new HashMap<>();
        for (int num: nums) {
            int numFrequency = frequency.getOrDefault(num, 0);
            frequency.put(num,  numFrequency + 1);

        }
        System.out.println(frequency.keySet().toString());
        return null;
    }
}
