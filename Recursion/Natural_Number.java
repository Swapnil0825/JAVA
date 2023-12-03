package Recursion;

import java.util.Scanner;

public class Natural_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the N number");
        int n = sc.nextInt();
        PI(n);
    }

    private static void PI(int n) {
        if(n==1){
            System.out.println(1);
            return;
        }
        PI(n-1);
        System.out.println(n);
    }
}