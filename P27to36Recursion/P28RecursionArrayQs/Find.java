package P28RecursionArrayQs;

import java.util.ArrayList;
import java.util.List;

public class Find {
  public static void main(String[] args) {
    int[] arr = {3, 2, 1, 4, 4, 18, 9};
    // System.out.println(find(arr, 5, 0));
    // System.out.println(findIndex(arr, 4, 0));
    // System.out.println(findLastIndex(arr, 4, arr.length - 1));

    // findAllIndex(arr, 4, 0);
    // System.out.println(list);
    
    // System.out.println(findAllIndex(arr, 4, 0, new ArrayList<>()));
    // ArrayList<Integer> list = new ArrayList<>();
    // ArrayList<Integer> ans = findAllIndex(arr, 4, 0, list);
    // // here, the list is the ans, they are pointing to the same object
    // System.out.println(ans);
    // System.out.println(list);

    System.out.println(findAllIndex2(arr, 4, 0));
  }

  static boolean find(int[] arr, int target, int index) {
    if(index == arr.length) {
      return false;
    }

    if(arr[index] == target) {
      return true;
    }
    return find(arr, target, index + 1);
  }

  static int findIndex(int[] arr, int target, int index) {
    if(index == arr.length) {
      return -1;
    }
    if(arr[index] == target) {
      return index;
    }
    return findIndex(arr, target, index + 1);
  }

  static int findLastIndex(int[] arr, int target, int index) {
    if(index == -1) {
      return -1;
    }
    if(arr[index] == target) {
      return index;
    }
    return findLastIndex(arr, target, index - 1);
  }

  static List<Integer> list = new ArrayList<>();
  static void findAllIndex(int[] arr, int target, int index) {
    if(index == arr.length) {
      return;
    }
    if(arr[index] == target) {
      list.add(index);
    }
    findAllIndex(arr, target, index + 1);
  }

  static ArrayList<Integer> findAllIndex(int[] arr, int target, int index, ArrayList<Integer> list) {
    if(index == arr.length) {
      return list;
    }
    if(arr[index] == target) {
      list.add(index);
    }
    return findAllIndex(arr, target, index + 1, list);
  }

  static List<Integer> findAllIndex2(int[] arr, int target, int index) {
    List<Integer> list = new ArrayList<>();
    if(index == arr.length) {
      return list;
    }

    // this will contain answer for that function call only
    if(arr[index] == target) {
      list.add(index);
    }
    
    List<Integer> ansFromBelowCalls = findAllIndex2(arr, target, index + 1);
    list.addAll(ansFromBelowCalls);
    return list;
  }



}
