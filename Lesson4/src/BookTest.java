import java.util.Scanner;

public class BookTest {
  public static void main(String[] args)
  {
    Scanner input = new Scanner(System.in);

    // Create a new Book object using the constructor
    Book book1 = new Book(input.nextLine(), input.nextLine(), input.nextDouble(), input.nextInt());
    input.nextLine();
    Book book2 = new Book(input.nextLine(), input.nextLine(), input.nextDouble(), input.nextInt());

    System.out.println(book1 +"\n"+ book2);

    book1.setPrice(book1.getPrice() * 0.8);
    book2.setPrice(book2.getPrice() * 0.8);

    // Print the information about both books
    System.out.println("\nBook 1 details after 20% discount:");
    System.out.println(book1);

    System.out.println("\nBook 2 details after 20% discount:");
    System.out.println(book2);
  }
}
