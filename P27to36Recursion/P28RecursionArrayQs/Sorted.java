package P28RecursionArrayQs;

public class Sorted {
  public static void main(String[] args) {
    int[] arr = {1,2,3,6,5};
    System.out.println(isSorted(arr));
  }

  static boolean isSorted(int[] arr) {
    if(arr.length == 0) return true;
    return helper(arr, 0);
  }

  static boolean helper(int[] arr, int index) {
    int n = arr.length;
    // base condition
    if(index == n - 1) {
      return true;
    }
    return arr[index] < arr[index + 1] && helper(arr, index + 1);
  }
}
