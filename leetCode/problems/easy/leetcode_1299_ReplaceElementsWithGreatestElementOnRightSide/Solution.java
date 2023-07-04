package easy.leetcode_1299_ReplaceElementsWithGreatestElementOnRightSide;

public class Solution {
    public int[] replaceElements(int[] arr) {
        int n = arr.length;
        int max = arr[n - 1] ;       // set the initial maximum as the last element
        arr[n -1] = -1;              // replace the last element with -1
        for (int i=n-2; i>= 0; i--) {
            int temp = arr[i];         // track the current element
            arr[i] = max;              // replace the current element with the maximum
            max = Math.max(max, temp); // update the maximum if necessary
        }
        return arr;
    }


    public int[] bruteForce(int[] arr) {
        for (int left=0; left < arr.length; left++) {
            int max = 0;
            for (int right = left + 1; right < arr.length; right++) {
                max = Math.max(max, arr[right]);
            }
            arr[left] = max;
        }
        arr[arr.length -1] = -1;
        return arr;
    }
}
