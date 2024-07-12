package P57P58HashMap.P57HashMap;

import java.util.HashMap;
import java.util.HashSet;

public class Main {
  public static void main(String[] args) {
    // hashDemo();
    HashMapFinal<String, String> map = new HashMapFinal<>();
    map.put("Mango", "king of fruits");
    map.put("Apple", "A sweet red fruits");
    map.put("Banana", "A good fruits");

    System.out.println(map);
  }

  public static void hashDemo() {
    String name = "Rahul";
    int codeName = name.hashCode();
    Integer a = 3242234;
    int code = a.hashCode();
    System.out.println(codeName);
    System.out.println(code);

    HashMap<String, Integer> map = new HashMap<>();
    map.put("kunal", 89);
    map.put("Karan", 99);
    map.put("Rahul", 94);
    System.out.println(map.get("Karan"));
    System.out.println(map.getOrDefault("Apoorv", 78));

    HashSet<Integer> set = new HashSet<>();
    set.add(56);
    set.add(58);
    set.add(5);
    set.add(56);
    set.add(56);
    set.add(5);
    set.add(3);
    System.out.println(set);
  }
}
