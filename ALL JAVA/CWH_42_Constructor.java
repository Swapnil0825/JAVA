package Practice;
class MyMainEmployee{
    private int id;
    private String name;
    private int salary;

    public MyMainEmployee()
    {
        id=25;
        name="Swapnil Patil";

    }

    public MyMainEmployee(String myName,int myId)
    {
        id=myId;
        name=myName;

    }
    public MyMainEmployee(int salary)
    {
       this.salary=salary;
    }

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
    public void setSalary(int salary)
    {
        this.salary = salary;
    }
    public int getSalary()
    {
        return salary;
    }
 }

public class CWH_42_Constructor
 
{
    public static void main(String[] args) {
     //MyMainEmployee sp = new MyMainEmployee("Swapnil",45);
     MyMainEmployee sp = new MyMainEmployee(10000);
     
     //sp.setId(12);
     //sp.setName("Swapnil");   
    // System.out.println(sp.getId());
     //System.out.println(sp.getName());
     sp.setSalary(11000);
     System.out.println(sp.getSalary());
    }
    

}
