package Hybrid_Inheritance.Problem_2;

public class PetrolVehicle extends Vehicle implements Refuelable {
    public void printInfo() {
        super.printInfo();
        System.out.println("Type: Petrol Vehicle");
    }
    public void refuel() {
        System.out.println("Refueling petrol");
    }
}
