package P11Functions;

import java.util.Arrays;

public class VarArgs {
  
  public static void main(String[] args) {
    fun(2,3,4);
    multiple(2, 3, "Kunal", "Jimmy");
  }

  // the ... have to be in the end
  static void multiple(int a, int b, String ...s) {
    System.out.println(Arrays.toString(s));
  }

  // use ... if don't know how many parameters should pass
  static void fun(int ...v) {
    System.out.println(Arrays.toString(v));
  }
}
