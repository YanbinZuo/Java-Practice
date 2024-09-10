package P61HuffmanCoding;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HuffmanCoder {
  HashMap<Character, String> encoder;
  HashMap<String, Character> decoder;

  private class Node implements Comparable<Node>{
    Character data;
    int cost;
    Node left;
    Node right;

    public Node(Character data, int cost) {
      this.data = data;
      this.cost = cost;
      this.left = null;
      this.right = null;
    }

    @Override
    public int compareTo(Node other) {
      return this.cost - other.cost;
    }
  }

  public HuffmanCoder(String feeder) throws Exception {
    HashMap<Character, Integer> fmap = new HashMap<>();
    for(int i=0; i<feeder.length(); i++) {
      char c = feeder.charAt(i);
      fmap.put(c, fmap.getOrDefault(c, 0) + 1);
    }

    Heap<Node> minHeap = new Heap<>();
    Set<Map.Entry<Character, Integer>> entrySet = fmap.entrySet();
    for(Map.Entry<Character, Integer> enter: entrySet) {
      Character c = enter.getKey();
      Integer v = enter.getValue();
      Node node = new Node(c, v);
      minHeap.insert(node);
    }

    while(minHeap.size() != 1) {
      Node first = minHeap.remove();
      Node second = minHeap.remove();

      Node newNode = new Node('\0', first.cost + second.cost);
      newNode.left = first;
      newNode.right = second;
      minHeap.insert(newNode);
    }

    Node fullTree = minHeap.remove();

    this.encoder = new HashMap<>();
    this.decoder = new HashMap<>();
    this.initEncoderDecoder(fullTree, "");
  }

  private void initEncoderDecoder(Node node, String output) {
    if(node == null) {
      return;
    }

    if(node.left == null && node.right == null) {
      this.encoder.put(node.data, output);
      this.decoder.put(output, node.data);
      return;
    }
    initEncoderDecoder(node.left, output+ "0");
    initEncoderDecoder(node.right, output + "1");
  }

  public String encode(String source) {
    StringBuilder sb = new StringBuilder();
    for(char c: source.toCharArray()) {
      sb.append(this.encoder.get(c));
    }
    return sb.toString();
  }

  public String decode(String codedString) {
    StringBuilder ans = new StringBuilder();
    String key = "";
    for(char c: codedString.toCharArray()) {
      key += c;
      if(this.decoder.containsKey(key)) {
        ans.append(this.decoder.get(key));
        key = "";
      }
    }
    return ans.toString();
  }
}
