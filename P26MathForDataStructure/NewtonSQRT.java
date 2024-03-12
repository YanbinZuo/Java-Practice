package P26MathForDataStructure;

public class NewtonSQRT {
  public static void main(String[] args) {
    System.out.println(sqrt(40, 0.1));
  }

  static double sqrt(double n, double precision) {
    double x = n;
    double root;

    while(true) {
      root = 0.5 * (x + (n/x));
      if(Math.abs(root - x) < precision) {
        break;
      }
      x = root;
    }
    return root;
  }
}
