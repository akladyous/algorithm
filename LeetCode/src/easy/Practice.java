package easy;

import java.util.*;

public class Practice {

  public static void main(String[] args) {
      System.out.println(generate(5));
  }

    static List<List<Integer>> generate(int numRows) {
      List<List<Integer>> pascal = new ArrayList<>();
      for (int i=0; i< numRows; i++) {
          List<Integer> row = new ArrayList<>();
          for (int j=1; j<= i+1 ; j++) {
              if (j == 1 ) {
                  row.add(1);
              } else {

              }
          }
          pascal.add(row);
      }
      return pascal;
    }


}
/*
[
    [1]                 [0, 0, 1, 0, 0]
    [0, 0]              [0, 1, 0, 1, 0]
    [0, 0, 0]           [0, 0, 0, 0, 0]
    [0, 0, 0, 0]        [0, 0, 0, 0, 0]
    [0, 0, 0, 0, 0]     [1, 4, 6, 4, 1]
]
*/
