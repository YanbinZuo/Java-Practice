package P27RecursionL1Qs;

public class CountZeros {
  public static void main(String[] args) {
    System.out.println(countZeros(102003));
  }

  static int countZeros(int n) {
    return helper(n, 0);
  }

  static int helper(int n, int count) {
    if(n % 10 == n) {
      return count;
    }

    int rem = n % 10;
    if(rem == 0) {
      count++;
    }
    return helper(n / 10, count);
  }
}
