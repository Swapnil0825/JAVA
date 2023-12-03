package Practice;
abstract class parent2
{
    public parent2()
    {
        System.out.println("Constructor ");
    }
    public void sayhello()
    {
        System.out.println("Hello");
    }
    abstract void greet();
    abstract void greet2();
}
class child2 extends parent2
{
    public void greet()
    {
        System.out.println("Hii Good Morning");
    }
   public void greet2()
    {
        System.out.println("Hii good afternoon");
    }
}
abstract class child3 extends parent2
{
    public void th() 
    {
        System.out.println("I am good");
    }

}
class child4 extends child3
{

}
public class CWH_53_Abstract 
{
    public static void main(String[] args) 
    {
        child2 sp = new child2();
        sp.greet();
        sp.greet2(); 

        child4 sp1 = new child4();
        sp1.th();

    }


    
}
