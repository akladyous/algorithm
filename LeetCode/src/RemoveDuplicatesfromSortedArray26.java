public class RemoveDuplicatesfromSortedArray26 {
    public static void main(String[] args) {

    }

    public static int removeDuplicates(int[] nums) {
        int left = 0;
        for (int right = 0; right < nums.length; right ++) {
            if ( nums[right] > nums[left]) {
                left ++;
                nums[left] = nums[right];
            }
        }
        return left + 1;
    }
}

