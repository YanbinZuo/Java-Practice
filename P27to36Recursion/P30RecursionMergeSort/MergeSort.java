package P30RecursionMergeSort;

import java.util.Arrays;

public class MergeSort {
  public static void main(String[] args) {
    int[] arr = {4,1,6,2,7,9};
    int[] ans = mergeSort(arr);
    System.out.println(Arrays.toString(arr));
    System.out.println(Arrays.toString(ans));
  }

  static int[] mergeSort(int[] arr) {
    int n = arr.length;
    if(n == 1) {
      return arr;
    }

    int mid = n / 2;

    int[] left = mergeSort(Arrays.copyOfRange(arr, 0, mid));
    int[] right = mergeSort(Arrays.copyOfRange(arr, mid, n));

    return merge(left, right);
  }

  static int[] merge(int[] first, int[] second) {
    int[] ans = new int[first.length + second.length];
    int i = 0;
    int j = 0;
    int k = 0;
    while(i < first.length && j < second.length) {
      if(first[i] < second[j]) {
        ans[k] = first[i];
        i++;
      } else {
        ans[k] = second[j];
        j++;
      }
      k++;
    }

    // it may be possible that one of the arrays is not complete
    // copy the remaining elements
    while(i < first.length) {
      ans[k] = first[i];
      i++;
      k++;
    }
    while(j < second.length) {
      ans[k] = second[j];
      j++;
      k++;
    }

    return ans;
  }
}
