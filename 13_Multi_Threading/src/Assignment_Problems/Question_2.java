package Assignment_Problems;

class Delivery implements Runnable
{
    String orderName;
    String type;
    Delivery(String orderName, String type)
    {
        this.orderName = orderName;
        this.type = type;
    }
    public void run()
    {
        try
        {
            long start = System.currentTimeMillis();
            System.out.println(orderName+ " "+ type +"Picked up "+Thread.currentThread().getName());
            Thread.sleep(1000);
            System.out.println(orderName+" "+type+"In Transit "+Thread.currentThread().getName());
            Thread.sleep(1500);
            System.out.println(orderName+" "+type+"Delivered"+Thread.currentThread().getName());
            long end = System.currentTimeMillis();
            System.out.println(orderName+ " " + (end - start) + "ms");

        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}

public class Question_2
{
    public static void main(String[] args)
    {
        Delivery d1 = new Delivery("Order1","Express");
        Delivery d2 = new Delivery("Order2","Standard");
        Delivery d3 = new Delivery("Order3","Express");
        Thread t1 = new Thread(d1,"Agent-1");
        Thread t2 = new Thread(d2,"Agent-2");
        Thread t3 = new Thread(d3,"Agent-3");

        t1.setPriority(10);
        t3.setPriority(10);
        t2.setPriority(5);

        t1.start();
        t2.start();
        t3.start();
    }
}
