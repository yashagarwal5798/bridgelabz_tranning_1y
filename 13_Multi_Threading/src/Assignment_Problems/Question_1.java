package Assignment_Problems;

class BankAccount implements Runnable
{
    String name;
    String type;
    BankAccount(String name, String type)
    {
        this.name = name;
        this.type = type;
    }

    public void run()
    {
        for (int i=1;i<=3;i++)
        {
            System.out.println(name+ "(" + type + ")balance : " + Thread.currentThread().getPriority());

            try{
                Thread.sleep(2000);
            }
            catch (Exception e)
            {
                System.out.println(e);
            }
        }
    }
}

public class Question_1
{
    public static void main(String[] args)
    {
        BankAccount u1 = new BankAccount("Shivam", "Premium");
        BankAccount u2 = new BankAccount("Rahul", "Regular");
        BankAccount u3 = new BankAccount("Amit", "Basic");

        Thread t1 = new Thread(u1);
        Thread t2 = new Thread(u2);
        Thread t3 = new Thread(u3);

        t1.setPriority(10);
        t2.setPriority(5);
        t3.setPriority(1);

        t1.start();
        t2.start();
        t3.start();
    }
}
