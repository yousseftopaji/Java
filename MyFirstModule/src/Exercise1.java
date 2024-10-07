import java.util.Scanner;
public class Exercise1
{
  public static void main(String[] args)
  {
    Scanner keyboard = new Scanner(System.in);
    System.out.println("What is your favorite city?");
    String favoriteCity = keyboard.nextLine();
    int length = favoriteCity.length();
    String upperCase = favoriteCity.toUpperCase();
    String lowerCase = favoriteCity.toLowerCase();
    char character = favoriteCity.charAt(0);
    System.out.println(length + "\n" + upperCase + "\n" + lowerCase + "\n" + character);
  }
}
