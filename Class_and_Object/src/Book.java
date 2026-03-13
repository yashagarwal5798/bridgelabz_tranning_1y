public class Book {
    String title;
    String author;
    double price;
    Book() {
        title = "Unknown";
        author = "Unknown";
        price = 0;
    }
    Book(String t, String a, double p) {
        title = t;
        author = a;
        price = p;
    }
    void result() {
        System.out.println(title + " " + author + " " + price);
    }
    public static void main(String[] args) {
        Book b1 = new Book();
        Book b2 = new Book("Java Programming", "James", 500);
        b1.result();
        b2.result();
    }
}
