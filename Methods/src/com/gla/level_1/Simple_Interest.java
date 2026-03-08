package com.gla.level_1;

import java.util.Scanner;

public class Simple_Interest
{
        public  static double Calculate(double a, double b, double c)
        {
            double si = (a*b*c)/100;
            return si;
        }
        public static void main(String[] args)
        {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter Principal: ");
            double a = sc.nextDouble();
            System.out.print("Enter Rate of Interest: ");
            double b = sc.nextDouble();
            System.out.print("Enter Time: ");
            double c = sc.nextDouble();

            double Simple_Interest = Calculate(a,b,c);
            System.out.println(+Simple_Interest);

        }
}
