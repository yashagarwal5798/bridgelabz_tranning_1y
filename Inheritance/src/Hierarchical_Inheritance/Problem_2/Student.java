package Hierarchical_Inheritance.Problem_2;

public class Student extends Person
{
    String grade;
     public void printInfo()
     {
        super.printInfo();
        System.out.println("Role: Student");
        System.out.println("Grade: " + grade);
     }
}
