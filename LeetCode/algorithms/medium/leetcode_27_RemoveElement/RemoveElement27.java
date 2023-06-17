package medium.leetcode_27_RemoveElement;

public class RemoveElement27 {
    public static void main(String[] args) {
        removeElement(new int[]{0,1,2,2,3,0,4,2}, 2);

    }

    public static int removeElement(int[] nums, int val) {
        if (nums.length == 0) return 0;
        int left = 0;
        for (int right=0; right < nums.length; right ++) {
            if (nums[right] != val) {
                nums[left] = nums[right];
                left ++;
            }
        }
        return left;
    }
}
