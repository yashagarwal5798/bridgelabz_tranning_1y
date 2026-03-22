package Problem_4;

class SavingsAccount extends BankAccount implements Loanable
{
    public SavingsAccount(int accNo, String name, double balance)
    {
        super(accNo, name, balance);
    }
    public double calculateInterest()
    {
        return getBalance() * 0.05;
    }
    public void applyForLoan(double amount)
    {
        if (calculateLoanEligibility()) {
            System.out.println("Loan Approved: " + amount);
        } else {
            System.out.println("Loan Denied");
        }
    }
    public boolean calculateLoanEligibility()
    {
        return getBalance() > 1000;
    }
}
