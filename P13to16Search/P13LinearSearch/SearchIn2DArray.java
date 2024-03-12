package P13LinearSearch;

import java.util.Arrays;

public class SearchIn2DArray {
  public static void main(String[] args) {
    int[][] arr = {
      {1,2,3}, 
      {4,5},
      {8,7,55,4}
    };
    int target = 3;
    int[] ans = search(arr, target);
    System.out.println(Arrays.toString(ans));
  }

  static int max(int[][] arr) {
    int max = Integer.MIN_VALUE;
    for(int[] rows: arr) {
      for(int ele: rows) {
        if(ele > max) {
          max = ele;
        }
      }
    }

    return max;
  }


  static int[] search(int[][] arr, int target) {
    if(arr.length == 0) {
      return new int[]{-1,-1};
    }

    for (int i = 0; i < arr.length; i++) {
        for (int j = 0; j < arr[i].length; j++) {
          if(arr[i][j] == target) {
            return new int[]{i, j};
          }
        }
    }
    return new int[]{-1,-1};
  }
}
