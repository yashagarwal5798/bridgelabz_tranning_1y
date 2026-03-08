package com.gla.level_3;
import java.util.Scanner;
public class Numberchecker_4 {
    static int countDigits(int n) {
        int count = 0;
        while (n != 0) {
            count++;
            n = n / 10;
        }
        return count;
    }
    static int[] storeDigits(int n, int size) {
        int d[] = new int[size];
        for (int i = size - 1; i >= 0; i--) {
            d[i] = n % 10;
            n = n / 10;
        }
        return d;
    }
    static int[] reverse(int a[]) {
        int r[] = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            r[i] = a[a.length - 1 - i];
        }
        return r;
    }
    static boolean compare(int a[], int b[]) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] != b[i])
                return false;
        }
        return true;
    }
    static boolean Palindrome(int d[]) {
        int r[] = reverse(d);
        return compare(d, r);
    }
    static boolean Duck(int d[]) {
        for (int i = 0; i < d.length; i++) {
            if (d[i] == 0)
                return true;
        }
        return false;
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int c = countDigits(num);
        int digits[] = storeDigits(num, c);
        System.out.println("Digits count: " + c);
        if (Palindrome(digits))
            System.out.println("Palindrome Number");
        else
            System.out.println("Not Palindrome");
        if (Duck(digits))
            System.out.println("Duck Number");
        else
            System.out.println("Not Duck Number");
    }
}
