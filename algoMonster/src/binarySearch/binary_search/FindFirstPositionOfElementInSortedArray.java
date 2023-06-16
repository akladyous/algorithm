package binarySearch.binary_search;

public class FindFirstPositionOfElementInSortedArray {

    public static void main(String[] args) {
        int[] inputs1 = new int[] {5,7,7,8,8,10};
        System.out.println(findFirstIndex(inputs1, 8));
    }

    public static int findFirstIndex(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        int index = -1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

//            if (nums[mid] >= target) {
//                right = mid - 1;
//            } else {
//                left = mid + 1;
//            }

            if (nums[mid] <= target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }

            if (nums[mid] == target) {
                index = mid;
            }
        }
        return index;
    }
}
