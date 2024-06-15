package P49P55Trees.P53BigIntegerBigDecimal;

import java.math.BigDecimal;
import java.math.BigInteger;

public class Main12 {
  public static void main(String[] args) {
    BI();
  }

  static void BI() {
    int a = 30;
    int b = 67;

    BigInteger B = BigInteger.valueOf(6);   // convert int/long to BI
    int c = B.intValue();   // convert BI to int

    // large number
    BigInteger C = new BigInteger("2168546156841365413165418916514");
    BigInteger X = new BigInteger("3854234615351");

    // constants
    BigInteger D = BigInteger.TEN;

    // operations
    BigInteger s = C.add(X);

    BigInteger m = C.multiply(X);

    BigInteger sub = X.subtract(X);

    BigInteger d = C.divide(X);

    BigInteger rem = C.remainder(X);

    if(X.compareTo(C) < 0) {
      System.out.println("Yes");
    }

    System.out.println(Factorial.fact(100));
  }

  static void BD() {
    double x = 0.03;
    double y = 0.04;
    double answer = y - x;
    System.out.println(answer);

    BigDecimal X = new BigDecimal("0.03");
    BigDecimal Y = new BigDecimal("0.04");
    BigDecimal ans = Y.subtract(X);
    System.out.println(ans);

    BigDecimal a = new BigDecimal("5465489351.31564561");
    BigDecimal b = new BigDecimal("6541655486.15545131654");

    // operations
    System.out.println(b.add(a));
    System.out.println(b.subtract(a));
    System.out.println(b.multiply(a));
    System.out.println(b.pow(2));
    System.out.println(b.negate());

    // constants
    BigDecimal con = BigDecimal.ONE;
  }
}
