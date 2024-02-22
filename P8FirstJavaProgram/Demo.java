package P8FirstJavaProgram;

import java.util.Scanner;

// public class name should match the .java file name
// other class name instead of public don't have this restriction
public class Demo {
  // program start with main function
  public static void main(String[] args) {
    System.out.println("Hello World!");
    Scanner input = new Scanner(System.in);
    // input integer
    // System.out.println(input.nextInt());
    // input string
    // System.out.println(input.next());
    // input next line
    System.out.println(input.nextLine());
  }
}
