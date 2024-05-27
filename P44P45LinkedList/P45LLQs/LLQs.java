package P44P45LinkedList.P45LLQs;

public class LLQs {
  // https://leetcode.com/problems/linked-list-cycle
  // Amazon and Microsoft
  // LC 141
  public boolean hasCycle(ListNode head) {
    ListNode fast = head;
    ListNode slow = head;

    while (fast != null && fast.next != null) {
      fast = fast.next.next;
      slow = slow.next;
      if (fast == slow) {
        return true;
      }
    }
    return false;
  }

  public int lengthCycle(ListNode head) {
    ListNode fast = head;
    ListNode slow = head;
    while (fast != null && fast.next != null) {
      fast = fast.next.next;
      slow = slow.next;
      if (fast == slow) {
        // calculate the length
        int length = 0;
        do {
          slow = slow.next;
          length++;
        } while (slow != fast);
        return length;
      }
    }
    return 0;
  }

  public static void main(String[] args) {

  }
}

class ListNode {
  int val;
  ListNode next;

  public ListNode() {
  }

  ListNode(int x) {
    val = x;
    next = null;
  }
}
