package P49P55Trees.P49BinaryTrees;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    // BinaryTree tree = new BinaryTree();
    // Scanner scanner = new Scanner(System.in);
    // tree.populate(scanner);
    // tree.display();
    // System.out.println();
    // tree.prettyDisplay();

    BST tree = new BST();
    int[] nums = { 5, 2, 7, 1, 4, 6, 9, 8, 3, 10 };
    tree.populate(nums);
    tree.display();
  }
}
