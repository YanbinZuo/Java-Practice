package P35BacktrackingIntro;

import java.util.ArrayList;

public class Maze {
  public static void main(String[] args) {
    // System.out.println(count(3,3));
    // path("", 3, 3);
    // System.out.println(pathList("", 3, 3));
    // System.out.println(pathListDiagonal("", 3, 3));

    boolean[][] maze = {
      {true, true, true},
      {true, false, true},
      {true, true, true},
    };
    pathWithObstacles("", maze, 0, 0);
  }

  static int count(int r, int c) {
    if(r == 1 || c == 1) {
      return 1;
    }

    int left = count(r-1, c);
    int right = count(r, c-1);
    return left + right;
  }

  static void path(String p, int r, int c) {
    if(r == 1 && c == 1) {
      System.out.println(p);
      return;
    }

    if(r > 1) {
      path(p + "D", r - 1, c);
    }
    if(c > 1) {
      path(p + "R", r, c - 1);
    }
  }

  static ArrayList<String> pathList(String p, int r, int c) {
    if(r == 1 && c == 1) {
      ArrayList<String> list = new ArrayList<>();
      list.add(p);
      return list;
    }

    ArrayList<String> ans = new ArrayList<>();
    if(r > 1) {
      ans.addAll(pathList(p + "D", r - 1, c));
    }
    if(c > 1) {
      ans.addAll(pathList(p + "R", r, c - 1));
    }
    return ans;
  }

  // "D": Diagonal; "H": Horizontal; "V": Vertical
  static ArrayList<String> pathListDiagonal(String p, int r, int c) {
    if(r == 1 && c == 1) {
      ArrayList<String> ans = new ArrayList<>();
      ans.add(p);
      return ans;
    }

    ArrayList<String> list = new ArrayList<>();
    if(r > 1 && c > 1) {
      list.addAll(pathListDiagonal(p + "D", r - 1, c - 1));
    }
    if(r > 1) {
      list.addAll(pathListDiagonal(p + "V", r - 1, c));
    }
    if(c > 1) {
      list.addAll(pathListDiagonal(p + "H", r, c - 1));
    }
    return list;
  }

  static void pathWithObstacles(String p, boolean[][] maze, int r, int c) {
    int m = maze.length;
    int n = maze[0].length;

    if(r == m - 1 && c == n - 1) {
      System.out.println(p);
      return;
    }

    if(maze[r][c] == false) {
      return;
    }
    if(r < m - 1) {
      pathWithObstacles(p + "D", maze, r + 1, c);
    }
    if(c < n - 1) {
      pathWithObstacles(p + "R", maze, r, c + 1);
    }
  }
}
