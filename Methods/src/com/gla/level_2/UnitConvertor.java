package com.gla.level_2;
import java.util.Scanner;

public class UnitConvertor {
    public static double KmToMiles(double km) {
        double km2miles = 0.621371;
        return km * km2miles;
    }
    public static double MilesToKm(double miles) {
        double miles2km = 1.60934;
        return miles * miles2km;
    }
    public static double MetersToFeet(double meters) {
        double meters2feet = 3.28084;
        return meters * meters2feet;
    }
    public static double FeetToMeters(double feet) {
        double feet2meters = 0.3048;
        return feet * feet2meters;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter kilometers: ");
        double km = sc.nextDouble();
        System.out.println("Miles = " + KmToMiles(km));
        System.out.print("Enter miles: ");
        double miles = sc.nextDouble();
        System.out.println("Kilometers = " + MilesToKm(miles));
        System.out.print("Enter meters: ");
        double meters = sc.nextDouble();
        System.out.println("Feet = " + MetersToFeet(meters));
        System.out.print("Enter feet: ");
        double feet = sc.nextDouble();
        System.out.println("Meters = " + FeetToMeters(feet));
    }
}
