package Practice;
import java.util.Scanner;
public class CWH_18_elseif
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your character");
        char age = sc.next().charAt(0);

         switch(age)
         {
            case 'r':
                 System.out.println("You are going to become an Adult!!");
                 break;

            case 'l':
                 System.out.println("You are going to join a job!!");
                 break;

            case 'k':
                 System.out.println("You are going to grt retired!!");
                 break;
                
            default:
                System.out.println("Enjoy your Life");

        }
        System.out.println("Thank for using my Java Code!");



        /* 
        if(age>56)
        {
            System.out.println("You are Experienced!!");
        }else if(age>46)
        {
            System.out.println("You are semi Experienced!!");

        }else if(age>36)
        {
            System.out.println("You are semi semo Experienced!!");
        }else
        {
            System.out.println("You are Not Experienced!!");
        }
        if(age>2)
        {
            System.out.println("You are not a baby");
        }
        */
        

        
    }
    
}
