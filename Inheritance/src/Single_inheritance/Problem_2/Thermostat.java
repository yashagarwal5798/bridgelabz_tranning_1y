package Single_inheritance.Problem_2;

public class Thermostat extends Device
{
    int temperatureSetting;
   public void Print_Status()
    {
        super.PrintStatus();
        System.out.println("Temperature: " + temperatureSetting);
    }
}
