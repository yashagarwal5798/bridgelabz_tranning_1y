package Static_in_Method_Interface.Problem_2;

public interface UnitConverter
{
    static double kmToMiles(double km)
    {
        return km * 0.621371;
    }
    static double kgToLbs(double kg)
    {
        return kg * 2.20462;
    }
}
