package easy;

import java.util.*;

public class Practice {
  public static void main(String[] args) {
    System.out.println(singleNumber(new int[] {2,2,1}));
    System.out.println(singleNumber(new int[] {4,1,2,1,2}));
  }
  static int singleNumber(int[] nums) {
    /*
    In the context of bitwise XOR (exclusive OR) operation,
    commutativity means that the order of operands does not affect the result.
    In other words, a XOR b is equal to b XOR a. For example:
    1 XOR 2 = 3
    2 XOR 1 = 3

    Both expressions yield the same result, 3, regardless of the order of the operands.
    Associativity means that the grouping of operands does not affect the result.
    In other words, (a XOR b) XOR c is equal to a XOR (b XOR c). For example:

    Binary representation of the numbers:
    4: 100
    1: 001
    2: 010
    1: 001
    2: 010
    If we XOR all these numbers together, we can cancel out the duplicate numbers:
    so performing the XOR operation:
    = (4 ^ 1) ^ 2 ^ 1 ^ 2
    = 5 ^ 2 ^ 1 ^ 2
    = (5 ^ 2) ^ 1 ^ 2
    = 7 ^ 1 ^ 2
    = (7 ^ 1) ^ 2
    = 6 ^ 2
    = 4

    it means, When we XOR two identical numbers,
    the result is 0. So, by XORing all the numbers in the array,
    the duplicate numbers cancel each other out, resulting in 0. Finally,
    when we XOR 0 with the single non-repeated number, we get the non-repeated number itself.

    sample example again: [4, 1, 1, 2, 2]:

    XORing 1 with 1 gives us 0: 1 ^ 1 = 0
    XORing 0 with 2 gives us 2: 0 ^ 2 = 2
    XORing 2 with 2 gives us 0: 2 ^ 2 = 0
    XORing 0 with 4 gives us 4: 0 ^ 4 = 4

    the duplicate numbers 1 and 2 cancel each other out, resulting in 0.
    Finally, XORing 0 with 4 gives us the non-repeated number 4 as the result.
    */
    int uniqueNum = 0;
    for(int num: nums) {
      uniqueNum ^= num;
    }
    return uniqueNum;
  }
  static int bruteForce(int[] nums) {
    int[] counts = new int[10];
    for (int num: nums) {
      counts[num] ++;
    }
    for (int i=0; i < counts.length; i++) {
      if (counts[i] == 1) {
        return i;
      }
    }
    return  -1;
  }


  static int bruteForce2(int[] nums) {
    Map<Integer, Integer> counts = new HashMap<>();
    for (int num: nums) {
      counts.put(num, counts.getOrDefault(num, 0) + 1);
    }
    for (int num: nums) {
      if ( counts.get(num) == 1) {
        return num;
      }
    }
    return  -1;
  }

}

