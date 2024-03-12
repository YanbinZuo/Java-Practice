package P11Functions;

public class Scope {
  public static void main(String[] args) {
    // NOTE: anything that declared outside the block can be used inside the block,
    // but anything declared inside the block cannot be used outside the block


    int a = 10;
    int b = 20;


    // same as if, for loop block
    {
      // NOTE: ERROR: already initialized outside the block in the 
      // same method, hence you cannot initialize again
      // int a = 80;
      a = 100;

      // values initialized in this block will remain in the block;
      int c = 9;
    }
    // out 100
    System.out.println(a);

    // NOTE: ERROR:  cannot use outside the block
    // System.out.println(c);
  }
}
