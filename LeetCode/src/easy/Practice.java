package easy;

import java.util.Arrays;
import java.util.HashMap;

public class Practice {
  public static void main(String[] args) {
    String s1 = "please refer to the document";
    String s2 = "good morning madam, How can I assist you today?";

    int i = 0;

  }


static int palindromeBoundaries(String s, int index) {
  /*
    1) (palindrome length - 1)
       helps us determine how many characters we need to move from
       the center towards the left to find the starting index of the palindrome.

    2) (palindrome length - 1) / 2
       calculates the number of characters to move left
       from the center to reach the start index of the palindrome.

    3) subtract the current index `i` from step 2 `( len - 1) / 2`
       to find the start index of the longest palindrome substring.

    Example - [ EDGE CASE 1  `ODD LENGTH` ]
    good morning madam, How can i assist you today?
                   ↑ i = 15
                   palindrome size 5
                   1) (palindrome length - 1)
                      5 - 1 = `4`
                   2) (palindrome length - 1) / 2
                      (5 - 1) / 2 = `2` -> is the number of characters to move left
                   3) subtract the current index `i` from step 2 `( len-1) / 2`
                      index = 15
                      index - 2 `resulting in step 2`
                      move 2 characters to find the start index of the longest palindrome substring.

    Example - [ EDGE CASE 1  `EVEN LENGTH` ]
    sunny day, peep of joy.
                ↑ i = 12
                   palindrome size 4
                   1) (palindrome length - 1)
                      4 - 1 = `3`
                   2) (palindrome length - 1) / 2
                      (4 - 1) / 2 = `1` -> is the number of characters to move left
                   3) subtract the current index `i` from step 2 `( len-1) / 2`
                      index = 12
                      index - 1 `resulting in step 2`
                      move 1 character to find the start index of the longest palindrome substring.
  */
}

  static void _13_test() {
    System.out.println(_13("XXIV")); //24
    System.out.println(_13("MCMXCIV")); //1994
    System.out.println(_13("LVIII")); //58
  }

  static int _13(String s) {
    int currentValue = 0;
    int prevValue = 0;
    int result = 0;
    for (int i = s.length() - 1; i >= 0; i--) {
      switch (s.charAt(i)) {
        case 'I' -> currentValue = 1;
        case 'V' -> currentValue = 5;
        case 'X' -> currentValue = 10;
        case 'L' -> currentValue = 50;
        case 'C' -> currentValue = 100;
        case 'D' -> currentValue = 500;
        case 'M' -> currentValue = 1000;
      }
      if (currentValue >= prevValue) {
        result += currentValue;
      } else {
        result -= currentValue;
      }
      prevValue = currentValue;
    }
    return result;
  }

  static void _1_test() {
    int[] result;

    result = _1(new int[]{2, 7, 11, 15}, 9);
    System.out.println(Arrays.toString(result));

    result = _1(new int[]{3, 1, 5, 6, 4, 3}, 6);
    System.out.println(Arrays.toString(result));

    result = _1(new int[]{3, 2, 4}, 6);
    System.out.println(Arrays.toString(result));
  }

  static int[] _1(int[] nums, int target) {
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
    for (int i = 0; i < nums.length; i++) {
      int diff = target - nums[i];
      if (indices.containsKey(diff)) {
        return new int[]{indices.get(diff), i};
      }
      indices.put(nums[i], i);
    }
    return null;
  }


  static void _121_test() {
    int[] prices1 = {2, 1, 2, 1, 0, 1, 2};
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
    while (right < prices.length) {
      if (prices[left] < prices[right]) {
        int profit = prices[right] - prices[left];
        maxProfit = Math.max(maxProfit, profit);
      } else {
        left++;
      }
      right++;
    }
    return maxProfit;
  }
}

