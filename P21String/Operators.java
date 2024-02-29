package P21String;
import java.util.ArrayList;

public class Operators {
  public static void main(String[] args) {
    System.out.println('a');
    System.out.println('a' + 'b');  
    System.out.println("a" + "b");  
    System.out.println('a' + 3);
    System.out.println((char)('a' + 3));

    // int will be converted to Integer that will call toString()
    // this is same as a few steps: "a" + "1"
    System.out.println("a" + 1);

    System.out.println("kunal" + new ArrayList<>());
    System.out.println("Kunal" + new Integer(56));

    // ERROR below: at least one of these should be string
    // System.out.println(new Integer(56) + new ArrayList<>());

    System.out.println(new Integer(56) + "" + new ArrayList<>());

  }

}
