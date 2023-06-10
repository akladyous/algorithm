package easy;

public class Practice {
    public static void main(String[] args) {
        _121_test();
    }

    static void _1_test(){
        _1()
    }
    static int[] _1(int[] nums, int target){

    }



    static void _121_test() {
        int[] prices1 = {2,1,2,1,0,1,2};
        System.out.println(_121(prices1)); // 2

        int[] prices2 = {7, 1, 5, 3, 6, 4};
        System.out.println(_121(prices2)); // 5

        int[] prices3 = {1, 2, 3, 3, 1};
        System.out.println(_121(prices3)); // 0
    }
    static int _121(int[] prices) {
        int maxProfit = 0;
        int left = 0;
        int right = 1;
        /*
            - increment the left pointer
            - each iteration increment the right pointer by one in all cases.
            [2,1,2,1,0,1,2]
             L<R -> false       -> increment Left and Right pointers
            [2,1,2,1,0,1,2]
               L<R -> true      -> update maxProfit with [right - left] 2-1
                                -> increment Right pointer
        */
        while ( right < prices.length ) {
            if ( prices[left] < prices[right] ) {
                int profit = prices[right] - prices[left];
                maxProfit = Math.max(maxProfit, profit);
            } else {
                left ++;
            }
            right ++;
        }
        return maxProfit;
    }
}
