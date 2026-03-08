package com.school.data;
public class Student {
    String name;
    int marks1;
    int marks2;
    int marks3;
    public Student(String name, int m1, int m2, int m3) {
        this.name = name;
        this.marks1 = m1;
        this.marks2 = m2;
        this.marks3 = m3;
    }
    public int getMarks1() {
        return marks1;
    }
    public int getMarks2() {
        return marks2;
    }
    public int getMarks3() {
        return marks3;
    }
    public String getName() {
        return name;
    }
    public String toString() {
        return "Student Name: " + name +
                "\nMarks 1: " + marks1 +
                "\nMarks 2: " + marks2 +
                "\nMarks 3: " + marks3;
    }
}
