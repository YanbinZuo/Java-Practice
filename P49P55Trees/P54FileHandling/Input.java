package P49P55Trees.P54FileHandling;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Input {
  static void input() {
    try(InputStreamReader isr = new InputStreamReader(System.in)) {
      System.out.println("Enter some letters: ");
      // read a single character
      // returns the character read, or -1 if the end of the stream has been reached
      // read return int type
      int letters = isr.read();
      // tells whether this stream is ready to be read
      while(isr.ready()) {
        System.out.println((char)letters);
        letters = isr.read();
      }
      // try catch will automatically close it
      // isr.close();
    } catch(IOException e) {
      System.out.println(e.getMessage());
    }

    //  the location where Java looks for the file is not necessarily the same as the directory 
    // where your Java source code (.java file) is located. Instead, Java looks for the file in 
    // the current working directory, which is usually the directory from which you run your Java program.
    // Check the Current Working Directory
    System.out.println(System.getProperty("user.dir"));

    try(FileReader fr = new FileReader("note.txt")) {
      int letters = fr.read();
      while(fr.ready()) {
        System.out.println((char)letters);
        letters = fr.read();
      }
    } catch(IOException e) {
      System.out.println(e.getMessage());
    }

    // Constructor: BufferedReader(Reader in)
    // for parameter: we can not use System.in (because it is byte streams, and parameter needs to be character stream)
    // byte to char stream and then reading char stream
    try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
      String a = br.readLine();
      System.out.println("You typed: " + a);
      // System.out.println("You typed: " + br.readLine());
      System.out.println("test");
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
