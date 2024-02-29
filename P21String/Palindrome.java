package P21String;

public class Palindrome {
  public static void main(String[] args) {
    String a = "";
    System.out.println(isPalindrome(a));
  }

  static boolean isPalindrome(String str) {
    if(str == null || str.length() == 0) {
      return true;
    }
    
    str = str.toLowerCase();
    int n = str.length();
    for (int i = 0; i <= n/2; i++) {
      char start = str.charAt(i);
      char end = str.charAt(n - 1 - i);
      if(start != end) {
        return false;
      }
    }
    return true;
  }
}
