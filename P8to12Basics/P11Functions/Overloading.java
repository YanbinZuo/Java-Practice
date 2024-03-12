package P11Functions;

import java.util.Arrays;

public class Overloading {
  public static void main(String[] args) {
    // in compile time, it will determine which function to run
    fun(3);
    fun("Jimmy");

    int ans = sum(3, 5);
    System.out.println(ans);
    System.out.println(sum(3,4,5));

    demo("Hi", "Hello");
    demo(1,2,3);
  }

  static void demo(int ...v) {
    System.out.println(Arrays.toString(v));
  }

  static void demo(String ...v) {
    System.out.println(Arrays.toString(v));
  }

  static int sum(int a, int b) {
    return a + b;
  }

  static int sum(int a, int b, int c) {
    return a + b + c;
  }

  static void fun(int a) {
    System.out.println("first one");
    System.out.println(a);
  }

  static void fun(String name) {
    System.out.println("second one");
    System.out.println(name);
  }
}
