package easy;

import easy.leetcode_1_twoSum.Solution;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PracticeTest {

    @Test
    void testTwoSum() {
        Solution solution = new Solution();
        int[] solArray = new int[]{0,1};
        int[] testArray = new int[] {2,7,11,15};
        int[] result = solution.twoSum(testArray, 9);
        assertArrayEquals( solArray, result);
    }
}