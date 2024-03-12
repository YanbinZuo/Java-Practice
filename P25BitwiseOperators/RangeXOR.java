package P25BitwiseOperators;

public class RangeXOR {
  public static void main(String[] args) {
    int a = 3;
    int b = 9;
    int ans = rangeXor(a, b);
    System.out.println(ans);

    // only for check, will give time limit exceeded(TLE) for large number
    int ans2 = 0;
    for (int i = a; i <= b; i++) {
      ans2 ^= i;
    }
    System.out.println(ans2);
  }

  // this gives xor from 0 to a 
  static int xorToNum(int a) {
    if(a % 4 == 0) {
      return a;
    } else if(a % 4 == 1) {
      return 1;
    } else if(a % 4 == 2) {
      return a+1;
    } else {
      return 0;
    }
  }

  // range xor from a to b
  static int rangeXor(int a, int b) {
    return xorToNum(b) ^ xorToNum(a-1);
  }
}
