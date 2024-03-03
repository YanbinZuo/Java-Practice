package P24TimeSpaceComplexity;

public class Fibo {
  public static void main(String[] args) {
     for (int i = 0; i < 42; i++) {
        System.out.print(fibo(i) + " ");
     }
     System.out.println();

     for (int i = 0; i < 50; i++) {
      System.out.print(fiboFormula(i) + " ");
     }
     System.out.println();

     System.out.println(fibo(45));

    //  int powTwo = 1;
    //  for (int i = 1; i < 20; i++) {
    //   powTwo = powTwo * 2;
    //   System.out.print(powTwo + " ");
    //  }
  }

  static long fiboFormula(int n) {
    double a1 =(1 + Math.sqrt(5)) / 2;
    double a2 =(1 - Math.sqrt(5)) / 2;
    double ans = (Math.pow(a1, n) - Math.pow(a2, n)) / Math.sqrt(5);
    return (long)(ans);
  }

  static long fibo(int n) {
    // base condition
    if(n < 2) {
      return n;
    }
    return fibo(n-1) + fibo(n-2);
  }
}
