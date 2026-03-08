package com.school.main;
import com.school.data.*;
import com.school.util.*;
public class MainApp {
    public static void main(String[] args) {
        Student s = new Student("YASH", 75, 80, 70);
        Analyzer a = new Analyzer();
        double avg = a.calculateAverage(s);
        String grade = a.findGrade(avg);
        System.out.println(s);
        System.out.println("Average Marks: " + avg);
        System.out.println("Grade: " + grade);
    }
}
