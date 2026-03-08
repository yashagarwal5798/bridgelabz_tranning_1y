package com.gla.level_2;
import java.util.Scanner;
public class CheckNumber {
    public static boolean Positive(int n) {
        if (n >= 0)
            return true;
        else
            return false;
    }
    public static boolean Even(int n) {
        if (n % 2 == 0)
            return true;
        else
            return false;
    }
    public static int compare(int n1, int n2) {
        if (n1 > n2)
            return 1;
        else if (n1 == n2)
            return 0;
        else
            return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[5];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            arr[i] = sc.nextInt();
            if (Positive(arr[i])) {
                if (Even(arr[i]))
                    System.out.println("Positive Even");
                else
                    System.out.println("Positive Odd");
            } else {
                System.out.println("Negative");
            }
        }
        int result = compare(arr[0], arr[4]);
        if (result == 1)
            System.out.println("First element is greater than last element");
        else if (result == 0)
            System.out.println("First and last elements are equal");
        else
            System.out.println("First element is less than last element");
    }
}

