package binarySearch.binary_search;

import java.util.List;

public class FindElementInSortedArrayWithDuplicates {
    public static void main(String[] args) {
        System.out.println(findFirstOccurrence(List.of(1, 2, 2, 3, 3, 4, 4, 5, 6, 10, 10, 10, 100), 10));
        //6, 10, 10, 10, 100
    }

    /*
    arr = [1, 3, 3, 3, 3, 6, 10, 10, 10, 100]
                       |                        1st iteration®´
    */
    public static int findFirstOccurrence(List<Integer> arr, int target) {
        int left = 0;
        int right = arr.size() - 1;
        int boundaryIndex = - 1;
        while ( left <= right ) {
            int mid = left + (right - left) / 2;
            if (arr.get(mid) >= target) {
                boundaryIndex = mid;
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return boundaryIndex;
    }
};