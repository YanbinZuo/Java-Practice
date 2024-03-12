package P17to20Sort;

import java.util.Arrays;

public class CyclicSort {
  public static void main(String[] args) {
    int[] arr = {3,5,2,1,4};
    cyclicSort(arr);
    System.out.println(Arrays.toString(arr));
  }
  static void cyclicSort(int[] arr) {
    for(int i=0; i<arr.length; i++) {
      while(arr[i] - 1 != i) {
        swap(arr, i, arr[i]-1);
      }
    }
  }

  static void swap(int[] arr, int first, int second) {
    int temp = arr[first];
    arr[first] = arr[second];
    arr[second] = temp;
  }
}
