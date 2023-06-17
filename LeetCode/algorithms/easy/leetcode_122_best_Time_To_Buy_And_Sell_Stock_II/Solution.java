package easy.leetcode_122_best_Time_To_Buy_And_Sell_Stock_II;

public class Solution {
    public static void main(String[] args) {
        int[] prices1 = {7, 1, 5, 3, 6, 4};
        int maxProfit1 = maxProfit(prices1);
        System.out.println(maxProfit1); // Output: 7

        int[] prices2 = {1, 2, 3, 4, 5};
        int maxProfit2 = maxProfit(prices2);
        System.out.println(maxProfit2); // Output: 4

        int[] prices3 = {7, 6, 4, 3, 1};
        int maxProfit3 = maxProfit(prices3);
        System.out.println(maxProfit3); // Output: 0
    }

    public static int maxProfit(int[] prices) {
        int maxProfit = 0;

        for (int i = 1; i < prices.length; i++) {
            if (prices[i] > prices[i - 1]) {
                maxProfit += prices[i] - prices[i - 1];
            }
        }
        return maxProfit;
    }
}
