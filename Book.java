
public class Book extends ItemForSale
{
    String title;
    String publisher;
    Author author;
    public Book (String title, String publisher, double price, String dateOfSale, Author author) {
        super(title, publisher, price, dateOfSale);
        this.publisher=publisher;
        this.author=author;
    }
    public String getTitle() {
        return title;
    }
    public String getPublisher() {
        return publisher;
    }
    public Author getAuthor() {
        return author;
    }
    @Override
    public String getCreatorName() {
        return author.getName();
    }
}
