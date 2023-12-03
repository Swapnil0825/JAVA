package Polymorphism.Methodoverriding;

public class Test 
{
    void show()
    {
       System.out.println("1st Method"); 
        
    }
    
}

class Abc 
{
    void show()
    {
        System.out.println("2nd Method"); 
        
        
    }
    public static void main(String args[])
    {
        Test s=new Test();
        s.show();

        Abc sp=new Abc();
        sp.show();
    }
}
