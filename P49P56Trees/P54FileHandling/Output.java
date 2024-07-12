package P49P56Trees.P54FileHandling;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class Output {
  static void output() {
    try(OutputStreamWriter osw = new OutputStreamWriter(System.out)) {
      osw.write("hello world");
      osw.write(97);
      osw.write(10);
      osw.write('A');
      osw.write('\n');
      char[] arr = "Hello World".toCharArray();
      osw.write(arr);
    } catch(IOException e) {
      System.out.println(e.getMessage());
    }

    try(FileWriter fw = new FileWriter("note.txt")) {
      fw.write("test");
    } catch(IOException e) {
      System.out.println(e.getMessage());
    }

    try(FileWriter fw = new FileWriter("note.txt", true)) {
      fw.write(" append");
    } catch(IOException e) {
      System.out.println(e.getMessage());
    }

    try(BufferedWriter bw = new BufferedWriter(new FileWriter("note.txt"))) {
      bw.write("Hare Krishna");
    } catch(IOException e) {
      System.out.println(e.getMessage());
    }
  }
}
