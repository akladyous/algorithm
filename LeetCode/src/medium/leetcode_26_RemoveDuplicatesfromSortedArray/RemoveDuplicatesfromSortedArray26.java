package medium.leetcode_26_RemoveDuplicatesfromSortedArray;

public class RemoveDuplicatesfromSortedArray26 {
    public static void main(String[] args) {

        System.out.println(removeDuplicates(new int[]{1,1,2}));
        System.out.println(removeDuplicates(new int[]{0,1,2,2,3,4,4,5}));
        System.out.println(removeDuplicates(new int[]{0,0,1,1,1,2,2,3,3,4}));
    }

    public static int removeDuplicates(int[] nums) {
        int left = 0;
        for (int right = 0; right < nums.length; right ++) {
            if ( nums[right] > nums[left]) {
                left ++;
                nums[left] = nums[right];
            };
        };
        return left + 1;
    };
};
