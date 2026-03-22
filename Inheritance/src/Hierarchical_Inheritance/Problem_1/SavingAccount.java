package Hierarchical_Inheritance.Problem_1;

public class SavingAccount extends BankAccount
{
    double interestRate;
      public void printInfo()
      {
        super.printInfo();
        System.out.println("Account Type: Savings");
        System.out.println("Interest Rate: " + interestRate);
    }
}
