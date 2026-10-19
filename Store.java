  /*Implement the following functionality into the store:

    instance variables: 
      profit: how much money the store has made
      items:  instance variable (could be an array or LinkedList or ArrayList of one of the other classes)

    methods:
      showItems: displays all items available for sale
      addItem: adds an item for sale
      sellItem(itemName): removes the item from the store and adds its price to profit
      creator(itemName): displays who created the item in question

      You will need to include the following information to be stored in the inheritance heiarchy using the other classes:
        name of thing being sold
        price for things that are on sale
        names of creators of movies and books
        date of birth of book authors
        date that things are placed on sale
        duration of movies
        publisher of books

      Where these variables are stored and how to name them is up to you!
  */
 //this class contains the methods to add, remove, show items, show the profit of the store and get the name of the creator of a product
import java.util.ArrayList;

public class Store
{
  double profit;
  ArrayList<ItemForSale> items;
  public Store() {
    profit=0.0;
    items=new ArrayList<>();
  }

  public void addItem(ItemForSale item) {
    items.add(item);
  }
  public void sellItem(String item) {
    for (int i = 0; i<items.size(); i++) {
      if(items.get(i).equals(item)) {
        items.remove(i);
      }
      profit+=items.get(i).getPrice();
    }

    System.out.println(item + " is sold");

  }
    public void showItems() {
    if(items.isEmpty()) {
      System.out.print("No items for sale");
    }
    String itemsAsString = "";
    for(int i=0; i<items.size(); i++) {
      itemsAsString+=items.get(i).getName()+", ";
    }
    System.out.println(itemsAsString);
  }
  public void getCreatorName(ItemForSale itemName) {
    String name = "";
    for (int i =0; i<items.size(); i++) {
      if(items.get(i).equals(itemName)) {
        name = itemName.getCreatorName();
      }
    }
    System.out.println(name);
  }
  public void getProfit() {
    System.out.println("profit is "+profit);
  }
}
