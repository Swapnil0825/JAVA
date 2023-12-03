package Polymorphism.Methodoverloadind;

public class Test 
{
    void show(String a)
    {
        System.out.println("1st Method");
    }
    void show(String b,int a)
    {
        System.out.println("2nd Method");
    }

    public static void main(String args[])
    {
        Test sp=new Test();
        sp.show("Swapnil",100);

    }
}
