package MultiLevel_Inheritance.Problem_2;

public class Runner {
    public static void main(String[] args) {
        PaidOnlineCourse c = new PaidOnlineCourse();
        c.courseName = "Java Programming";
        c.duration = 30;
        c.platform = "JavaTpoint";
        c.isRecorded = true;
        c.fee = 5000;
        c.discount = 10;
        c.printInfo();
    }
}
