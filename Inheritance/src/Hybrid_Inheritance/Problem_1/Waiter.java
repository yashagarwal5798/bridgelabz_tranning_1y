package Hybrid_Inheritance.Problem_1;

public class Waiter extends Person implements Worker
{
   public  void printInfo()
   {
        super.printInfo();
        System.out.println("Role: Waiter");
    }
    public void performDuties()
    {
        System.out.println("Serving customers");
    }
}
