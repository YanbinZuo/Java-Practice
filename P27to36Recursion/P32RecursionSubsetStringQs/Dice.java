package P32RecursionSubsetStringQs;

import java.util.ArrayList;

public class Dice {
  public static void main(String[] args) {
    // it will have like both 112 and 211
    // dice("", 4);
    System.out.println(diceList("", 4));
  }

  // if target = 4, it will have like both 112 and 211
  static void dice(String p, int target) {
    if (target == 0) {
      System.out.print(p + " ");
      return;
    }

    for (int i = 1; i <= 6 && i <= target; i++) {
      dice(p + i, target - i);
    }
  }

  static ArrayList<String> diceList(String p, int target) {
    if (target == 0) {
      ArrayList<String> list = new ArrayList<>();
      list.add(p);
      return list;
    }

    ArrayList<String> ans = new ArrayList<>();
    for (int i = 1; i <= 6 && i <= target; i++) {
      ans.addAll(diceList(p + i, target - i));
    }
    return ans;
  }

  static void diceFace(String p, int target, int face) {
    if (target == 0) {
      System.out.println(p);
      return;
    }

    for (int i = 1; i <= face && i <= target; i++) {
      diceFace(p + i, target - i, face);
    }
  }

  static ArrayList<String> diceFaceRet(String p, int target, int face) {
    if (target == 0) {
      ArrayList<String> list = new ArrayList<>();
      list.add(p);
      return list;
    }
    ArrayList<String> list = new ArrayList<>();
    for (int i = 1; i <= face && i <= target; i++) {
      list.addAll(diceFaceRet(p + i, target - i, face));
    }
    return list;
  }

}
