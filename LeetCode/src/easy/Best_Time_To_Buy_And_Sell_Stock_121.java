package easy;

public class Best_Time_To_Buy_And_Sell_Stock_121 {

    public static void main(String[] args) {
        int[] prices1 = {2,1,2,1,0,1,2};
        System.out.println(maxProfit_2(prices1)); // 5

        int[] prices2 = {7, 1, 5, 3, 6, 4};
        System.out.println(maxProfit_2(prices2)); // 5

        int[] prices3 = {1, 2, 3, 3, 1};
        System.out.println(maxProfit_2(prices3)); // 0
    }

    public static int maxProfit(int[] prices) {
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < minPrice) {
                minPrice = prices[i]; // Update the minimum price
            } else if (prices[i] - minPrice > maxProfit) {
                maxProfit = prices[i] - minPrice; // Update the maximum profit
            }
        }
        return maxProfit;
    }

    public static int maxProfit_2(int[] prices) {
        int maxProfit = 0;
        int left = 0;  // buy
        int right = 1; // sell
        while (right < prices.length) {
            if ( prices[left] < prices[right] ) {
                int profit = (prices[right] - prices[left]);
                maxProfit = Math.max(maxProfit, profit);
            } else {
                left = right;
            }
            right ++;
        }
        return maxProfit;
    }

}
