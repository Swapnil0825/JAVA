package Practice;
 class myEmployee{
    private int id;
    private String name;

    public void setId(int a)
    {
        id=a;
    }
    public int getId()
    {
        return id;
    }

    public void setName(String n )
    {
        name=n;
    }
    public String getName()
    {
        return name;
    }
 }

public class CWH_40_Access_Modifier 
{
    public static void main(String[] args) 
    {
        myEmployee sp = new myEmployee();
        sp.setName("Swapnil");
        System.out.println(sp.getName());
        
        sp.setId(12);
        System.out.println(sp.getId());
    }
    
}
