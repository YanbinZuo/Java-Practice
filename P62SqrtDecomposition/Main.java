package P62SqrtDecomposition;

public class Main {
  public static void main(String[] args) {
    int[] arr = {1, 3, 5, 2, 7, 6, 3, 1, 4, 8};
    int n = arr.length;
  
    // build a blocks array
    int sqrt = (int)(Math.sqrt(n));
    int blockId = -1;
    int[] blocks = new int[sqrt + 1];
  
    for(int i=0; i<n; i++) {
      // new block is starting
      if(i % sqrt == 0) {
        blockId++;
      }
      blocks[blockId] += arr[i];
    }

    System.out.println(query(blocks, arr, 2, 7, sqrt));
  }

  public static int query(int[] blocks, int[] arr, int l, int r, int sqrt) {
    int ans = 0;

    // left
    while(l < r && l % sqrt != 0 && l != 0) {
      ans += arr[l];
      l++;
    }

    // middle
    while(l + sqrt <= r) {
      ans += blocks[l/sqrt];
      l+= sqrt;
    }

    // right
    while(l <= r) {
      ans += arr[l];
      l++;
    }

    return ans;
  }

  public void update(int[] blocks, int[] arr, int i, int val, int sqrt) {
    int blockId = i / sqrt;
    blocks[blockId] += val - arr[i];
    arr[i] = val;
  }
}
