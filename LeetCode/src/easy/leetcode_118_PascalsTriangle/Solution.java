package easy.leetcode_118_PascalsTriangle;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static void main(String[] args) {
        System.out.println(generate(5));
    }

    static  List<List<Integer>> generate(int numRows) {
      List<List<Integer>> triangle = new ArrayList<>();
        if (numRows <= 0) {
            return triangle;
        }

        ArrayList<Integer> firstRow = new ArrayList<>();
        firstRow.add(1);
        triangle.add(firstRow);

        for (int i=1; i < numRows; i++) {
            List<Integer> tempRow = triangle.get(i - 1);
            List<Integer> currRow = new ArrayList<>();
            currRow.add(1);
            for (int j= 1; j < i; j++) {
                currRow.add( tempRow.get(j-1) + tempRow.get(j) );
            };
            currRow.add(1);
            triangle.add(currRow);
        }
        return triangle;
    }

}
