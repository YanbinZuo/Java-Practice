package P58KarpRabin;

public class KarpRabin {
  private final int PRIME = 7;

  private double calculateHash(String str) {
    double hash = 0;
    for(int i = 0; i<str.length(); i++) {
      hash += str.charAt(i) * Math.pow(PRIME, i);
    }
    return hash;
  }

  private double updateHash(double prevHash, char oldChar, char newChar, int patternLength) {
    double newHash = (prevHash - oldChar) / PRIME;
    newHash += newChar * Math.pow(PRIME, patternLength - 1);
    return newHash;
  }

  public void search(String text, String pattern) {
    int n = pattern.length();
    double patternHash = calculateHash(pattern);
    double textHash = calculateHash(text.substring(0, n));

    for(int i=0; i <= text.length() - n; i++) {
      if(textHash == patternHash) {
        if(text.substring(i, i + n).equals(pattern)) {
          System.out.println("Pattern found at index " + i);
        }
      }

      if(i < text.length() - n) {
        textHash = updateHash(textHash, text.charAt(i), text.charAt(i+n), n);
      }
    }
  }
}
