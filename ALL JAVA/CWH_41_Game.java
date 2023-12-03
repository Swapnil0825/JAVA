package Practice;
import java.util.Random;
import java.util.Scanner;
public class CWH_41_Game 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Select 0.Stone 1.Paper 2.Scissor");
        int userInput=sc.nextInt();

        Random random = new Random();
        int computerInput=random.nextInt(3);

        if(userInput==computerInput)
        {
            System.out.println("Draw");
        }else if(userInput==0 && computerInput==2 || userInput==1 && computerInput==0 || userInput==2 && computerInput==1)
        {
            System.out.println("You Win !!");

        }else
        {
            System.out.println("Loss");
        }
        System.out.println("Computer Choice"+computerInput);

    }
        
}
    

