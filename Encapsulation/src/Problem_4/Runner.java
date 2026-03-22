package Problem_4;

public class Runner {
    public static void  main(String[] args)
    {
        BankAccount a1 = new SavingsAccount(1, "Yash", 3000);
        BankAccount a2 = new CurrentAccount(2, "Agarwal", 6000);

        System.out.println("Interest: " + a1.calculateInterest());
        System.out.println("Interest: " + a2.calculateInterest());

        ((Loanable)a1).applyForLoan(2000);
        ((Loanable)a2).applyForLoan(4000);
    }
}
