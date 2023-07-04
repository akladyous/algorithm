import java.util.Arrays;

public class CombineTwoArrays {
    public static void main(String[] args) {
     int[] combined = combineArrays(new int[]{1,2,3,4,5}, new int[]{6,7,8,9,10});
        System.out.println(Arrays.toString(combined));
    }
    public static int[] combineArrays(int[] arr1, int[] arr2) {
        int[] combined = new int[arr1.length + arr2.length];
        System.arraycopy(arr1, 0, combined, 0, arr1.length);
        System.arraycopy(arr2, 0, combined, arr1.length, arr2.length);
        return combined;
    }
}
