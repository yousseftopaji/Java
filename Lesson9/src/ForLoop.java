import java.util.Scanner;

public class ForLoop
{
  public static void main(String[] args)
  {
    int n;
    Scanner keyboard = new Scanner(System.in);

    System.out.print("Enter an integer: ");
    n = keyboard.nextInt();

    for (int i = 1; i <= n; i++)
    {
      System.out.print(i + " ");
    }

    System.out.println();
    for (int i = 1; i <= n ; i++)
    {
      System.out.print(2*i +" ");
    }
    System.out.println();

    for (int i = 1; i <= n; i++)
    {
      System.out.print(i*i + " ");
    }
  }
}
