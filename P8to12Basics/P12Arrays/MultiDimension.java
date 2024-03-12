package P12Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class MultiDimension {
  public static void main(String[] args) {
    /*
     * 1 2 3
     * 4 5 6
     * 7 8 9
     */

    // row is mandatory, col is not mandatory
    int[][] arr = new int[3][];

    int[][] arr1 = {
        { 1, 2, 3 },
        { 4, 5, 6 },
        { 7, 8, 9 },
    };

    int[][] arr2 = {
        { 1, 2, 3 },
        { 4, 5 },
        { 6, 7, 8, 9 }
    };
    System.out.println(arr.length); // number of rows

    Scanner in = new Scanner(System.in);
    int[][] arr3 = new int[3][2];
    for (int row = 0; row < arr3.length; row++) {
      for (int col = 0; col < arr3[row].length; col++) {
        arr3[row][col] = in.nextInt();
      }
    }
    for (int row = 0; row < arr3.length; row++) {
      for (int col = 0; col < arr3[row].length; col++) {
        System.out.print(arr3[row][col] + " ");
      }
      System.out.println();
    }
    for (int row = 0; row < arr3.length; row++) {
      System.out.println(Arrays.toString(arr3[row]));
    }
    for(int[] a: arr3) {
      System.out.println(Arrays.toString(a));
    }
  }
}
