package Funtional_Interface;

import java.util.function.Predicate;
public class TemperatureAlert
{
    public static void main(String[] args)
    {
        Predicate<Double> isHighTemp = t -> t > 30;
        double temperature = 35.5;
        if (isHighTemp.test(temperature))
        {
            System.out.println("Alert: High Temperature!");
        } else
        {
            System.out.println("Temperature Normal");
        }
    }
}
