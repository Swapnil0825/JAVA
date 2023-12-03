package Practice;
class phone
{
    public void greet()
    {
        System.out.println("I am greet");
    }
    public void Name()
    {
        System.out.println("I am Java");
    }
    
}
class smartphone extends phone
{
    public void Name()
    {
        System.out.println("I am java with extended class");
    }
    public void a()
    {
        System.out.println("I am method a");
    }

}

public class CWH_49_Dynamic_Method_Dispatch
{
    public static void main(String[] args) 
    {
        phone sp=new smartphone();
        sp.Name();
        sp.greet();
        //sp.a(); ---> Can not call 
    }
    
}
