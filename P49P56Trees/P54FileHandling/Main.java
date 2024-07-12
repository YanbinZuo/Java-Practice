package P49P56Trees.P54FileHandling;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
  public static void main(String[] args) {
    // create
    try {
      File fo = new File("new-file.txt");
      fo.createNewFile();
    } catch(IOException e) {
      System.out.println(e.getMessage());
    }

    // write in the file
    try {
      FileWriter fw = new FileWriter("new-file.txt");
      fw.write("你好");
      fw.close();
    } catch(IOException e) {
      System.out.println(e.getMessage());
    }

    // reading from a file
    try(BufferedReader br = new BufferedReader(new FileReader("new-file.txt"))) {
      while(br.ready()) {
        System.out.println(br.readLine());
      }
    } catch(IOException e) {
      System.out.println(e.getMessage());
    }

    // create and delete
    try {
      File fo = new File("random.txt");
      fo.createNewFile();
      if(fo.delete()) {
        System.out.println(fo.getName());
      }
    } catch(IOException e) {
      System.out.println(e.getMessage());
    }
  }
}
