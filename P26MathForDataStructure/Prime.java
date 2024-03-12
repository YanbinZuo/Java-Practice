package P26MathForDataStructure;

public class Prime {
  public static void main(String[] args) {
    System.out.println(isPrime(9));
  }

  static boolean isPrime(int n) {
    if( n<=1) {
      return false;
    }
    int i = 2;
    while(i * i <= n) {
      if(n % i == 0) {
        return false;
      }
      i++;
    }
    return true;
  }
}
