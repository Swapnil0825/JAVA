package Practice;

import javax.xml.transform.Source;

class practice13 extends Thread
{
    public void run()
    {
        while(true)
        {
            try
            {
                Thread.sleep(200);

            }catch(Exception e)
            {
                System.out.println(e);
            }
            System.out.println("Good Morning!");
        }
    }
}

class practice13b extends Thread
{
    public void run()
    {
        while(true)
        {
            try
            {
                Thread.sleep(200);

            }catch(Exception e)
            {
                System.out.println(e);
            }
          
            System.out.println("Welcome");
        }
    }
}
public class CWH_76_practice13
{
    public static void main(String[] args) 
    {
        practice13 p1 = new practice13();
        practice13b p2 = new practice13b();
       // p1.setPriority(6);
       // p2.setPriority(9);
        System.out.println(p1.getPriority());
        System.out.println(p2.getPriority());
        System.out.println(p2.getState());
        //p1.start();
        //p2.start();
        System.out.println(Thread.currentThread().getState());
        
    }
    
}
