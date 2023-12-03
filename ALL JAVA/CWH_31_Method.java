package Practice;

public class CWH_31_Method 
{
 int logic(int x,int y)
{
    int z;
    if(x>y)
    {
        z=x+y;

    }else{
        z=x-y;
    }
    return z;

}

    public static void main(String[] args) 
    {
        int a=14;
        int b=6;
        CWH_31_Method sp = new CWH_31_Method();
        int c=sp.logic(a,b);

        int a1=6;
        int b1=9;
        int c1;
         if(a1>b1)
         {
            c1=a1+b1;
         }else{
            c1=a1-b1;
         }
        System.out.println(c);
        System.out.println(c1);
    }
    
}
