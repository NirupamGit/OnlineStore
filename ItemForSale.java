public class ItemForSale
{
String name;
double price;
String creatorName;
String dateOfSale;
public ItemForSale(String name, String creatorName, double price, String dateOfSale) {
    this.name=name;
    this.price=price;
    this.creatorName=creatorName;
    this.dateOfSale=dateOfSale;
}    

public String getCreatorName() {
    return creatorName;
}
public String getName() {
    return name;
}
public double getPrice() {
    return price;
}
public String getDateOfSale() {
    return dateOfSale;
}
}
