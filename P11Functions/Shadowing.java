package P11Functions;

public class Shadowing {
  // static is object independent
  static int x = 90;  // this will shadowed in line 10
  public static void main(String[] args) {
    System.out.println(x);  // 90
    int x = 40; // the class variable at line 4 is shadowed by this
    // if scope is overlapping, the variable with the higher level scope will be hidden
    System.out.println(x);  // 40
    fun();  // 90
  }

  static void fun() {
    System.out.println(x);
  }
}
