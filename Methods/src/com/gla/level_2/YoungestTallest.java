package com.gla.level_2;

import java.util.Scanner;
public class YoungestTallest {

    public static void Youngest(int age[], String names[]) {
        int min_Index = 0;
        for (int i = 1; i < age.length; i++) {
            if (age[i] < age[min_Index]) {
                min_Index = i;
            }
        }
        System.out.println(names[min_Index]);
    }
    public static void Tallest(int height[], String names[]) {
        int max_Index = 0;
        for (int i = 1; i < height.length; i++) {
            if (height[i] > height[max_Index]) {
                max_Index = i;
            }
        }
        System.out.println(names[max_Index]);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String names[] = {"Amar", "Akbar", "Anthony"};
        int age[] = new int[3];
        int height[] = new int[3];
        for (int i = 0; i < 3; i++) {
            System.out.print("Enter age of " + names[i] + ": ");
            age[i] = sc.nextInt();
            System.out.print("Enter height of " + names[i] + ": ");
            height[i] = sc.nextInt();
        }
        Youngest(age, names);
        Tallest(height, names);
    }
}
