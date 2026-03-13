
public class Vehicle {
    String ownerName;
    String vehicleType;
    static double registrationFee = 1000;
    Vehicle(String ownerName, String vehicleType) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
    }
    void VehicleDetails() {
        System.out.println("Owner: " + ownerName + " Vehicle: " + vehicleType + " Fee: " + registrationFee);
    }
    static void updateRegistrationFee(double fee) {
        registrationFee = fee;
    }
    public static void main(String[] args) {
        Vehicle v1 = new Vehicle("Rahul", "Car");
        Vehicle v2 = new Vehicle("Amit", "Bike");
        v1.VehicleDetails();
        v2.VehicleDetails();
        Vehicle.updateRegistrationFee(1500);
        v1.VehicleDetails();
        v2.VehicleDetails();
    }
}