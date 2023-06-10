package easy;

public class Practice {
    public static void main(String[] args) {
        testMaxProfit();
    }

    public static void testMaxProfit() {
        int[] prices1 = {2,1,2,1,0,1,2};
        System.out.println(maxProfit(prices1)); // 2

        int[] prices2 = {7, 1, 5, 3, 6, 4};
        System.out.println(maxProfit(prices2)); // 5

        int[] prices3 = {1, 2, 3, 3, 1};
        System.out.println(maxProfit(prices3)); // 0
    }
    public static int maxProfit(int[] prices) {
        int maxProfit = 0;
        int left = 0;
        int right = 0;
        /*
            [2,1,2,1,0,1,2]
             L<R -> false       -> increment Left and Right pointers
            [2,1,2,1,0,1,2]
               L<R -> true      -> update maxProfit with [right - left] 2-1
                                -> increment Right pointer

        */


        return maxProfit;
    }
}
