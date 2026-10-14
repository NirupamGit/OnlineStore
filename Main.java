
public class Main
{
   //Your tests go here! I expect you to make sure various parts of your program work. 

     public static void main(String[] args)
     {
      Store store=new Store();
      Author author1=new  Author("JK Rowling", "31 July 1965", 61);
      Book book1=new Book("harry potter", "xyz", 50, "October 10, 2026", author1);
      Author author2=new Author("asdf", "21 April 1978", 50);
      Book book2=new Book("java", "oracle", 70.0, "10th July 2002", author2);
      store.addItem(book1);
      store.addItem(book2);
      store.showItems();
      store.getCreatorName(book2);
      
     }
}
