package practice;

import easy.leetcode_1_twoSum.Leetcode_1;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class PracticeTest {

    @Test
    void testTwoSum() {
        Leetcode_1 solution = new Leetcode_1();

        int[] result = new int[2];
        result = solution.leetcode_1_twoSum(new int[]{2,7,11,15}, 9);
        System.out.println(Arrays.toString(result));
        assertArrayEquals( new int[]{0,1}, result);

        result = solution.leetcode_1_twoSum(new int[]{3,1,5,6,4,3}, 6);
        System.out.println(Arrays.toString(result));
        assertArrayEquals( new int[]{1,2}, result);

        result = solution.leetcode_1_twoSum(new int[]{3,2,4}, 6);
        System.out.println(Arrays.toString(result));
        assertArrayEquals( new int[]{1,2}, result);
    }
}