package Backtracking;

import java.util.Scanner;

public class Implementation_4_Direction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the No of Rows");
        int rows = sc.nextInt();

        System.out.println("Enter the No. of Colums");
        int col = sc.nextInt();

        boolean[][] isVisited = new boolean[rows][col]; // by default false

        // int count = maze(1, 1, rows, col);
        // System.out.println("No. of ways to travel the distnace is " + count);

        print(0, 0, rows - 1, col - 1, "", isVisited);
    }

    private static void print(int sr, int sc, int er, int ec, String s, boolean[][] isVisited) {

        if (sr < 0 || sc < 0) {
            return;
        }
        if (sr > er || sc > ec) {
            return;
        }
        if (isVisited[sr][sc] == true) {
            return;
        }
        if (sr == er && sc == ec) {
            System.out.println(s);
            return;
        }

        isVisited[sr][sc] = true;
        // go right
        print(sr, sc + 1, er, ec, s + "R", isVisited);

        // go down
        print(sr + 1, sc, er, ec, s + "D", isVisited);

        // go left
        print(sr, sc - 1, er, ec, s + "L", isVisited);

        // go up
        print(sr - 1, sc, er, ec, s + "U", isVisited);

        // Backtracking
        isVisited[sr][sc] = false;

    }

    // private static int maze(int sr, int sc, int er, int ec) {
    // if (sr > er || sc > ec) {
    // return 0;
    // }
    // if (sr == er || sc == ec) {
    // return 1;
    // }

    // int right = maze(sr, sc + 1, er, ec);
    // int down = maze(sr + 1, sc, er, ec);
    // int left = maze(sr, sc - 1, er, ec);
    // int up = maze(sr + 1, sc, er, ec);
    // int count = down + right + left + up;
    // return count;
    // }

}
