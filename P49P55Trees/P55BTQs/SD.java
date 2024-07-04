package P49P55Trees.P55BTQs;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SD {
  // LC 297 Serialize and Deserialize BT (a little change for return type)
  public List<String> serialize(Node node) {
    List<String> list = new ArrayList<>();
    helper(node, list);
    return list;
  }

  void helper(Node node, List<String> list) {
    if(node == null) {
      list.add("null");
      return;
    }
    list.add(String.valueOf(node.val));

    helper(node.left, list);
    helper(node.right, list);
  }

  Node deserialize(List<String> list) {
    Collections.reverse(list);
    Node node = helper2(list);
    return node;
  }

  Node helper2(List<String> list) {
    String val = list.remove(list.size() - 1);
    if(val.charAt(0) == 'n') {
      return null;
    }
    Node node = new Node(Integer.parseInt(val));
    node.left = helper2(list);
    node.right = helper2(list);

    return node;
  }
}
