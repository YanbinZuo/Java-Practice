package P14BinarySearch;

public class BinarySearch {
  public static void main(String[] args) {
      // arr have to be sorted in ascending order
      int[] arr = {-9, -5, 0, 1, 3, 6, 9};
      int target = 3;
      int ans = binarySearch(arr, target);
      System.out.println(ans);
  }

  // return the index
  // return -1 if it does not exist
  static int binarySearch(int[] arr, int target) {
    int start = 0;
    int end = arr.length - 1;
    while(start <= end) {
      // int mid = (start + end) / 2  // => might be possible that (start + end) exceeds the range of int in Java
      int mid = start + (end - start) / 2;
      if(target == arr[mid]) {
        return mid;
      }
      if(target > arr[mid]) { // target is in right side
        start = mid + 1;
      } else {  // target is in left side
        end = mid - 1;
      }
    }
    return -1;
  }
}
