package P15BSInterviewQs;

public class Floor {
  public static void main(String[] args) {
    int[] arr = {2,3,5,9,14,16,18};
    int target = 19;
    int ans = floor(arr, target);
    System.out.println(ans);
  }

  // return the index of largest no <= target
  // if the target is smaller than the smallest number in the array, return -1
  // hint: very similar to BS, but return end instead of -1 if not found
  static int floor(int[] arr, int target) {
    if(target < arr[0]) {
      return -1;
    }

    int start = 0;
    int end = arr.length - 1;
    while(start <= end) {
    int mid = start + (end - start) / 2;
      if(arr[mid] == target) {
        return mid;
      }
      if(arr[mid] < target) {
        start = mid + 1;
      } else {
        end = mid - 1;
      }
    }
    return end;
  }
}
