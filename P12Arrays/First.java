package P12Arrays;

public class First {
  public static void main(String[] args) {
    // syntax
    // datatype[] variable_name = new datatype[size];
    // store 5 roll numbers 
    int[] rnos = new int[5];
    // or directly
    int[] rnos2 = { 23, 24, 12, 45, 32, 45 };

    int[] ros; // declaration of array. ros is getting defined in the stack
    ros = new int[5]; // initialization: actually here object is being created in the memory (heap)

    String[] arr = new String[4];
    System.out.println(arr[0]); // null is by default value of reference variables
  }
}
