package binarySearch.binary_search;

import java.util.List;

public class FirstTrueInSortedBooleanArray {
    public static void main(String[] args) {

    }

    // [ F, F, F, T, T ,T ]
    // size 6 - middle = (0 + 5) / 2 = 2
    public static int findBoundary(List<Boolean> arr) {
        int left = 0;
        int right = arr.size() - 1;
        int boundary = -1;
        while ( left <= right ) {
            int middle = left + ( right - left ) / 2;

        }

    }
}
