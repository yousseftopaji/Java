import java.util.Scanner;

public class Grade
{
  public static void main(String[] args)
  {
    Scanner keyboard = new Scanner(System.in);

    System.out.println("Enter your Danish grade");
    int dScale = keyboard.nextInt();

    if (dScale == 12)
    {
      System.out.println("A");
    }
    else if (dScale == 10)
    {
      System.out.println("B");
    }
    else if (dScale == 7)
    {
      System.out.println("C");
    }
    else if (dScale == 4)
    {
      System.out.println("D");
    }
    else if (dScale == 2)
    {
      System.out.println("E");
    }
    else if (dScale == 0)
    {
      System.out.println("Fx");
    }
    else if (dScale == -3)
    {
      System.out.println("F");
    }
    else
    {
      System.out.println("Invalid input");
    }
  }
}
