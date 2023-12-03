package Practice;
interface camera2
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


interface wifi2
{
    String[] getNetwork();
    void connectToNetwork(String network);
}

class Mycellphone2
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

class MySmartphone2 extends Mycellphone2 implements wifi2,camera2
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
public class CWH_59_polymorphism 
{
    public static void main(String[] args)
     
    {
        camera2 sp = new MySmartphone2();//This is a smartphone but use it as a camera
        //sp.getNetwork();-----> Not allowed
    }
    
    
}
