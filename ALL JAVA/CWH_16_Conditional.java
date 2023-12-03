package Practice;
import java.util.Scanner;

public class CWH_16_Conditional
{
    
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the age");
        int a=sc.nextInt();
        if(a>18)
        {
            System.out.println("You can Drive a car");
        }else
        {
            System.out.println("You can not Drive a car");

        }
        
    } 
    
}
