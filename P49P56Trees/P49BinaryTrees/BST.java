package P49P56Trees.P49BinaryTrees;
public class BST {
  public class Node {
    int value;
    int height;
    Node left;
    Node right;

    public Node(int value) {
      this.value = value;
    }

    int getValue() {
      return this.value;
    }
  }

  private Node root;

  public BST() {

  }

  public int height(Node node) {
    if (node == null) {
      return -1;
    }
    return node.height;
  }

  public boolean isEmpty() {
    return root == null;
  }

  public void insert(int value) {
    root = insert(root, value);
  }

  private Node insert(Node node, int value) {
    if (node == null) {
      node = new Node(value);
      return node;
    }
    if (value < node.value) {
      node.left = insert(node.left, value);
    } else if (value > node.value) {
      node.right = insert(node.right, value);
    }
    node.height = Math.max(height(node.left), height(node.right)) + 1;
    return node;
  }

  public void populate(int[] nums) {
    for (int i = 0; i < nums.length; i++) {
      insert(nums[i]);
    }
  }

  public void populatedSorted(int[] nums) {
    populatedSorted(nums, 0, nums.length);
  }

  private void populatedSorted(int[] nums, int start, int end) {
    if (start >= end) {
      return;
    }
    int mid = start + (end - start) / 2;
    insert(nums[mid]);
    populatedSorted(nums, start, mid);
    populatedSorted(nums, mid + 1, end);
  }

  public boolean balanced() {
    return balanced(root);
  }

  private boolean balanced(Node node) {
    if (node == null) {
      return true;
    }
    return Math.abs(height(node.left) - height(node.right)) <= 1
        && balanced(node.left) && balanced(node.right);
  }

  public void display() {
    display(root, "Root Node: ");
  }

  private void display(Node node, String details) {
    if (node == null) {
      return;
    }
    System.out.println(details + node.value);
    display(node.left, "Left child of " + node.value + ": ");
    display(node.right, "Right child of " + node.value + ": ");
  }

}
