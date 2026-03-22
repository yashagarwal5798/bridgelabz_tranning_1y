package Problem_4;

abstract class BankAccount
{
    private int accountNumber;
    private String holderName;
    private double balance;
    public BankAccount(int accountNumber, String holderName, double balance)
    {
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.balance = balance;
    }
    public double getBalance()
    {
        return balance;
    }
    public void deposit(double amount)
    {
        balance += amount;
    }
    public void withdraw(double amount)
    {
        if (amount <= balance) {
            balance -= amount;
        }
    }
    public abstract double calculateInterest();
}
