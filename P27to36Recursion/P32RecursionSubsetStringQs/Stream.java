package P32RecursionSubsetStringQs;

public class Stream {
  public static void main(String[] args) {
    // skip("", "bdaccah", 'a');
    // System.out.println(skip1("asbdsaad", 'a'));
    System.out.println(skipString("asdapplea", "apple"));
  }

  static void skip(String processed, String unprocessed, char skipChar) {
    if(unprocessed.isEmpty()) {
      System.out.println(processed);
      return;
    }

    char currChar = unprocessed.charAt(0);
    if(currChar == skipChar) {
      skip(processed, unprocessed.substring(1), skipChar);
    } else {
      skip(processed + currChar, unprocessed.substring(1), skipChar);
    }
  }

  static String skip1(String s, char skipChar) {
    if(s.isEmpty()) {
      return "";
    }
    char currChar = s.charAt(0);
    if(currChar == skipChar) {
      return skip1(s.substring(1), skipChar);
    } else {
      return currChar + skip1(s.substring(1), skipChar);
    }
  }

  static String skipString(String s, String skipStr) {
    if(s.isEmpty()) {
      return "";
    }

    if(s.startsWith(skipStr)) {
      return skipString(s.substring(skipStr.length()), skipStr);
    } else {
      return s.charAt(0) + skipString(s.substring(1), skipStr);
    }
  }
}
