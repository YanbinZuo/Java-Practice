package P49P56Trees.P55BTQs;

public class Node {
  int val;
  Node left;
  Node right;

  Node() {
  }

  Node(int val) {
    this.val = val;
  }

  Node(int val, Node left, Node right) {
    this.val = val;
    this.left = left;
    this.right = right;
  }

}
