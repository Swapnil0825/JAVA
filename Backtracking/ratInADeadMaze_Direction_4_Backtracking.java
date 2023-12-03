package Backtracking;

public class ratInADeadMaze_Direction_4_Backtracking {
    public static void main(String[] args) {
        int rows = 3;
        int col = 4;
        int[][] maze = { { 1, 0, 1, 1 },
                { 1, 1, 1, 1 },
                { 1, 1, 0, 1 } };
        boolean isvisited[][] = new boolean[rows][col];
        print(0, 0, rows - 1, col - 1, "", isvisited, maze);
    }

    private static void print(int sr, int sc, int er, int ec, String s, boolean[][] isvisited, int[][] maze) {
        if (sr < 0 || sc < 0) {
            return;
        }
        if (sr > er || sc > ec) {
            return;
        }
        if (sr == er && sc == ec) {
            System.out.println(s);
            return;
        }
        if (maze[sr][sc] == 0) {
            return;
        }
        if (isvisited[sr][sc] == true) {
            return;
        }

        isvisited[sr][sc] = true;

        // go right
        print(sr, sc + 1, er, ec, s + "R", isvisited, maze);

        // go Down
        print(sr + 1, sc, er, ec, s + "D", isvisited, maze);

        // go Left
        print(sr, sc - 1, er, ec, s + "L", isvisited, maze);

        // go Up
        print(sr - 1, sc, er, ec, s + "U", isvisited, maze);

        // Backtracking
        isvisited[sr][sc] = false;
    }

}
