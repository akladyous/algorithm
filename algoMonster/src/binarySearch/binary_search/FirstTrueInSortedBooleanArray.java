package binarySearch.binary_search;

import java.util.List;

public class FirstTrueInSortedBooleanArray {
    public static void main(String[] args) {
        System.out.println(findBoundary(List.of(false, false, false, false, true, true, true)));
    }

    // [ F, F, F, T, T ,T ]
    // size 6 - middle = (0 + 5) / 2 = 2
    public static int findBoundary(List<Boolean> arr) {
        int left = 0;
        int right = arr.size() - 1;
        int boundaryIndex = - 1;
        while ( left <= right ) {
            int mid = left + (right - left) / 2;
            if (arr.get(mid)) {
                boundaryIndex = mid;
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return boundaryIndex;
    }
}
