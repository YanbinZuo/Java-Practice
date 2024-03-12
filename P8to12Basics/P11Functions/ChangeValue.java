package P11Functions;

import java.util.Arrays;

public class ChangeValue {
  public static void main(String[] args) {
    int[] arr = {1,2,3,45};
    change(arr);
    System.out.println(Arrays.toString(arr));
  }

  static void change(int[] nums) {
    // if you make a change to the object via this ref variable,
    // same object will be changed
    nums[0] = 99;
  }
}
