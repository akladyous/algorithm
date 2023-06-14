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
    */
    int match = 0;
    for (int num: nums) {
      match ^= num;
      System.out.println(Integer.toBinaryString(num));
    }
    return match;
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

