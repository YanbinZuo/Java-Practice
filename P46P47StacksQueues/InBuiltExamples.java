package P46P47StacksQueues;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class InBuiltExamples {
  public static void main(String[] args) {
    // Stack is a class, but Queue is an interface
    Stack<Integer> stack = new Stack<>();
    stack.push(12);
    stack.push(15);
    stack.push(16);

    System.out.println(stack.pop());
    System.out.println(stack.pop());
    System.out.println(stack.pop());
    // System.out.println(stack.pop());

    System.out.println("\nQueue:");
    Queue<Integer> queue = new LinkedList<>();
    queue.add(12);
    queue.add(13);
    queue.add(14);

    System.out.println(queue.peek());
    System.out.println(queue.remove());
    System.out.println(queue.remove());
    System.out.println(queue.remove());
    // System.out.println(queue.remove());

    System.out.println("\nDeque");
    Deque<Integer> deque = new ArrayDeque<>();
    deque.add(12);
    deque.add(14);
    deque.addLast(16);
    deque.addFirst(10);
    System.out.println(deque.remove());
    System.out.println(deque.removeLast());
    System.out.println(deque.removeFirst());
  }
}
