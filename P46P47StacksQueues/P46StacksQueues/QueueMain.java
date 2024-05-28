package P46P47StacksQueues.P46StacksQueues;

public class QueueMain {
  public static void main(String[] args) throws Exception {
    // CustomQueue queue = new CustomQueue(5);
    CircularQueue queue = new CircularQueue(5);
    queue.insert(3);
    queue.insert(4);
    queue.insert(5);
    queue.insert(6);

    queue.display();

    System.out.println(queue.remove());
    queue.insert(7);

    queue.display();
  }
}
