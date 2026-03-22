package Problem_5;

class DVD extends LibraryItem
{
    public DVD(int id, String title, String author)
    {
        super(id, title, author);
    }
    public int getLoanDuration()
    {
        return 3;
    }
}
