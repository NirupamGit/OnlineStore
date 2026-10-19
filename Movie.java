//this class contains the constructor to initialize a movie item and the methods to get the info of the movie
public class Movie extends ItemForSale
{
    String title;
    String creatorName;
    String duration;
    public Movie(String title, String creatorName, double price, String dateOfSale, String duration) {
        super(title, creatorName, price, dateOfSale);
        this.duration=duration;
    }
    public String getTitle() {
        return title;
    }
    public String getDuration() {
        return duration;
    }
@Override 
    public String getCreatorName() {
        return creatorName;
    }
}
