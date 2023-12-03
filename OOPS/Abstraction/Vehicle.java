package Abstraction;

abstract class Vehicle 
{
    int n=10;
    abstract void start();
    void show()
    {
        System.out.println("This is Concrete Method");
    }
}
class car extends Vehicle
{
  void start()
  {
     System.out.println("Car Start with key");
  }
}
class Scooter extends Vehicle
{
    
    void start()
    {
        
        System.out.println("Scooter Start with Kick");
    }

    public static void main(String args[])
    {
        //Vehicle p=new Vehicle();
        //p.start();

        car sp=new car();
        sp.show();
        sp.start();

        Scooter s=new Scooter();
        s.show();
        s.start();

    }
}
