package Practice;
interface sampleInterface
{
    void meth1();
    void meth2();
}

interface childSampleInterface extends sampleInterface
{
    void meth3();
    void meth4();
}
class MySampleClass implements childSampleInterface
{
   public void meth1()
    {
        System.out.println("Method 1");
    }
    public void meth2()
    {
        System.out.println("Method 2");
    }
    public void meth3()
    {
        System.out.println("Method 3");
    }
    public void meth4()
    {
        System.out.println("Method 4");
    }

}

public class CWH_58_inheritance_interfaces 
{
    public static void main(String[] args)
    {
        MySampleClass sp = new MySampleClass();
        sp.meth1();
        sp.meth2();
        sp.meth3();
        sp.meth4();

        
    }
    
}
