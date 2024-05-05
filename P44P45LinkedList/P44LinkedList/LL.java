package P44P45LinkedList.P44LinkedList;

public class LL {
  private class Node {
    private int value;
    private Node next;

    public Node(int value) {
      this.value = value;
    }

    public Node(int value, Node next) {
      this.value = value;
      this.next = next;
    }
  }

  private Node head;
  private Node tail;
  private int size;

  public LL() {
    this.size = 0;
  }

  public void insertFirst(int val) {
    Node node = new Node(val);
    node.next = head;
    head = node;
    if (tail == null) {
      tail = node;
    }
    size++;
  }

  public void insertLast(int val) {
    Node node = new Node(val);
    if (head == null) {
      head = node;
      tail = node;
      return;
    }
    tail.next = node;
    tail = node;
    size++;
  }

  public void insert(int index, int val) {
    if (index >= size) {
      insertLast(val);
      return;
    }
    if (index == 0) {
      insertFirst(val);
      return;
    }

    Node prev = head;
    for (int i = 0; i < index - 1; i++) {
      prev = prev.next;
    }
    Node node = new Node(val, prev.next);
    prev.next = node;
    size++;
  }

  public int deleteFirst() {
    if(head == null) {
      // Return -1 to indicate the list is empty
      return -1;
    }
    int val = head.value;
    head = head.next;
    if (head == null) {
      tail = null;
    }

    size--;
    return val;
  }

  public int deleteLast() {
    if (size <= 1) {
      return deleteFirst();
    }
    int val = tail.value;
    Node secondLast = get(size - 2);
    secondLast.next = null;
    tail = secondLast;
    size--;
    return val;
  }

  public int delete(int index) {
    if(index >= size) {
      return -1;
    }
    if(head == null) {
      return -1;
    }
    if(index == 0) {
      return deleteFirst();
    } 
    if(index == size - 1) {
      return deleteLast();
    }

    Node prev = get(index - 1);
    int val = prev.next.value;
    prev.next = prev.next.next;
    size--;
    return val;
  }

  public Node get(int index) {
    if (index >= size) {
      return null;
    }
    Node temp = head;
    for (int i = 0; i < index; i++) {
      temp = temp.next;
    }
    return temp;
  }

  public Node find(int value) {
    Node temp = head;
    while(temp != null) {
      if(temp.value == value) {
        return temp;
      }
      temp = temp.next;
    }
    return null;
  }

  public int size() {
    return size;
  }

  public void display() {
    Node temp = head;
    while (temp != null) {
      System.out.print(temp.value + " -> ");
      temp = temp.next;
    }
    System.out.println("END");
  }

}
