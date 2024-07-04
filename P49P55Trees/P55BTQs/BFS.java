package P49P55Trees.P55BTQs;

import java.util.LinkedList;
import java.util.Queue;

public class BFS {
  public class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {}
    TreeNode(int val) {
      this.val = val;
    }
    TreeNode(int val, TreeNode left, TreeNode right) {
      this.val = val;
      this.left = left;
      this.right = right;
    }
  }

  public class TreeNodeNext {
    int val;
    TreeNodeNext left;
    TreeNodeNext right;
    TreeNodeNext next;

    TreeNodeNext() {}
    TreeNodeNext(int val) {
      this.val = val;
    }
    TreeNodeNext(int val, TreeNodeNext left, TreeNodeNext right, TreeNodeNext next) {
      this.val = val;
      this.left = left;
      this.right = right;
      this.next = next;
    }
  }

  public TreeNode findSuccessor(TreeNode root, int key) {
    if (root == null)
      return null;
    Queue<TreeNode> queue = new LinkedList<>();
    queue.add(root);

    while (!queue.isEmpty()) {
      TreeNode currNode = queue.remove();
      // add the children first
      if (currNode.left != null) {
        queue.add(currNode.left);
      }
      if (currNode.right != null) {
        queue.add(currNode.right);
      }
      if (currNode.val == key) {
        break;
      }
    }
    return queue.peek();
  }

  public TreeNodeNext connect(TreeNodeNext root) {
    if(root == null) return null;
    TreeNodeNext leftMost = root;
    while(leftMost != null) {
      TreeNodeNext curr = leftMost;
      while(curr != null) {
        curr.left.next = curr.right;
        if(curr.next != null) {
          curr.right.next = curr.next.left;
        }
        curr = curr.next;
      }
      leftMost = leftMost.left;
    }
    return root;
  }
}
