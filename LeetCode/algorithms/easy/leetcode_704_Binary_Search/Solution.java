package easy.leetcode_704_Binary_Search;

public class Solution {
    public static void main(String[] args) {
        System.out.println(search(new int[]{1,3,5,7,8}, 5));     // 2
        System.out.println(search(new int[]{-1,0,3,5,9,12}, 9)); // 4
        System.out.println(search(new int[]{-1,0,3,5,9,12}, 2)); //-2
    }
    static int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        while ( left <= right ) {
            int mid = left + (right - left) / 2 ;
            if (nums[mid] == target) return mid;
            if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }
}
