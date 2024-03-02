package P23IntroToRecursion;

public class Fibo {
  public static void main(String[] args) {
    System.out.println(fibo(6));
  }

  static int fibo(int n) {
    // base case
    if(n < 2) {
      return n;
    }

    // this is not tail recursion because there is an extra step of addition and returning
    return fibo(n-1) + fibo(n - 2);
  }
}
