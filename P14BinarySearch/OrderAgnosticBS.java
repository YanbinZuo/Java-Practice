package P14BinarySearch;

public class OrderAgnosticBS {
  public static void main(String[] args) {
    int[] arr = { -9, -5, 0, 3, 6, 7, 9 };
    int[] arr1 = { 9, 8, 7, 4, 0, -3, -5 };
    int target = 7;
    int ans = orderAgnosticBS(arr, target);
    int ans1 = orderAgnosticBS(arr1, target);
    System.out.println(ans);
    System.out.println(ans1);
  }

  static int orderAgnosticBS(int[] arr, int target) {
    int start = 0;
    int end = arr.length - 1;

    // find whether the array is sorted in ascending or descending
    boolean isAsc = arr[start] < arr[end];

    while (start <= end) {
      int mid = start + (end - start) / 2;
      if (arr[mid] == target) {
        return mid;
      }

      if (isAsc) {  // ascending order
        if (target > arr[mid]) {
          start = mid + 1;
        } else {
          end = mid - 1;
        }
      } else {  // descending order
        if (target < arr[mid]) {
          start = mid + 1;
        } else {
          end = mid - 1;
        }
      }
    }
    return -1;
  }
}
