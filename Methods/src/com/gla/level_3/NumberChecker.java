package com.gla.level_3;
import java.util.Scanner;
public class NumberChecker {
    static int countDigits(int n) {
        int count = 0;
        while (n > 0) {
            count++;
            n = n / 10;
        }
        return count;
    }
    static int[] getDigits(int n, int size) {
        int d[] = new int[size];
        for (int i = size - 1; i >= 0; i--) {
            d[i] = n % 10;
            n = n / 10;
        }
        return d;
    }
    static boolean isDuck(int d[]) {
        for (int i = 0; i < d.length; i++) {
            if (d[i] == 0)
                return true;
        }
        return false;
    }
    static boolean Armstrong(int d[], int num) {
        int sum = 0;
        int p = d.length;
        for (int i = 0; i < d.length; i++) {
            sum += Math.pow(d[i], p);
        }
        return sum == num;
    }
    static void largestSecond(int d[]) {
        int largest = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;

        for (int i = 0; i < d.length; i++) {
            if (d[i] > largest) {
                second = largest;
                largest = d[i];
            } else if (d[i] > second && d[i] != largest) {
                second = d[i];
            }
        }
        System.out.println("Largest: " + largest);
        System.out.println("Second Largest: " + second);
    }
    static void smallestSecond(int d[]) {
        int smallest = Integer.MAX_VALUE;
        int second = Integer.MAX_VALUE;
        for (int i = 0; i < d.length; i++) {
            if (d[i] < smallest) {
                second = smallest;
                smallest = d[i];
            } else if (d[i] < second && d[i] != smallest) {
                second = d[i];
            }
        }
        System.out.println("Smallest: " + smallest);
        System.out.println("Second Smallest: " + second);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int count = countDigits(num);
        int digits[] = getDigits(num, count);
        System.out.println("Digits count: " + count);
        if (isDuck(digits))
            System.out.println("Duck Number");
        else
            System.out.println("Not Duck Number");
        if (Armstrong(digits, num))
            System.out.println("Armstrong Number");
        else
            System.out.println("Not Armstrong Number");
        largestSecond(digits);
        smallestSecond(digits);
    }
}
