package com.gla.level_3;
import java.util.*;
public class FootballTeam {
    public static int Sum(int arr[]) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        return sum;
    }
    public static double Mean(int arr[]) {
        int sum = Sum(arr);
        return (double) sum / arr.length;
    }
    public static int Shortest(int arr[]) {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min)
                min = arr[i];
        }
        return min;
    }
    public static int Tallest(int arr[]) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max)
                max = arr[i];
        }
        return max;
    }
    public static void main(String[] args) {
        int heights[] = new int[11];
        Random r = new Random();
        for (int i = 0; i < heights.length; i++) {
            heights[i] = 150 + r.nextInt(101);
            System.out.println("Player " + (i + 1) + " Height: " + heights[i] + " cm");
        }
        int sum = Sum(heights);
        double mean = Mean(heights);
        int shortest = Shortest(heights);
        int tallest = Tallest(heights);
        System.out.println("Sum of heights: " + sum);
        System.out.println("Mean height: " + mean);
        System.out.println("Shortest height: " + shortest);
        System.out.println("Tallest height: " + tallest);
    }
}
