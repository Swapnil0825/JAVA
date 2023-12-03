package Practice;

import java.util.Scanner;

public class CWH_80_try {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a first Number");
        int a = sc.nextInt();
        System.out.println("Enter a second Number");
        int b = sc.nextInt();

        // Without try catch
        // int c =a/b;
        // System.out.println(c);

        // With try catch
        try {
            int c = a / b;
            System.out.println("Division is " + c);

        } catch (Exception e) {
            System.out.println("We failed to divide. Reason: ");
            System.out.println(e);
        }
        System.out.println("End of the program");

    }

}
