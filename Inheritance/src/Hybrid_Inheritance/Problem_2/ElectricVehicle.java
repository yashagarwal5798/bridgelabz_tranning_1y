package Hybrid_Inheritance.Problem_2;

public class ElectricVehicle extends Vehicle {
   public  void printInfo() {
        super.printInfo();
        System.out.println("Type: Electric Vehicle");
    }
    void charge() {
        System.out.println("Charging battery");
    }
}
