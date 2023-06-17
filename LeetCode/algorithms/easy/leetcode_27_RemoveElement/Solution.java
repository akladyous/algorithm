package easy.leetcode_27_RemoveElement;

public class Solution {

  public static void main(String[] args) {
    System.out.println(removeElement(new int[]{3,2,2,3}, 3));
    System.out.println(removeElement(new int[]{0,1,2,2,3,0,4,2}, 2));
  }
  /*
  In this solution, we use two pointers: `right` to iterate over the elements of the nums array,
  and `left` to keep track of the position where the non-val elements should be placed.
  If nums[right] is not equal to `val`, we move it to the front of the array at position `left` and increment `left`.
  Finally, we return `left`, which represents the number of elements not equal to val.
  */
  static int removeElement(int[] nums, int val) {
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
