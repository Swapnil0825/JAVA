package Practice;
interface bicycle
{
    int a=45;
    void applybrake(int decrement);
    void speedup(int increment);
}
class Avoncycle implements bicycle
{
    int speed=7;
   public void applybrake(int decrement)
    {
        speed =speed-decrement;
        System.out.println(speed);


    }
    public void speedup(int increment)
    {
        int speed1= speed + increment;
        System.out.println(speed1);
    }
}


public class CWH_54_interface
{
    public static void main(String[] args) 
    {
        Avoncycle sp = new Avoncycle();
        sp.applybrake(2);
         sp.speedup(2);
    
        
        
               
    }
    
}
