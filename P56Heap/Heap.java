package P56Heap;

import java.util.ArrayList;

// Min heap
public class Heap<T extends Comparable<T>> {
  private ArrayList<T> list;

  public Heap() {
    list = new ArrayList<>();
  }

  private void swap(int first, int second) {
    T temp = list.get(first);
    list.set(first, list.get(second));
    list.set(second, temp);
  }

  private int parent(int index) {
    return (index - 1) / 2;
  }

  private int left(int index) {
    return 2 * index + 1;
  }

  private int right(int index) {
    return 2 * index + 2;
  }

  public void insert(T value) {
    list.add(value);
    upheap(list.size() - 1);
  }
  private void upheap(int index) {
    if(index == 0) {
      return;
    }
    int p = parent(index);
    if(list.get(index).compareTo(list.get(p)) < 0) {
      swap(index, p);
      upheap(p);
    }
  }

  public T remove() throws Exception {
    if(list.isEmpty()) {
      throw new Exception("Removing from an empty heap!");
    }

    T temp = list.get(0);

    T last = list.remove(list.size() - 1);
    if(!list.isEmpty()) {
      list.set(0, last);
      downheap(0);
    }

    return temp;
  }
  private void downheap(int index) {
    int size = list.size();
    int l = left(index);
    int r = right(index);
    int min = index;
    if(l < size && list.get(l).compareTo(list.get(min)) < 0) {
      min = l;
    }
    if(r < size && list.get(r).compareTo(list.get(min)) < 0) {
      min = r;
    }
    if(min != index) {
      swap(min, index);
      downheap(min);
    }
  }

  public ArrayList<T> heapSort() throws Exception {
    ArrayList<T> data = new ArrayList<>();
    while(!list.isEmpty()) {
      data.add(this.remove());
    }
    return data;
  }

  public static void main(String[] args) throws Exception {
    Heap<Integer> heap = new Heap<>();

    heap.insert(43);
    heap.insert(22);
    heap.insert(46);
    heap.insert(35);
    heap.insert(89);
    heap.insert(12);

    ArrayList<Integer> sorted = heap.heapSort();
    System.out.println(sorted);
  }
}
