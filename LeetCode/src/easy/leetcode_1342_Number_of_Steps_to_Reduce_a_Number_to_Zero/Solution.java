package easy.leetcode_1342_Number_of_Steps_to_Reduce_a_Number_to_Zero;

public class Solution {

    public static int number_of_Steps_to_Reduce_a_Number_to_Zero_1342(int num) {
        int steps = 0;
        while (num != 0) {
            if (num % 2 == 0) {
                num /= 2;
            } else {
                num --;
            }
            steps ++;
        }
        return steps;
    };
}
