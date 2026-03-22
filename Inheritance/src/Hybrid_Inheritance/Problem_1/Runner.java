package Hybrid_Inheritance.Problem_1;

public class Runner {
    public static void main(String[] args) {
        Chef c = new Chef();
        c.name = "Shivam";
        c.id = 1;

        Waiter w = new Waiter();
        w.name = "Rahul";
        w.id = 2;

        c.printInfo();
        c.performDuties();

        System.out.println();

        w.printInfo();
        w.performDuties();
    }

}
