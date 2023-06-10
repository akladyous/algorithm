package easy;

import java.util.Arrays;

public class Running_Sum_of_1d_Array_1480 {
    public static void main(String[] args) {
        int[] testNums = {1,2,3,4}; // [1,3,6,10]
        System.out.println(Arrays.toString(runningSum(testNums)));
        testNums = new int[] {1,1,1,1,1};
        System.out.println(Arrays.toString(runningSum(testNums)));
        testNums = new int[] {3,1,2,10,1};
        System.out.println(Arrays.toString(runningSum(testNums)));
    }

    public static int[] runningSum(int[] nums) {
        int[] result = new int[nums.length];
        result[0] = nums[0];
        for (int i=1; i<nums.length; i++) {
            result[i] = result[i-1] + nums[i];
        }
        return result;
    }
}
