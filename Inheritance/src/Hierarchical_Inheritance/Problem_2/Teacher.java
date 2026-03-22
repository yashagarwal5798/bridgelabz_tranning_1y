package Hierarchical_Inheritance.Problem_2;

public class Teacher extends Person
{
    String subject;

     public void printInfo()
     {
        super.printInfo();
        System.out.println("Role: Teacher");
        System.out.println("Subject: " + subject);
    }
}
