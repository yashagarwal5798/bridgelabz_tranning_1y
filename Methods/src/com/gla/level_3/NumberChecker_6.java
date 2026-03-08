package com.gla.level_3;
import java.util.Scanner;
public class NumberChecker_6 {
    static int Divisors(int n) {
        int sum = 0;
        for (int i = 1; i < n; i++) {
            if (n % i == 0)
                sum = sum + i;
        }
        return sum;
    }
    static boolean Perfect(int n) {
        return Divisors(n) == n;
    }
    static boolean Abundant(int n) {
        return Divisors(n) > n;
    }
    static boolean Deficient(int n) {
        return Divisors(n) < n;
    }
    static int factorial(int n) {
        int f = 1;
        for (int i = 1; i <= n; i++)
            f = f * i;
        return f;
    }
    static boolean Strong(int n) {
        int temp = n;
        int sum = 0;
        while (temp > 0) {
            int d = temp % 10;
            sum = sum + factorial(d);
            temp = temp / 10;
        }
        return sum == n;
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if (Perfect(num))
            System.out.println("Perfect Number");
        else
            System.out.println("Not Perfect Number");
        if (Abundant(num))
            System.out.println("Abundant Number");
        else
            System.out.println("Not Abundant Number");
        if (Deficient(num))
            System.out.println("Deficient Number");
        else
            System.out.println("Not Deficient Number");
        if (Strong(num))
            System.out.println("Strong Number");
        else
            System.out.println("Not Strong Number");
    }
}
