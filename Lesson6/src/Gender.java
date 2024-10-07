import java.util.Scanner;

public class Gender
{
  public static void main(String[] args)
  {
    Scanner keyboard = new Scanner(System.in);
    int age;
    String g;

    System.out.println("Enter your gender, M/F");
    g = keyboard.nextLine();
    char gender = g.charAt(0);
    System.out.println("Enter your age");
    age = keyboard.nextInt();

    if (gender == 'F' || gender == 'M' || age >= 0)
    {
      if (gender == 'F' && age < 19)
      {
        System.out.println("Girl");
      }
      else if (gender == 'F')
      {
        System.out.println("Woman");
      }
      else if (age > 19 )
      {
        System.out.println("Man");
      }
      else
      {
        System.out.println("Boy");
      }
    }
    else
    {
      System.out.println("Invalid input");
    }

  }
}
