package Hierarchical_Inheritance.Problem_1;

public class CheckingAccount extends BankAccount
{
    double withdrawalLimit;
     public void printInfo()
     {
        super.printInfo();
        System.out.println("Account Type: Checking");
        System.out.println("Withdrawal Limit: " + withdrawalLimit);
    }
}
