class Book_2 {
    public String ISBN;
    protected String title;
    private String author;
    public void setAuthor(String a) {
        author = a;
    }
    public String getAuthor() {
        return author;
    }
}
class EBook extends Book_2 {

    void show() {
        System.out.println("ISBN: " + ISBN);
        System.out.println("Title: " + title);
        System.out.println("Author: " + getAuthor());
    }
}
public class Main_1 {
    public static void main(String[] args) {
        EBook b = new EBook();
        b.ISBN = "978123456789";
        b.title = "Java Programming";
        b.setAuthor("James Gosling");
        b.show();
    }
}
