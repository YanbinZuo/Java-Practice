package P28RecursionArrayQs;

public class RBS {
  public static void main(String[] args) {
    int[] arr = {5,6,7,8,9,1,2,3};
    System.out.println(search(arr, 3, 0, arr.length - 1));
  }

  static int search(int[] arr, int target, int s, int e) {
    if(s>e) {
      return -1;
    }
    int m = s + (e - s) / 2;
    if(target == arr[m]) {
      return m;
    }
    if(arr[s] <= arr[m]) {
      if(target >= arr[s] && target < arr[m]) {
        e = m - 1;
      } else {
        s = m + 1;
      }
    } else {
      if(target > arr[m] && target <= arr[e]) {
        s = m + 1;
      } else {
        e = m -1;
      }
    }
    return search(arr, target, s, e);
  }
}
