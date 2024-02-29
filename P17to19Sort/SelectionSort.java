package P17to19Sort;

import java.util.Arrays;

public class SelectionSort {
  public static void main(String[] args) {
    int[] arr = { 5, 7, 3, 2, 8 };
    selectionSort(arr);
    System.out.println(Arrays.toString(arr));
  }

  static void selectionSort(int[] arr) {
    for (int i = 0; i < arr.length; i++) {
      // find the max item in the remaining array and swap with correct index

      // find the max item in the remaining array
      int maxIndex = 0;
      int last = arr.length - i - 1;
      for (int j = 0; j <= last; j++) {
        if (arr[j] > arr[maxIndex]) {
          maxIndex = j;
        }
      }

      // swap with correct index
      int temp = arr[maxIndex];
      arr[maxIndex] = arr[last];
      arr[last] = temp;
    }
  }
}
