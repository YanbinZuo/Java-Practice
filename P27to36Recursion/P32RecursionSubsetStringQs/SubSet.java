package P32RecursionSubsetStringQs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SubSet {
  public static void main(String[] args) {
    // int[] arr = {1,2,3};
    // List<List<Integer>> ans = subset(arr);
    // System.out.println(ans);

    int[] arr1 = {1,2,2};
    System.out.println(subsetDuplicate(arr1));
  }

  static List<List<Integer>> subset(int[] arr) {
    List<List<Integer>> outer = new ArrayList<>();
    outer.add(new ArrayList<>());

    for(int num: arr) {
      int n = outer.size();
      for (int i = 0; i < n; i++) {
        List<Integer> inner = new ArrayList<>(outer.get(i));
        inner.add(num);
        outer.add(inner);
      }
    }
    return outer;
  }

  static List<List<Integer>> subsetDuplicate(int[] arr) {
    Arrays.sort(arr);
    List<List<Integer>> outer = new ArrayList<>();
    outer.add(new ArrayList<>());

    int start = 0;
    int end = 0;
    for (int i = 0; i < arr.length; i++) {
      int n = outer.size();
      start = 0;
      if(i > 0 && arr[i] == arr[i-1]) {
        start = end + 1;
      }
      end = n - 1;
      for (int j = start; j < n; j++) {
        List<Integer> inner = new ArrayList<>(outer.get(j));
        inner.add(arr[i]);
        outer.add(inner);
      }
    }
    return outer;
  }
}
