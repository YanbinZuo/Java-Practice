package P44P45LinkedList.P44LinkedList;

public class Main {
  public static void main(String[] args) {
    LL list = new LL();
    // list.insertFirst(13);
    // list.insertFirst(15);
    // list.insertFirst(6);
    // list.insertFirst(8);
    list.insertLast(3);
    list.insertLast(13);
    list.insertLast(5);
    list.insertLast(51);
    list.display();
    list.insert(0, 9);
    list.insert(list.size(), 99);
    list.insert(list.size() - 1, 10);
    list.insert(list.size()+3, 990);
    list.insert(2, 2);
    list.display();
  }
}
