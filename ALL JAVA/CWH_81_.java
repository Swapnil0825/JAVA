package Practice;

import java.util.Scanner;

public class CWH_81_ 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int[] marks = new int[5];
        System.out.println("Enter the array size");
        int n =sc.nextInt();
        System.out.println("Enter a marks");
        for(int i=0;i<n;i++)
        {
            marks[i]=sc.nextInt();
        }

        System.out.println("Enter a arrayindex ");
        int ind=sc.nextInt();
        System.out.println("Enter a number divide by marks");
        int div = sc.nextInt();
        try
        {
            System.out.println("Marks of array index position is "+marks[ind]);
            System.out.println("Marks of array index position is "+marks[ind]/div);

        }
        catch(ArithmeticException e)
        {
            System.out.println("Arithmeticexception occured");
            System.out.println(e);
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("ArrayIndexOutOfBoundsExceptio occured");
            System.out.println(e);
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        
       


    }
    
}
