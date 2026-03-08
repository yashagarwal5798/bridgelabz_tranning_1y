package com.gla.level_2;
import java.util.Scanner;
public class Studentvote {
    public boolean StudentVote(int age) {
        if (age < 0)
            return false;
        if (age >= 18)
            return true;
        else
            return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Studentvote a = new Studentvote();
        int age[] = new int[10];
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter age of student " + (i + 1) + ": ");
            age[i] = sc.nextInt();
            if (a.StudentVote(age[i]))
                System.out.println("Student can vote");
            else
                System.out.println("Student cannot vote");
        }
    }
}
