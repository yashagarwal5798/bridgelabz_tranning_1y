package library.books;
public class Books {
    String bookName;
    String author;
    public void addBook(String bookName, String author) {
        this.bookName = bookName;
        this.author = author;
        System.out.println("Book Added:");
        System.out.println("Book Name: " + bookName);
        System.out.println("Author: " + author);
    }
}