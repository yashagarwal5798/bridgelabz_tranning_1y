package MultiLevel_Inheritance.Problem_2;

public class OnlineCourse extends Course
{
    String platform;
    boolean isRecorded;
     public void printInfo()
    {
        super.printInfo();
        System.out.println("Platform: " + platform);
        System.out.println("Recorded: " + isRecorded);
    }
}
