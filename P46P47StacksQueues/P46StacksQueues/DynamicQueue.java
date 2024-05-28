package P46P47StacksQueues.P46StacksQueues;

public class DynamicQueue extends CircularQueue {
  public DynamicQueue() {
    super();
  }

  public DynamicQueue(int item) {
    super(item);
  }

  @Override
  public boolean insert(int item) {
    if(this.isFull()) {
      int[] temp = new int[data.length * 2];
      for (int i = 0; i < data.length; i++) {
        temp[i] = data[(front + i) % data.length];
      }
      front = 0;
      end = data.length;
      data = temp;
    } 
    return super.insert(item);
  }
}