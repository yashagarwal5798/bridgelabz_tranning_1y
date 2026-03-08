package com.school.util;
import com.school.data.Student;
public class Analyzer {
    public double calculateAverage(Student s) {
        return (s.getMarks1() + s.getMarks2() + s.getMarks3()) / 3.0;
    }
    public String findGrade(double avg) {
        if (avg >= 80)
            return "A";
        else if (avg >= 60)
            return "B";
        else if (avg >= 40)
            return "C";
        else
            return "Fail";
    }
}
