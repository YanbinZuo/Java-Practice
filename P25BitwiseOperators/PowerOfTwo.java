package P25BitwiseOperators;

public class PowerOfTwo {
  public static void main(String[] args) {
    // int n = 0;  // note: fix for n = 0;
    int n = 14;
    boolean ans = (n & (n-1)) == 0;
    System.out.println(ans);
  }
}
