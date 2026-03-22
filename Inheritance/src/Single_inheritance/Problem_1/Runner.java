package Single_inheritance.Problem_1;

public class Runner {
    public static void main(String[] args) {
        Author a = new Author();
        a.title = "Java Basics";
        a.publicationYear = 2025;
        a.name = "Yash";
        a.bio = "Java Developer";

        a.PrintInfo();
    }
}
