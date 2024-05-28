package P46P47StacksQueues;

public class StackMain {
  public static void main(String[] args) throws StackException {
    CustomerStack stack = new CustomerStack();
    stack.push(3);
    stack.push(4);
    stack.push(5);

    System.out.println(stack.pop());
    System.out.println(stack.pop());
    System.out.println(stack.pop());
    // System.out.println(stack.pop());
  }
}
