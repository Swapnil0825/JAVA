package Practice;

public class CWH_32Method_overloading {
    
     void foot()
    {
        System.out.println("Good Morning bro!!");
    }

     void foot(int a)
    {
        System.out.println("Good morning " + a + " bro!!");
    }
    
    public static void main(String[] args) 
    {
        CWH_32Method_overloading sp = new CWH_32Method_overloading();
        sp.foot();
        sp.foot(300);
        
    }
    
}
