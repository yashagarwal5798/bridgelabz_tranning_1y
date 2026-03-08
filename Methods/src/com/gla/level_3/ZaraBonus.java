package com.gla.level_3;
public class ZaraBonus {
    static double[][] Data(int n) {
        double data[][] = new double[n][2];
        for (int i = 0; i < n; i++) {
            data[i][0] = 10000 + (int)(Math.random() * 90000);
            data[i][1] = (int)(Math.random() * 10);
        }
        return data;
    }
    static double[][] Bonus(double data[][]) {
        double result[][] = new double[data.length][2];
        for (int i = 0; i < data.length; i++) {
            double salary = data[i][0];
            double years = data[i][1];
            double bonus;
            if (years > 5)
                bonus = salary * 0.05;
            else
                bonus = salary * 0.02;
            result[i][0] = salary + bonus;
            result[i][1] = bonus;
        }
        return result;
    }
    static void display(double data[][], double result[][]) {
        double oldSum = 0, newSum = 0, bonusSum = 0;
        System.out.println("OldSalary  Years  Bonus  NewSalary");
        for (int i = 0; i < data.length; i++) {
            double oldSalary = data[i][0];
            double years = data[i][1];
            double bonus = result[i][1];
            double newSalary = result[i][0];
            oldSum += oldSalary;
            newSum += newSalary;
            bonusSum += bonus;
            System.out.println(oldSalary + "    " + years + "    " + bonus + "    " + newSalary);
        }
        System.out.println("Total Old Salary = " + oldSum);
        System.out.println("Total Bonus = " + bonusSum);
        System.out.println("Total New Salary = " + newSum);
    }
    public static void main(String[] args) {
        int n = 10;
        double data[][] = Data(n);
        double result[][] = Bonus(data);
        display(data, result);
    }
}
