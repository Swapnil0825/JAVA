package Practice;
class myThr1 extends Thread{
    myThr1(String Name)
    {
        super(Name);
        System.out.println("Thank You!!");

    }
    public void run()
    {
        int i=45;
       
    }
}

public class CWH_73_Constr_Thread 
{
    public static void main(String[] args) 
    {
        myThr1 sp = new myThr1("Swapnil");
        sp.start();
        System.out.println("My Thread is is "+sp.getId());
       System.out.println("My thread name is "+sp.getName());

        myThr1 sp1 = new myThr1("Patil");
        sp1.start();
        System.out.println("My Thread is is "+sp1.getId());
        System.out.println("My thread name is "+sp1.getName());

        
    }
    
}
