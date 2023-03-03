import java.util.Arrays;
import java.util.HashMap;

public class Solution {

    public static void main(String[] args) {
        int[] result = twoSum(new int[]{2,7,11,15});
        System.out.println(Arrays.toString(result));
    }

    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> indices = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int diff = target - nums[i];
            if (indices.containsKey(diff)) {
                return indices.get(diff);
            } else {
                indices.put(i, i);
            }
        }

    }
}
