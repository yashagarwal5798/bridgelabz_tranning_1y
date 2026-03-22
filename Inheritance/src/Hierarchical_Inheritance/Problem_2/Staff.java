package Hierarchical_Inheritance.Problem_2;

public class Staff extends Person
{
    String department;
    public  void printInfo()
    {
        super.printInfo();
        System.out.println("Role: Staff");
        System.out.println("Department: " + department);
    }
}
