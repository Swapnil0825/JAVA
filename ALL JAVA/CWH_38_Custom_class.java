package Practice;

 class Employee
{
    int id;
    String name;
    public void print()
    {
        System.out.println(id);
        System.out.println(name);

    }

}

public class CWH_38_Custom_class 
{
    public static void main(String[] args) 
    {
      System.out.println("This is our custom class");  
      Employee sp = new Employee();
      sp.id=12;
      sp.name="Swapnil";
      sp.print();

      Employee hp = new Employee();
      hp.id=13;
      hp.name="Harshal";
      hp.print();

     
    }
    
}
