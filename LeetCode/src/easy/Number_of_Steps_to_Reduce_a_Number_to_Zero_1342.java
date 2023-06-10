package easy;

public class Number_of_Steps_to_Reduce_a_Number_to_Zero_1342 {
    public static void main(String[] args) {
    }

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
