package P49P56Trees.P55BTQs;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class PathSum {
  boolean findPath(Node node, int[] arr) {
    if(node == null) {
      return arr.length == 0;
    }
    return helper(node, arr, 0);
  }

  private boolean helper(Node node, int[] arr, int i) {
    if(node == null) {
      return false;
    }

    if(i >= arr.length || node.val != arr[i]) {
      return false;
    }

    if(node.left == null && node.right == null && i == arr.length - 1) {
      return true;
    }

    return helper(node.left, arr, i + 1) || helper(node.right, arr, i + 1);
  }

  int countPaths(Node node, int sum) {
    List<Integer> path = new ArrayList<>();
    return helper(node, sum ,path);
  }
  int helper(Node node, int sum, List<Integer> path) {
    if(node == null) {
      return 0;
    }
    path.add(node.val);
    int count = 0;
    int s = 0;
    // how many paths I can make
    ListIterator<Integer> itr = path.listIterator(path.size());
    while(itr.hasPrevious()) {
      s += itr.previous();
      if(s == sum) {
        count++;
      }
    }

    count += helper(node.left, s, path) + helper(node.right, sum, path);

    // backtrack
    path.remove(path.size() - 1);
    return count;
  }
}
