package P25BitwiseOperators;

public class NoOfDigits {
  public static void main(String[] args) {
    System.out.println(numberOfDigits(10, 2));
  }
  static int numberOfDigits(int n, int b) {
    int ans = (int)(Math.log(n) / Math.log(b)) + 1;
    return ans;
  }
}
