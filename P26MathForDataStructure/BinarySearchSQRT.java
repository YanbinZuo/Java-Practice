package P26MathForDataStructure;

public class BinarySearchSQRT {
  public static void main(String[] args) {
    int n = 40;
    int position = 3;
    double ans = sqrt1(n, position);

    System.out.printf("%.3f", ans);
  }

  // Kunal's version
  // Time: O(long(n))
  static double squrt(int n, int position) {
    int start = 0;
    int end = n;
    while(start <= end) {
      int mid = start + (end - start) / 2;
      if(mid * mid == n) {
        return mid;
      }
      if(mid * mid < n) {
        start = mid + 1;
      } else {
        end = mid - 1;
      }      
    }

    double root = end;
    double inc = 0.1;
    for (int i = 0; i < position; i++) {
      while(root * root < n) {
        root += inc;
      }
      root -= inc;
      inc *= 0.1;
    }

    return root;
  }  

  // my version
  static double sqrt1(int n, int position) {
    int start = 0;
    int end = n;
    while(start <= end) {
      int mid = start + (end - start) / 2;
      if(mid * mid == n) {
        return mid;
      }
      if(mid * mid < n) {
        start = mid + 1;
      } else {
        end = mid - 1;
      }
    }

    int integer = end;
    System.out.println("integer: " + integer);
    double decimal = 1.0;
    double combine = integer;
    for (int i = 1; i <= position; i++) {
      decimal = decimal / 10;
      for (int j = 1; j < 10; j++) {
        double temp = combine + j * decimal;
        if(temp * temp == n) {
          return temp;
        }
        if(temp * temp < n) {
          continue;
        }
        if(temp * temp > n) {
          combine = temp - decimal;
          break;
        }
      }
    }
    return combine;
  }

}
