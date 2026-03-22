package Single_inheritance.Problem_2;

public class Runner {
    public static void main(String[] args) {
        Thermostat t = new Thermostat();
        t.deviceId = "T101";
        t.status = "ON";
        t.temperatureSetting = 25;
        t.Print_Status();
    }
}
