package MultiLevel_Inheritance.Problem_2;

public class PaidOnlineCourse extends OnlineCourse {
    double fee;
    double discount;
   public  void printInfo()
   {
        super.printInfo();
        System.out.println("Fee: " + fee);
        System.out.println("Discount: " + discount);
    }
}
