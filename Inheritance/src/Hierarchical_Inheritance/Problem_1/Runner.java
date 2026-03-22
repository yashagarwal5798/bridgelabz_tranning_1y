package Hierarchical_Inheritance.Problem_1;

public class Runner {
    public static void main(String[] args) {
        SavingAccount s = new SavingAccount();
        s.accountNumber = 101;
        s.balance = 5000;
        s.interestRate = 4.5;

        CheckingAccount c = new CheckingAccount();
        c.accountNumber = 102;
        c.balance = 8000;
        c.withdrawalLimit = 2000;

        FixedDepositAccount f = new FixedDepositAccount();
        f.accountNumber = 103;
        f.balance = 20000;
        f.tenure = 12;

        s.printInfo();
        System.out.println();

        c.printInfo();
        System.out.println();

        f.printInfo();
    }
}
