public class Runner {
    public static void main(String[] args)
    {
        // com.Employee
        Employee emp1 = new Employee("Yash ",71, 50000);
        emp1.displayDetails();

        // com.Circle
        Circle  c1 = new Circle(5);
        Circle c2 = new Circle(7);
        System.out.println("circle 1 ");
        c1.result();
        System.out.println("circle 2");
        c2.result();

        // com.Item
        Item item1 = new Item(23, "laptop", 50000);
        Item item2 = new Item(34, "Mouse", 1000);
        System.out.println("com.Item 1");
        item1.result(2);
        System.out.println("com.Item 2");
        item2.result(2);

        // com.MobilPhone
        MobilePhone phone1 = new MobilePhone("apple","iphone 17", 100000);
        MobilePhone phone2 = new MobilePhone("samsung","S26",80000);
        System.out.println("Phone 1");
        phone1.result();
        System.out.println("phone 2");
        phone2.result();

        // Student
        Student s1 = new Student("Ram ", 41, 87);
        Student s2 = new Student("Sita", 45, 98);
        System.out.println("Student 1 ");
        s1.result();
        System.out.println("Student 2");
        s2.result();

        // BankAccount
        BankAccount account1 = new BankAccount("Rahul", 12345, 10000);
        account1.result();
        account1.deposit(2000);
        account1.withdraw(3000);
        System.out.println("\nAfter Transactions:");
        account1.result();



    }
}
