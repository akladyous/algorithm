package binarySearch.binary_search;

import java.util.List;

public class FindElementInSortedArrayWithDuplicates {
    public static void main(String[] args) {
        System.out.println(findFirstOccurrence(List.of(1, 3, 3, 3, 3, 6, 10, 10, 10, 100), 3));
    }
    /*
    arr = [1, 3, 3, 3, 3, 6, 10, 10, 10, 100]
                       |                        1st iteration
    */
    public static int findFirstOccurrence(List<Integer> arr, int target) {
        int left = 0;
        int right = arr.size() - 1;
        int targetIndex = -1;
        while ( left <= right ) {
            int middle = left + ( right - left ) / 2;
            if ( arr.get(middle) == target ) {
                targetIndex = middle;
                right = middle - 1;
            } else if (arr.get(middle) > target) {
                right = middle - 1;
            } else {
                left = middle + 1;
            }
        }
        return targetIndex;
    }
}
