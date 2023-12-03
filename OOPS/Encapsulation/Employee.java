package Encapsulation;

public class Employee 
{
    private int empid=7;
    public void setEmpid(int eid) 
    {
        empid=eid;
    }
    public int getEmpid() 
    {
       return empid;
    }     
}
class Abc
{
    public static void main(String args[])
    {
        Employee e=new Employee();
        e.setEmpid(10);
        System.out.println(e.getEmpid());
    }

}
