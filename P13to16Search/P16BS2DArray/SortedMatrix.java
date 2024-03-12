package P16BS2DArray;

import java.util.Arrays;

public class SortedMatrix {
  public static void main(String[] args) {
    // int[][] arr = {
    // { 1, 2, 3, 5 },
    // { 7, 10, 13, 15 },
    // { 20, 21, 35, 49 }
    // };
    // int[][] arr = {
    // { 1, 2, 3, 5 }
    // };
    int[][] arr = {
        { 1, 2 },
        { 5, 6 },
        { 9, 10 },
        { 13, 14 }
    };
    System.out.println(Arrays.toString(search(arr, 5)));
  }

  static int[] search(int[][] matrix, int target) {
    int[] ans = new int[] { -1, -1 };

    // empty array
    if (matrix.length == 0)
      return ans;

    int rows = matrix.length;
    int cols = matrix[0].length;

    // only one row
    if (rows == 1) {
      return binarySearch(matrix, 0, 0, cols - 1, target);
    }

    int cMid = (cols - 1) / 2;
    int rStart = 0;
    int rEnd = rows - 1;

    // run the loop till 2 rows are remaining
    while (rStart < rEnd - 1) { // while this is true it will have more than 2 rows
      int rMid = rStart + (rEnd - rStart) / 2;
      if (target == matrix[rMid][cMid]) {
        return new int[] { rMid, cMid };
      }
      if (target < matrix[rMid][cMid]) {
        rEnd = rMid;
      } else {
        rStart = rMid;
      }
    }

    // now we have two rows
    // using binary search to find the ans in these two rows
    if (target <= matrix[rStart][cols - 1]) {
      return binarySearch(matrix, rStart, 0, cols - 1, target);
    } else {
      return binarySearch(matrix, rStart + 1, 0, cols - 1, target);
    }
  }

  // search in the row provided between the cols provided
  static int[] binarySearch(int[][] matrix, int row, int cStart, int cEnd, int target) {
    while (cStart <= cEnd) {
      int cMid = cStart + (cEnd - cStart) / 2;
      if (target == matrix[row][cMid]) {
        return new int[] { row, cMid };
      }
      if (target < matrix[row][cMid]) {
        cEnd = cMid - 1;
      } else {
        cStart = cMid + 1;
      }
    }
    return new int[] { -1, -1 };
  }

// Internet resources: (need to check)
// Rather than checking in the mid column, if you check in the last column, you'll end up with just 
// one row with the potential answer. Then apply BS just once in that particular row
/*
static int[] search2(int[][] arr, int target) {
    int n = arr.length, m = arr[0].length;

    // apply BS on the last column, this way we can reduce the no of rows in which
    // we want to apply BS to just 1.
    int lb = 0, ub = n - 1, mid;
    while (lb < ub) {
      mid = lb + (ub - lb) / 2;

      if (arr[mid][m - 1] < target) {
        lb = mid + 1;
      } else if (arr[mid][m - 1] > target) {
        ub = mid;
      } else {
        return new int[] { mid, m - 1 };
      }
    }

    // here lb == rb

    int ind = binarySearch(arr[lb], target);
    if (ind != -1)
      return new int[] { lb, ind };
    return new int[] { -1, -1 };
  }
  */
}
