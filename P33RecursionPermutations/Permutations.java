package P33RecursionPermutations;

import java.util.ArrayList;

public class Permutations {
  public static void main(String[] args) {
    // permutations("", "abc");
    // ArrayList<String> ans = permutationsList("", "abc");
    // System.out.println(ans);

    System.out.println(permutationsCount("", "abcd"));
  }

  static void permutations(String p, String up) {
    if(up.isEmpty()) {
      System.out.print(p + " ");
      return;
    }

    char ch = up.charAt(0);
    for (int i = 0; i <= p.length(); i++) {
      String f = p.substring(0, i);
      String s = p.substring(i, p.length());
      permutations(f + ch + s, up.substring(1));
    }
  }

  static ArrayList<String> permutationsList(String p, String up) {
    if(up.isEmpty()) {
      ArrayList<String> list = new ArrayList<>();
      list.add(p);
      return list;
    }

    // local to this call
    ArrayList<String> listLocal = new ArrayList<>();
    char ch = up.charAt(0);
    for (int i = 0; i <= p.length(); i++) {
      String f = p.substring(0, i);
      String s = p.substring(i, p.length());
      listLocal.addAll(permutationsList(f + ch + s, up.substring(1)));
    }

    return listLocal;
  }

  static int permutationsCount(String p, String up) {
    if(up.isEmpty()) {
      return 1;
    }

    int count = 0;
    char ch = up.charAt(0);
    for (int i = 0; i <= p.length(); i++) {
      String f = p.substring(0, i);
      String s = p.substring(i, p.length());
      count += permutationsCount(f + ch + s, up.substring(1));
    }

    return count;
  }
}
