package P44P45LinkedList.P44LinkedList;

public class CLL {
  private class Node {
    int val;
    Node next;

    public Node(int val) {
      this.val = val;
    }
  }

  private Node head;
  private Node tail;

  public CLL() {
    this.head = null;
    this.tail = null;
  }

  public void insert(int val) {
    Node node = new Node(val);
    if(head == null) {
      head = node;
      tail = node;
      return;
    }
    tail.next = node;
    node.next = head;
    tail = node;
  }

  public void display() {
    if (head == null) {
      return;
    }

    Node curr = head;
    do {
      System.out.print(curr.val + " -> ");
      if(curr.next != null) {
        curr = curr.next;
      }
    } while (curr != head);
    System.out.println("HEAD");
  }

  public void delete(int val) {
    Node node = head;
    if(node == null) {
      return;
    }
    if(head == tail) {
      head = null;
      tail = null;
      return;
    }
    if(node.val == val) {
      head = head.next;
      tail.next = head;
      return;
    }

    do {
      Node next = node.next;
      if(next.val == val) {
        node.next = next.next;
        break;
      }
      node = node.next;
    } while(node != head);
  }
}
