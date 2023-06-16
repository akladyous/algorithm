package easy;

import java.util.*;

public class Practice {
    public static void main(String[] args) {
        int[] inputs1 = new int[] {5,7,7,8,8,10};

        System.out.println(Arrays.toString(searchRange(inputs1, 8)));
    }

    /*
        L
        5,7,7,8,8,10
            |     R
            M

              L
        5,7,7,8,8,10
                | R
                M
    */
    static int[] searchRange(int[] nums, int target) {
        int left=0;
        int right = nums.length - 1;
        int[] indices = new int[2];
        int firstIndex = -1;

        while ( left <= right ) {
            int mid = left + (right - left) / 2;
            if (nums[mid] == target) {
                firstIndex = mid;
                right = mid - 1;
            } else  {
                left = mid + 1;
            }

        }
        return indices;
    }
}
