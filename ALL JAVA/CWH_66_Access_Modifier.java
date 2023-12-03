package Practice;
class AM
{
   public int a=7;
   protected int b=8;
   private int c;
   int d=10;
   
   public void setC(int c)
   {
    this.c=c;
   }
   public int getX()
   {
    return c;
   }

}

public class CWH_66_Access_Modifier 
{
    public static void main(String[] args)
    {
        AM sp = new AM();
        System.out.println(sp.a);
        System.out.println(sp.b);
        sp.setC(20);
        System.out.println(sp.getX());
        //System.out.println(sp.c);
        System.out.println(sp.d);    
    }
    
}
