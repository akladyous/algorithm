package binarySearch.binary_search;

public class FindFirstPositionOfElementInSortedArray {

    public static void main(String[] args) {

    }

    public static int findFirstIndex(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        int[] indices = new int[] {-1, -1};
        int index = -1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            if ( nums[mid] >= target ){
                right = mid - 1; // discard everything on the right
            } else {
                // 1 3 3 [5] 8 8 10 target 8
                left = mid + 1; // discard everything on the left
            }
            if (nums[mid] == target) {
                index = nums[mid];
            }
        }
        return index;
    }
}
