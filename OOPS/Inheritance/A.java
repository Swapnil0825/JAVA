package Inheritance;

public class A 
{
    void show()
    {
        System.out.println("This is first class");
    }
    
}
class B extends A
{
    void show1()
    {
        System.out.println("This is second class");
    }
   
}
class C extends A
{
   void show2()
   {
    System.out.println("This is third class");
   }
   public static void main(String args[])
   {
       A sp=new A();
       sp.show();
      // sp.show1();
      // sp.show2();

       B s=new B();
       s.show();
       s.show1();
      // s.show2();

       C p=new C();
       p.show();
      // p.show1();
       p.show2();


   }
}