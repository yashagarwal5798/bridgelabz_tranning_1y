package Hierarchical_Inheritance.Problem_1;

public class FixedDepositAccount extends BankAccount {
    int tenure;
     public void printInfo()
     {
        super.printInfo();
        System.out.println("Account Type: Fixed Deposit");
        System.out.println("Tenure: " + tenure + " months");
    }
}
