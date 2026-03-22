package Hybrid_Inheritance.Problem_1;

public class Chef extends Person implements Worker
{
     public void printInfo()
     {
        super.printInfo();
        System.out.println("Role: Chef");
    }
    public void performDuties()
    {
        System.out.println("Cooking food");
    }
}
