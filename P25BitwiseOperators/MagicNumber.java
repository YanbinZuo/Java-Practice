package P25BitwiseOperators;

public class MagicNumber {
  public static void main(String[] args) {
    System.out.println(magicNumber(6));
  }

  static int magicNumber(int n) {
    int i = 1;
    int sum = 0;
    // 
    while(n > 0) {
      int lastDigit = n & 1;
      sum += lastDigit * Math.pow(5, i);
      n = n >> 1;
      i++;
    }
    return sum;
  }
}
