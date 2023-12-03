package Practice;
class Base1
{
    int x;
    Base1()
    {
        System.out.println("I am a constructor of Base Class");
    }
    Base1(int x)
    {
        System.out.println("I am a overloaded constructor wirth value of x as "+x);
    }
    public void setX(int x)
    {
        this.x=x;
    }
    public int getX()
    {
        return x;
    }
}

    class Derived1 extends Base1
{
    Derived1()
    {
       // super(0);
        System.out.println("I am a constructor of Derived class");
    }
    Derived1(int x,int y)
    {
        super(x);
        System.out.println("I am an overloaded constructor of derived with value of y  as "+y);

    }
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

public class CWH_46_Constructor_Inheritance
{
    public static void main(String[] args) 
    { 
        //Base1 sp = new Base1();
        Derived1 sp=new Derived1(14,9);

        
    }
    
}
