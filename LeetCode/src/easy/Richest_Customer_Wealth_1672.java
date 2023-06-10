package easy;

public class Richest_Customer_Wealth_1672 {
    public static void main(String[] args) {
        int[][] accounts1 = {{1, 2, 3}, {3, 2, 1}};
        int maxWealth1 = maximumWealth(accounts1);
        System.out.println("Richest customer wealth: " + maxWealth1); // Output: 6

        int[][] accounts2 = {{1, 5}, {7, 3}, {3, 5}};
        int maxWealth2 = maximumWealth(accounts2);
        System.out.println("Richest customer wealth: " + maxWealth2); // Output: 10

        int[][] accounts3 = {{2, 8, 7}, {7, 1, 3}, {1, 9, 5}};
        int maxWealth3 = maximumWealth(accounts3);
        System.out.println("Richest customer wealth: " + maxWealth3); // Output: 17
    }

    public static int maximumWealth(int[][] accounts) {
        int maxWealth = 0;
        for(int customer=0; customer<accounts.length; customer++) {
            int customerWealth = 0;
            for(int account=0; account<accounts[0].length; account++) {
                customerWealth += accounts[customer][account];
            }
            if (customerWealth > maxWealth) {
                maxWealth = customerWealth;
            }
        }
        return maxWealth;
    }

}
