package library.transactions;
public class Transaction {
    public void issueBook(String bookName, String memberName) {
        System.out.println("Book Issued Successfully");
        System.out.println("Book: " + bookName);
        System.out.println("Issued To: " + memberName);
    }
}
