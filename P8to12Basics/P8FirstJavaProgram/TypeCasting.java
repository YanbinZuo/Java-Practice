package P8FirstJavaProgram;

import java.util.Scanner;

public class TypeCasting {
  public static void main(String[] args) {
    // Scanner input = new Scanner(System.in);
    // float num = input.nextFloat();
    // System.out.println(num);

    // type casting
    int num = (int) (54.34f);
    System.out.println(num);

    // automatic type promotion in expressions
    int a = 257;
    // byte is 0 - 255
    // 257 % 256 = 1
    byte b = (byte) (a);
    System.out.println(b);

    byte c = 40;
    byte d = 50;
    byte e = 100;
    // c * d = 2000 -> auto type promotion, auto convert to int if byte * byte
    int f = c * d / e;
    System.out.println(f);

    byte g = 50;
    // byte * byte, auto convert to int, so cannot assign to byte, so get error
    // NOTE: ERROR
    // g = g * 2;

    int num1 = 'A';
    System.out.println(num1);

    byte h = 43;
    char i = 'a';
    short s = 1024;
    int j = 50000;
    float k = 4.4f;
    double l = 4.234;
    double result = (k * h) + (j / i) - (l * s);
    // float + int - double = double
    System.out.println((k * h) + " " + (j / i) + " " + (l * s));
    System.out.println(result);


  }
}
