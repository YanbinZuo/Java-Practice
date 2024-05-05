package P35BacktrackingIntro;

import java.util.Arrays;

public class AllPaths {
  public static void main(String[] args) {
    boolean[][] board = {
      {true, true, true},
      {true, true, true},
      {true, true, true}
    };
    // allPaths("", board, 0, 0);

    int[][] path = new int[board.length][board[0].length];
    allPathsPrint("", board, 0, 0, path, 1);
  }
  static void allPaths(String p, boolean[][] maze, int r, int c) {
    int m = maze.length;
    int n = maze[0].length;

    if(r == m - 1 && c == n - 1) {
      System.out.println(p);
      return;
    }

    if(maze[r][c] == false) {
      return;
    }

    // i am considering this block in my path
    maze[r][c] = false;

    if(r < m - 1) {
      allPaths(p + "D", maze, r + 1, c);
    }
    if(c < n - 1) {
      allPaths(p + "R", maze, r, c + 1);
    }
    if(r > 0) {
      allPaths(p + "U", maze, r - 1, c);
    }
    if(c > 0) {
      allPaths(p + "L", maze, r, c - 1);
    }

    // this line is where the function will be over
    // so before the function gets removed, also remove the changes that were made by that function
    maze[r][c] = true;
  }

  static void allPathsPrint(String p, boolean[][] maze, int r, int c, int[][] path, int step) {
    int m = maze.length;
    int n = maze[0].length;

    if(r == m - 1 && c == n - 1) {
      path[r][c] = step;
      for(int[] arr: path) {
        System.out.println(Arrays.toString(arr));
      }
      System.out.println(p);
      System.out.println();
      return;
    }

    if(maze[r][c] == false) {
      return;
    }

    // i am considering this block in my path
    maze[r][c] = false;
    path[r][c] = step;

    if(r < m - 1) {
      allPathsPrint(p + "D", maze, r + 1, c, path, step + 1);
    }
    if(c < n - 1) {
      allPathsPrint(p + "R", maze, r, c + 1, path, step + 1);
    }
    if(r > 0) {
      allPathsPrint(p + "U", maze, r - 1, c, path, step + 1);
    }
    if(c > 0) {
      allPathsPrint(p + "L", maze, r, c - 1, path, step + 1);
    }

    // this line is where the function will be over
    // so before the function gets removed, also remove the changes that were made by that function
    maze[r][c] = true;
    path[r][c] = 0;
  }
}
