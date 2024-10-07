import java.util.Scanner;

public class RomanNumeral
{
  public static void main(String[] args)
  {
    Scanner keyboard = new Scanner(System.in);

    System.out.println("Enter an Integer between 1 and 10");
    int input = keyboard.nextInt();

    if (input == 1)
    {
      System.out.println("The Roman numeral equivelant is: I");
    }
    else if (input == 2)
    {
      System.out.println("The Roman numeral equivelant is: II");
    }
    else if (input == 3)
    {
      System.out.println("The Roman numeral equivelant is: III");
    }
    else if (input == 4)
    {
      System.out.println("The Roman numeral equivelant is: IV");
    }
    else if (input == 5)
    {
      System.out.println("The Roman numeral equivelant is: V");
    }
    else if (input == 6)
    {
      System.out.println("The Roman numeral equivelant is: VI");
    }
    else if (input == 7)
    {
      System.out.println("The Roman numeral equivelant is: VII");
    }
    else if (input == 8)
    {
      System.out.println("The Roman numeral equivelant is: VIII");
    }
    else if (input == 9)
    {
      System.out.println("The Roman numeral equivelant is: IX");
    }
    else if (input == 10)
    {
      System.out.println("The Roman numeral equivelant is: X");
    }
    else
    {
      System.out.println("Invalid input.");
    }
  }
}
