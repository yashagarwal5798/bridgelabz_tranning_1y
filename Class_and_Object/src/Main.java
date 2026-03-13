class Student_2 {
    public int rollNumber;
    protected String name;
    private double CGPA;
    public void setCGPA(double cgpa) {
        CGPA = cgpa;
    }
    public double getCGPA() {
        return CGPA;
    }
}
class PostgraduateStudent extends Student_2 {
    void result() {
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Name: " + name);
        System.out.println("CGPA: " + getCGPA());
    }
}
public class Main {
    public static void main(String[] args) {
        PostgraduateStudent s = new PostgraduateStudent();
        s.rollNumber = 101;
        s.name = "Rahul";
        s.setCGPA(8.5);
        s.result();
    }
}
