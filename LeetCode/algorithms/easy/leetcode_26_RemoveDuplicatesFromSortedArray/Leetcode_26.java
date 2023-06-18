package easy.leetcode_26_RemoveDuplicatesFromSortedArray;

public class Leetcode_26 {

    public static void main(String[] args) {

        int[] nums3 = {1, 2, 3, 3, 4, 4, 5};
        int k3 = leetcode_26_removeDuplicatesFromSortedArray(nums3);
        System.out.println(k3); // Output: 5

        int[] nums1 = {1, 1, 2};
        int k1 = leetcode_26_removeDuplicatesFromSortedArray(nums1);
        System.out.println(k1); // Output: 2

        int[] nums2 = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        int k2 = leetcode_26_removeDuplicatesFromSortedArray(nums2);
        System.out.println(k2); // Output: 5


    }
    // it's equivalent to: counts the number of unique elements in the nums array.
    public static int leetcode_26_removeDuplicatesFromSortedArray(int[] nums) {
        int left = 0;
        for (int right=1; right < nums.length; right ++) {
            if (nums[right] > nums[left]) {
                left ++;
                nums[left] = nums[right];
            }
        }
        return left + 1;
    }
}
