import java.util.Arrays;

public class MedianOfTwoSortedArrays4 {
    public static void main(String[] args) {
        System.out.println(findMedianSortedArrays(new int[]{1,2},new int[]{3,4}));
//        System.out.println(findMedianSortedArrays(new int[]{1,3,5},new int[]{2,3,4,5}));

    }
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] merged = new int[nums1.length + nums2.length];

        int nums1Position = 0;
        int nums2Position = 0;
        int mergedPosition = 0;

        while ( nums1Position < nums1.length && nums2Position < nums2.length ) {
            if (nums1[nums1Position] < nums2[nums2Position]) {
                merged[mergedPosition++] = nums1[nums1Position++];
            } else {
                merged[mergedPosition++] = nums2[nums2Position++];
            }
        }
        while ( nums1Position < nums1.length) {
            merged[mergedPosition++] = nums1[nums1Position++];
        }
        while ( nums2Position < nums2.length) {
            merged[mergedPosition++] = nums2[nums2Position++];
        }

        System.out.println("merged array : " + Arrays.toString(merged));
        if ( merged.length % 2 == 0 ) {
            return (float) ( merged[merged.length/2] + merged[merged.length/2 - 1] ) /2;
        } else {
            return (float) merged[ merged.length /2 ] ;
        }

    }
}
