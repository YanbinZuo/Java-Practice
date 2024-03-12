package P15BSInterviewQs;

public class Ceiling {
  public static void main(String[] args) {
    int[] arr = {2,3,5,9,14,16,18};
    int target = 15;
    int ans = celling(arr, target);
    System.out.println(ans);
  }

  // return the index of smallest number >= target
  // if the target is greater than the greatest number in the array, return -1
  // hint: very similar to BS, but return start instead of -1 if not found
  static int celling(int[] arr, int target) {
    if(target > arr[arr.length-1]) {
      return -1;
    }
    int start = 0;
    int end = arr.length - 1;
    while(start <= end) {
    int mid = start + (end - start) / 2;
      if(arr[mid] == target) {
        return mid;
      }
      if(target > arr[mid]) {
        start = mid + 1;
      } else {
        end = mid - 1;
      }
    }
    return start;
  }
}
