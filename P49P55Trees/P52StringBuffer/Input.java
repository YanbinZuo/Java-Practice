package P49P55Trees.P52StringBuffer;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Input {
  static void input() {
    // taking data in byte stream and output in character stream
    try (InputStreamReader isr = new InputStreamReader(System.in)) {
      System.out.println("Enter some letters: ");
      int letters = isr.read();
      while(isr.ready()) {
        System.out.println((char) letters);
        letters = isr.read();
      }
      // try catch will automatically close it
      // isr.close();
      System.out.println();
    } catch(IOException e) {
      System.out.println(e.getMessage());
    }

    try(FileReader fr = new FileReader("note.txt")) {
      int letters = fr.read();
      while(fr.ready()) {
        System.out.println((char) letters);
        letters = fr.read();
      }
      // fr.close();
      System.out.println();
    } catch(IOException e) {
      System.out.println(e.getMessage());
    }

    // byte to char stream and then reading char stream
    try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
      System.out.println("You typed: " + br.readLine());
    } catch(IOException e) {
      System.out.println(e.getMessage());
    }

    try(BufferedReader br = new BufferedReader(new FileReader("note.txt"))) {
      while(br.ready()) {
        System.out.println(br.readLine());
      }
    } catch(IOException e) {
      System.out.println(e.getMessage());
    }
  }
}
