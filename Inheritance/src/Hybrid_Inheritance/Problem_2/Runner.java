package Hybrid_Inheritance.Problem_2;

public class Runner {
    public static void main(String[] args) {
        ElectricVehicle e = new ElectricVehicle();
        e.model = "Tesla";
        e.maxSpeed = 200;

        PetrolVehicle p = new PetrolVehicle();
        p.model = "Honda";
        p.maxSpeed = 180;

        e.printInfo();
        e.charge();

        System.out.println();

        p.printInfo();
        p.refuel();
    }
}
