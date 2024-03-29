package P13LinearSearch;

public class SearchInStrings {
  public static void main(String[] args) {
    // String name = null;
    // String name = "";
    String name = "Jimmy";
    char target = 'i';
    System.out.println(search(name, target));
  }
  static boolean search(String str, char target) {
    if(str == null || str.length() == 0) {
      return false;
    }

    for (int i = 0; i < str.length(); i++) {
        if(str.charAt(i) == target) {
          return true;
        }        
    }
    return false;
  }
  static boolean search2(String str, char target) {
    if(str == null || str.length() == 0) {
      return false;
    }

    for(char ch: str.toCharArray()) {
      if(ch == target) {
        return true;
      }
    }
    return false;
  }
}
