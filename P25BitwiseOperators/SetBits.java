package P25BitwiseOperators;

public class SetBits {
  public static void main(String[] args) {
    int n = 10;
    System.out.println(Integer.toBinaryString(n));

    int count = 0;
    while (n > 0) {
      count++;
      int rightSetBit = n & (-n);
      n = n - rightSetBit;
    }

    // second method:
    // while(n > 0) {
    //   count++;
    //   n = n & (n - 1); 
    // }

    System.out.println(count);
  }
}
