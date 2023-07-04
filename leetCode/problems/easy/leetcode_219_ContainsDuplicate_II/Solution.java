package easy.leetcode_219_ContainsDuplicate_II;

import java.util.HashSet;
import java.util.Set;

public class Solution {

    public static void main(String[] args) {
        // Test Cases
        int[] nums1 = {1, 2, 3, 1};
        int k1 = 3;
        System.out.println(containsNearbyDuplicate(nums1, k1)); // true

        int[] nums2 = {1, 0, 1, 1};
        int k2 = 1;
        System.out.println(containsNearbyDuplicate(nums2, k2)); // true

        int[] nums3 = {1, 2, 3, 1, 2, 3};
        int k3 = 2;
        System.out.println(containsNearbyDuplicate(nums3, k3)); // false
    }

    public static boolean containsNearbyDuplicate(int[] nums, int k) {
        Set<Integer> window = new HashSet<>();
        int left = 0;
        for (int right = 0; right < nums.length; right++) {
            if (right - left > k) {
                window.remove(nums[left]);
                left++;
            }
            if (window.contains(nums[right])) {
                return true;
            }
            window.add(nums[right]);
        }
        return false;
    }
}
