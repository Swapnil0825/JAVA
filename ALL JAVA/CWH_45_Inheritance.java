package Practice;

class Base
{
    int x;
    public void setX(int x)
    {
        System.out.println("I am in base and Setting X Now");
        this.x=x;
    }
    public int getX()
    {
        return x;
    }

    public void printMe()
    {
        System.out.println("I am a constructor");
    }
}

class Derived extends Base
{
    int y;
    public void setY(int y)
    {
        this.y=y;

    }
    public int getY()
    {
        return y;
    }

}


public class CWH_45_Inheritance 
{
    public static void main(String[] args) 
    { 
        //creating object of Base class
        Base sp = new Base();
        sp.setX(4);
        System.out.println(sp.getX());  

        //creatinf an object of Derived Class
        Derived s = new Derived();
        s.setX(43);
        System.out.println(s.getX());
        s.setY(44);
        System.out.println(s.getY());


        
        
    }
    
}
