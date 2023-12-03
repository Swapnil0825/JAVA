package Interface;

interface Vehicle 
{
    void start();
    
}
class car implements Vehicle
{
public void start()
     {
        System.out.println("Car start with the key");
     }
}
class Scooter implements Vehicle
{
    public void start()
        {
            System.out.println("Scooter start with the Kick");
        }    
        
        public static void main(String args[])
        {
            car sp=new car();
            sp.start();

            Scooter s=new Scooter();
            s.start();
            
        }
}
