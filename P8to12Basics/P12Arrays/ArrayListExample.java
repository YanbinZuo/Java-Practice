package P12Arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExample {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    // syntax
    ArrayList<Integer> list = new ArrayList<>(10);
    list.add(676);
    list.add(675);
    list.add(637);
    list.add(674);

    System.out.println(list.contains(4));

    list.set(0, 3);
    // can directly print it. it internally calls its own toString() method
    System.out.println(list);

    list.remove(2);
    System.out.println(list);

    // Input
    for (int i = 0; i < 5; i++) {
        list.add(in.nextInt());
    }

    for (int i = 0; i < 5; i++) {
      System.out.print(list.get(i) + " ");
    }

  }

}
