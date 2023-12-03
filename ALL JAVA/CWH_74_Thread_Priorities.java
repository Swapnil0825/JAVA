package Practice;
class MyThr2 extends Thread
{
     MyThr2(String name)
    {
        super(name);
    }
    public void run()
    {
        int i = 34;
        System.out.println("Thank you: " + this.getName());
        

    }
}

public class CWH_74_Thread_Priorities {
    public static void main(String[] args) 
    {
      
        MyThr2 t1 = new MyThr2("Swapnil");
        MyThr2 t2 = new MyThr2("Harshal");
        MyThr2 t3 = new MyThr2("Renuka");
        MyThr2 t4 = new MyThr2("Kalyani");
        MyThr2 t5 = new MyThr2("Dipali" );
        t5.setPriority(Thread.MAX_PRIORITY);
        t1.setPriority(Thread.MIN_PRIORITY);
        t2.setPriority(Thread.MIN_PRIORITY);
        t3.setPriority(Thread.MIN_PRIORITY);
        t4.setPriority(Thread.MIN_PRIORITY);
        t5.setPriority(Thread.MIN_PRIORITY);
    
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();

    }
}