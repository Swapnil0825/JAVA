package Practice;
class cylinder
{

    
   private int radius;
   private int height;

   public void setRadius(int radius)
   {
    this.radius=radius;
   }

   public int getRadius()
   {
    return radius;
   }

   public void setHeight(int height)
   {
     this.height=height;
   }

   public int getHeight()
   {
    return height;
   }
}
public class CWH_44_PS09 
{
    public static void main(String[] args) 
    {
        // problem No 1
        cylinder sp = new cylinder();
        sp.setRadius(20);
        System.out.println(sp.getRadius());
        sp.setHeight(40);
        System.out.println(sp.getHeight());

        
    }

    
}
