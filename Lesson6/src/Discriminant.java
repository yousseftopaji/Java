import java.util.Scanner;

public class Discriminant
{
  public static void main(String[] args)
  {
    double a;
    double b;
    double c;
    double D;
    double onlyOneX;
    double x1;
    double x2;
  Scanner keyboard = new Scanner(System.in);

    System.out.println("Enter A value for \"a\"");
    a = keyboard.nextDouble();

    System.out.println("Enter A value for \"b\"");
    b = keyboard.nextDouble();

    System.out.println("Enter A value for \"c\"");
    c = keyboard.nextDouble();

    D = (b*b) - (4*a*c);

    if (D < 0)
    {
      System.out.println("There is no solution");
    }
    else if (D == 0)
    {
      onlyOneX = -b/(2*a);
      System.out.println("There is only one solution: " + onlyOneX);
    }
    else
    {
      x1 = (-b + Math.sqrt(D))/(2*a);
      x2 = (-b - Math.sqrt(D))/(2*a);
      System.out.println("There are two solutions");
      System.out.println("x1= "+x1);
      System.out.println("x2= "+x2);
    }
  }
}
