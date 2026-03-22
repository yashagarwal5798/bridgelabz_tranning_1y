package Problem_2;

public class Runner
{
    public static void main(String[] args) {

        Product p1 = new Electronics(1, "Laptop", 50000);
        Product p2 = new Clothing(2, "Shirt", 2000);
        Product p3 = new Groceries(3, "Rice", 1000);

        p1.display();
        p2.display();
        p3.display();
    }
}
