package easy.leetcode_412_FizzBuzz;
import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static void main(String[] args) {
        int n = 9;
        List<String> fizzBuzzList = fizzBuzz(n);
        System.out.println(fizzBuzzList);

    }
    public static List<String> fizzBuzz(int n) {
        List<String> output = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                output.add("FizzBuzz");
            } else if (i % 3 == 0) {
                output.add("Fizz");
            } else if (i % 5 == 0) {
                output.add("Buzz");
            } else {
                output.add(Integer.toString(i));
            }
        }
        return output;
    }


}
