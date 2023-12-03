package Practice;

import java.util.Scanner;

class myException extends Exception
{
    @Override
    public String toString() 
    {    
        return super.toString()+"I am toString()";
    }


    @Override
    public String getMessage() 
    {
        return super.getMessage()+"I am getMessage()";
    }
    
}


public class CWH_83_Exception_Class 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int a =sc.nextInt();
        if(a<9)
        {
            try{
                throw new myException();
            }
            catch(Exception e)
            {
                System.out.println(e.getMessage());
            }

        }

        
    }
    
}
