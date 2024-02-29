package P22PatternTrick;

public class Main {
  public static void main(String[] args) {
    // pattern2(4);
    // pattern5(5);
    // pattern28(5);
    // pattern30(5);
    // pattern31(4);
    pattern31V2(4);
  }

  static void pattern31(int n) {
    for (int i = 1; i <= 2 * n - 1; i++) {
      int end = i <= n ? n - i + 1 : i - n + 1;
      for (int j = n; j > end; j--) {
        System.out.print(j + " ");
      }
      for (int j = 1; j <= end * 2 - 1; j++) {
        System.out.print(end + " ");
      }
      for (int j = end + 1; j <= n; j++) {
        System.out.print(j + " ");
      }
      System.out.println();
    }
  }

  static void pattern31V2(int n) {
    int length = 2 * n - 1;
    for (int i = 1; i <= length; i++) {
      for (int j = 1; j <= length; j++) {
        int num = n - Math.min(Math.min(i - 1, j - 1), Math.min(length - i, length - j));
        System.out.print(num + " ");
      }
      System.out.println();
    }
  }

  static void pattern30(int n) {
    for (int i = 1; i <= n; i++) {
      int space = (n - i) * 2;
      for (int j = 1; j <= space; j++) {
        System.out.print(" ");
      }
      for (int k = i; k >= 1; k--) {
        System.out.print(k + " ");
      }
      for (int l = 2; l <= i; l++) {
        System.out.print(l + " ");
      }
      System.out.println();
    }
  }

  static void pattern28(int n) {
    for (int i = 1; i <= 2 * n - 1; i++) {
      int totalStartsInRow = i <= n ? i : 2 * n - i;
      int spaceBeforeStars = n - totalStartsInRow;
      for (int j = 1; j <= spaceBeforeStars; j++) {
        System.out.print(" ");
      }
      for (int k = 1; k <= totalStartsInRow; k++) {
        System.out.print("* ");
      }
      System.out.println();
    }
  }

  static void pattern5(int n) {
    for (int i = 1; i <= 2 * n - 1; i++) {
      int totalColsInRow = i <= n ? i : 2 * n - i;
      for (int j = 1; j <= totalColsInRow; j++) {
        System.out.print("*");
      }
      System.out.println();
    }

    // solution 2:
    // for (int i = 0; i < 2 * n; i++) {
    // int totalColsInRow = i < n ? i + 1 : 2 * n - i;
    // for (int j = 0; j < totalColsInRow; j++) {
    // System.out.print("*");
    // }
    // System.out.println();
    // }
  }

  static void pattern2(int n) {
    for (int row = 1; row <= n; row++) {
      // for every row, tun the col
      for (int col = 1; col <= row; col++) {
        System.out.print("*");
      }
      // when one row is printed, we need to add a newline
      System.out.println();
    }
  }

  static void pattern3(int n) {
    for (int i = 1; i <= n; i++) {
      for (int j = 1; j <= n - i + 1; j++) {
        System.out.print("*");
      }
      System.out.println();
    }
  }
}
