package P49P56Trees.P55BTQs;

import java.util.Stack;

public class DFS {
  // DFS using stack
  void dfsStack(Node node) {
    if(node == null) {
      return;
    }
    Stack<Node> stack = new Stack<>();
    stack.push(node);

    while(!stack.isEmpty()) {
      Node removed = stack.pop();
      System.out.print(removed.val + " ");
      if(removed.right != null) {
        stack.push(removed.right);
      }
      if(removed.left != null) {
        stack.push(removed.left);
      }
    }
  }
}
