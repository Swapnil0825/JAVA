package Backtracking;

import java.util.Scanner;

public class Implementation_2_Direction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the No of Rows");
        int rows = sc.nextInt();

        System.out.println("Enter the No. of Colums");
        int col = sc.nextInt();

        int count = maze(1, 1, rows, col);
        System.out.println("No. of ways to travel the distnace is " + count);

        print(1, 1, rows, col, "");

    }

    private static void print(int sr, int sc, int er, int ec, String s) {
        if (sr > er || sc > ec) {
            return;
        }
        if (sr == er && sc == ec) {
            System.out.println(s);
            return;
        }
        // go right
        print(sr, sc + 1, er, ec, s + "R");

        // go down
        print(sr + 1, sc, er, ec, s + "D");

    }

    private static int maze(int sr, int sc, int er, int ec) {
        if (sr > er || sc > ec) {
            return 0;
        }
        if (sr == er || sc == ec) {
            return 1;
        }

        int right = maze(sr, sc + 1, er, ec);
        int down = maze(sr + 1, sc, er, ec);

        int count = down + right;
        return count;
    }

}
