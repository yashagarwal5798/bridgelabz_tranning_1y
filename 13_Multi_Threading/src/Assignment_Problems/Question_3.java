package Assignment_Problems;

class Task implements Runnable
{
    String name;
    Task(String name)
    {
        this.name = name;
    }
    public void run()
    {
        try
        {
            System.out.println(name+" started "+Thread.currentThread().getName());
            Thread.sleep(1000);
            System.out.println(name+" completed "+Thread.currentThread().getName());
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
    }
}

public class Question_3
{
    public static void main(String[] args)
    {
        Task t1 = new Task("Task-1");
        Task t2 = new Task("Task-2");
        Task t3 = new Task("Task-3");
        Thread th1 = new Thread(t1, "Thread-1");
        Thread th2 = new Thread(t2, "Thread-2");
        Thread th3 = new Thread(t3, "Thread-3");
        th1.start();
        th2.start();
        th3.start();
        try
        {
            th1.join();
            th2.join();
            th3.join();
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
    }
}
