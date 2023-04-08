package binarySearch.binary_search;

import java.util.List;

public class VanillaBinarySearch {
    public static void main(String[] args) {
        System.out.println(binarySearch(List.of(1,2,3,4,5,6,7,8,9,10)), 8);
    }



    public static int binarySearch(List<Integer> arr, int target) {
        int left = 0;
        int right = arr.size() - 1;

        while ( left <= right ) {
            int middle = left + (right - left) / 2; // use `(right - left) /2` to prevent `left + right` potential overflow

        }


        return -1;
    }
}
