package Practice;
interface camera
{
    void takeSnap();
    void recordVideo();
    
    private void greet()
    {
        System.out.println("Good Morning");
    }

    default void record4k()
    {
        greet();
        System.out.println("Recording in 4k");
    }


}


interface wifi
{
    String[] getNetwork();
    void connectToNetwork(String network);
}

class Mycellphone
{
    void callNumber(int phoneNumber)
    {
        System.out.println("Calling"+phoneNumber);
    }

    void pickCall()
    {
        System.out.println("Connecting...");
    }

  
}

class MySmartphone extends Mycellphone implements wifi,camera
{
       public void takeSnap()
    {
        System.out.println("Taking Snap");
    }
    public void recordVideo()
    {
        System.out.println("Taking Snap");
    }
    public String[] getNetwork()
    {
        System.out.println("Getting list of Network");
        String [] NetworkList={"Swapnil","Patil"};
        return NetworkList;

    }
    public  void connectToNetwork(String network)
    {
        System.out.println("Connectimg to "+network);
       
    }
//    public void record4k()
//    {
 //       System.out.println("Recording in 4k");
 //   }
  
}

public class CWH_57_Default_method 
{
    public static void main(String[] args) 
    {
        MySmartphone sp = new MySmartphone();
        sp.record4k();
        String [] ar = sp.getNetwork();
        for(String item: ar)
        {
            System.out.println(item);
        }
        sp.connectToNetwork("Swapnil");
       
        
    }
    
}
