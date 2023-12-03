package Practice;
abstract class pen
{
    abstract void write();
    abstract void refill();
}

class fountainPen extends pen{
    public void write()
    {
        System.out.println("Write");
    }
    public void refill()
    {
        System.out.println("Refill");
    }
    public void changeName()
    {
        System.out.println("Changing the name");
    }
}

class Monkey
{
    public void jump()
    {
        System.out.println("Jumping....");
    }
    public void bite()
    {
         System.out.println("Barking....");
    }
}
interface BasicAnimal
{
    void eat();
    void sleep();
}


class Human extends Monkey implements BasicAnimal
{
    public void eat()
    {
        System.out.println("eating...");
    }
    public void sleep()
    {
        System.out.println("Sleeping....");
    }


}

abstract class TelePhone
{
    abstract void ring();
    abstract void lift();
    abstract void disconnect();

}
class SmartTelephone extends TelePhone
{
    public void ring()
    {
        System.out.println("Ringing....");
    }
    public void lift()
    {
        System.out.println("lifting....");
    }
    public void disconnect()
    {
        System.out.println("disconnecting....");
    }

    public void ConcritMethod()
    {
        System.out.println("This is concrete Methhod");
    }

}

interface TVRemote
{
    void click();

}
interface smartTvRemote extends TVRemote
{
    void blutoothespeak();
}
class Tv implements TVRemote
{
    public void click()
    {
        System.out.println("Clicking...");
    }
}

public class CWH_60_11ps 
{
    public static void main(String[] args) 
{
    // Q1 & Q2
   // fountainPen sp = new fountainPen();
    //sp.changeName();

     // Q3 & Q5
   // Monkey sp = new Human();
   // sp.jump();
    //sp.bite();
    //sp.sleep(); ---> Not Allowed 

    // Q4
    //TelePhone sp = new SmartTelephone();
    //sp.ConcritMethod(); ---->Not Allowed
    //sp.ring();
    //sp.lift();
    //sp.disconnect(); 

    //Q5 & Q6
    Tv sp = new Tv();
    sp.click();

}
    
}
