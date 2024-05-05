package P44P45LinkedList.P44LinkedList;

public class DLL {
  private class Node {
    int val;
    Node next;
    Node prev;

    public Node(int val) {
      this.val = val;
    }
  }

  private Node head;

  public void insertFirst(int val) {
    Node node = new Node(val);
    node.prev = null;
    node.next = head;
    if (head != null) {
      head.prev = node;
    }
    head = node;
  }

  public void display() {
    Node node = head;
    Node last = null;
    while (node != null) {
      System.out.print(node.val + " -> ");
      last = node;
      node = node.next;
    }
    System.out.println("END");

    System.out.println("Print in reverse:");
    node = last;
    while (node != null) {
      System.out.println(node.val + " -> ");
      node = node.prev;
    }
    System.out.println("START");
  }

  public void insertLast(int val) {
    Node node = new Node(val);
    node.next = null;
    if (head == null) {
      node.prev = null;
      head = node;
      return;
    }
    Node curr = head;
    while (curr.next != null) {
      curr = curr.next;
    }
    node.prev = curr;
    curr.next = node;
  }

  public Node find(int value) {
    Node node = head;
    while (node != null) {
      if (node.val == value) {
        return node;
      }
      node = node.next;
    }
    return null;
  }

  public void insert(int after, int val) {
    Node p = find(after);

    if (p == null) {
      System.out.println("does not exist");
      return;
    }

    Node node = new Node(val);
    node.next = p.next;
    p.next = node;
    node.prev = p;
    if (node.next != null) {
      node.next.prev = node;
    }
  }
}
