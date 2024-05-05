package P34RecursionGoogleQs;

import java.util.ArrayList;

// not same as LC 17, and not cover edge cases
public class PhonePad {
  public static void main(String[] args) {
    // pad("", "12");
    System.out.println(padList("", "12").size());
    System.out.println(padCount("", "12"));
  }

  static void pad(String p, String up) {
    if(up.isEmpty()) {
      System.out.print(p + " ");
      return;
    }

    char ch = up.charAt(0);
    // this will convert '2' to 2
    int digit = ch - '0';

    for (int i = (digit - 1) * 3; i < digit * 3; i++) {
      char c = (char)('a' + i);
      pad(p + c, up.substring(1));
    }
  }

  static ArrayList<String> padList(String p, String up) {
    if(up.isEmpty()) {
      ArrayList<String> list = new ArrayList<>();
      list.add(p);
      return list;
    }

    char ch = up.charAt(0);
    int digit = ch - '0';
    ArrayList<String> ans = new ArrayList<>();

    for (int i = (digit - 1) * 3; i < digit * 3; i++) {
      char c = (char)('a' + i);
      ans.addAll(padList(p + c, up.substring(1)));
    }

    return ans;
  }

  static int padCount(String p, String up) {
    if(up.isEmpty()) {
      return 1;
    }

    char ch = up.charAt(0);
    int digit = ch - '0';
    int count = 0;

    for (int i = (digit - 1) * 3; i < digit * 3; i++) {
      char c = (char)('a' + i);
      count = count + padCount(p + c, up.substring(1));
    }

    return count;
  }
}
