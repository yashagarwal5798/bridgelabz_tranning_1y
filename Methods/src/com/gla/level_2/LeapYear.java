package com.gla.level_2;

import java.util.Scanner;
public class LeapYear {
    public static boolean LeapYear(int year) {
        if (year >= 1582) {
            if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0))
                return true;
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        if (LeapYear(year))
            System.out.println("Year is a Leap Year");
        else
            System.out.println("Year is not a Leap Year");
    }
}
