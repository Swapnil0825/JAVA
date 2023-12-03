package Recursion;

import java.util.Scanner;

public class Natural_Number_reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the N number");
        int n = sc.nextInt();
        PIR(n);
    }


    private static void PIR(int n) {
        if(n==1){
            System.out.println(1);
            return;
        }
        System.out.println(n);
        PIR(n-1);
    }  
}
