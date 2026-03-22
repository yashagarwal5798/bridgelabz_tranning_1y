package Problem_5;

abstract class LibraryItem
{
    private int itemId;
    private String title;
    private String author;
    public LibraryItem(int id, String title, String author)
    {
        this.itemId = id;
        this.title = title;
        this.author = author;
    }
    public String getTitle()
    {
        return title;
    }
    public abstract int getLoanDuration();
    public void getItemDetails()
    {
        System.out.println(itemId + " " + title + " by " + author);
    }
}
