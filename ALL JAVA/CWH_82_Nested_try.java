package Practice;

import java.util.*;

public class CWH_82_Nested_try {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int[] marks = new int[5];

    System.out.println("Enter the array size");
    int n = sc.nextInt();

    System.out.println("Enter a marks");

    for (int i = 0; i < n; i++) {
      marks[i] = sc.nextInt();
    }

    System.out.println("Enter a arrayindex ");
    int ind = sc.nextInt();
    try {
      System.out.println("Welcome to vido number 82");
      try {
        System.out.println(marks[ind]);
      } catch (ArrayIndexOutOfBoundsException e) {
        System.out.println("sorry this index does not exit");
        System.out.println(e);
      }
    } catch (Exception e) {
      System.out.println(e);
    }

    System.out.println("Thanks for using this program");
  }

}
