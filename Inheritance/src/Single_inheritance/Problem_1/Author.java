package Single_inheritance.Problem_1;

public class Author extends Book
{
    String name;
    String bio;
    void displayInfo()
    {
        super.PrintInfo();
        System.out.println("Author: " + name);
        System.out.println("Bio: " + bio);
    }
}
