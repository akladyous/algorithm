package binarySearch.binary_search;

import java.util.List;

public class FirstTrueInSortedBooleanArray {
    public static void main(String[] args) {
        System.out.println(findBoundary(List.of(false, false, false, true, true, true)));
    }

    // [ F, F, F, T, T ,T ]
    // size 6 - middle = (0 + 5) / 2 = 2
    public static int findBoundary(List<Boolean> arr) {
        int left = 0;
        int right = arr.size() - 1;
        int boundary = -1;
        while ( left <= right ) {
            int middle = left + ( right - left ) / 2;
            if ( arr.get(middle) ) {
                boundary = middle;
                right = middle - 1;
            } else {
                left = middle + 1;
            }
        }
    return boundary;
    }
}
