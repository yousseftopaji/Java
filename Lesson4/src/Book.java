public class Book {
  // Fields
  private String author;
  private String title;
  private double price;
  private int pages;

  // a) 4-argument constructor initializing all fields
  public Book(String author, String title, double price, int pages) {
    this.author = author;
    this.title = title;
    this.price = price;
    this.pages = pages;
  }

  // Get methods for all fields
  public String getAuthor() {
    return author;
  }

  public String getTitle() {
    return title;
  }

  public double getPrice() {
    return price;
  }

  public int getPages() {
    return pages;
  }

  // Set method for price
  public void setPrice(double price) {
    this.price = price;
  }

  //toString Method to display the info.
  public String toString()
  {
    return "Author: "+author +"\n"+"Title: "+title+"\n"+"Price: "+price+"\n"+"Pages: "+pages;
  }
}
