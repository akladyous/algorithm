package easy;

import java.util.Arrays;
import java.util.HashMap;

public class Practice {
    public static void main(String[] args) {
        _13_test();
    }


    static void _13_test(){
        String romanNumeral1 = "XXIV";
        int result1 = _13(romanNumeral1);
        System.out.println(result1);

        String romanNumeral2 = "MCMLXXIV";
        int result2 = _13(romanNumeral2);
        System.out.println(result2);
    }
    static int _13(String s) {

        for (int i=0; i < s.length(); i++) {
            switch (s.charAt(i)) {

            }
        }
    }

    static void _1_test(){
        int[] result;

        result = _1(new int[]{2,7,11,15}, 9);
        System.out.println(Arrays.toString(result));

        result = _1(new int[]{3,1,5,6,4,3}, 6);
        System.out.println(Arrays.toString(result));

        result = _1(new int[]{3,2,4}, 6);
        System.out.println(Arrays.toString(result));
    }
    static int[] _1(int[] nums, int target){
        HashMap<Integer, Integer> indices = new HashMap<>();
        /*
            [2,7,11,15], 9
            9 - 2 = 7
            {}
            check if hashmap container 7, then return index of 7 and current index in the loop
            otherwise add the first number in the array and its index to the hashmap
            {2:0}
            2nd iteration 9-7 = 2 -> 2 in hashmap so return the index of 2 from the hashmap and the current index
        */
        for (int i = 0; i < nums.length; i++){
            int diff = target - nums[i];
            if (indices.containsKey(diff)) {
                return new int[] { indices.get(diff), i };
            }
            indices.put(nums[i], i);
        }
        return null;
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

