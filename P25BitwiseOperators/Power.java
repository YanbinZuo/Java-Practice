package P25BitwiseOperators;

public class Power {
  public static void main(String[] args) {
    int a = 3;
    int n = 6;

    int base = a;
    int ans = 1;
    while(n > 0) {
      int lastDigit = n & 1;
      if(lastDigit == 1) {
        ans = ans * base;
      }
      n = n >> 1;
      base *= base;
    }

    System.out.println(ans);
  }
}
