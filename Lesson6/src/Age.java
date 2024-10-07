import java.util.Scanner;

public class Age
{
  public static void main(String[] args)
  {
    Scanner keyboard = new Scanner(System.in);
    int age;
    System.out.println("Enter your age: ");
    age = keyboard.nextInt();

    if (age < 0)
    {
      System.out.println("Error in age value");
    }
    else if (age <= 12)
    {
      System.out.println("Child");
    }
    else if (age <= 19)
    {
      System.out.println("Teenage");
    }
    else if (age <= 65)
    {
      System.out.println("Adult ");
    }
    else
    {
      System.out.println("Senior citizen");
    }
  }
}
