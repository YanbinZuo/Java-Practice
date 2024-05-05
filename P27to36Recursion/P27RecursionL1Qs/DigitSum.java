package P27RecursionL1Qs;

public class DigitSum {
  public static void main(String[] args) {
    System.out.println(sumDigit(1240));
  }

  static int sumDigit(int n) {
    if (n % 10 == n) {
      return n;
    }
    return n % 10 + sumDigit(n / 10);
  }
}
