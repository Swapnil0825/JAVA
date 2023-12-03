package Practice;
class mythread1 extends Thread
{
    public void run()
    {
        int i=0;
        while(i<20)
        {
            System.out.println("My thread is running ");
            System.out.println("I am happy");
            i++;

        }
      
    }
}
class mythread2 extends Thread
{
    int i=0;
    public void run()
    {
        while(i<20)
        {
            System.out.println("Thraed 2 is good ");
            System.out.println("I am sad");
            i++;

        }
      
    }
}

public class CWH_70_Extend_Thread 
{
    public static void main(String[] args) 
    {
        mythread1 t1 = new mythread1();
        mythread2 t2 = new mythread2();
        t1.start();
        t2.start();
    }
    
}
