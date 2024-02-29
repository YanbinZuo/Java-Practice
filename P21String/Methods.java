package P21String;

import java.util.Arrays;

public class Methods {
  public static void main(String[] args) {
    String name = "Kunal Kushwaha";
    System.out.println(Arrays.toString(name.toCharArray()));
    // this create a new object because string is immutable
    System.out.println(name.toLowerCase());
    System.out.println(name);
    System.out.println(name.indexOf("a"));
    System.out.println("   Kunal   ".strip());
    System.out.println(Arrays.toString(name.split(" ")));

  }  
}
