import java.util.Scanner;

public class Exercise4
{
  public static void main(String[] args)
  {
    Scanner keyboard = new Scanner(System.in);
    int[] sourceArray = new int[5];
    int i = 0;
    int total = 0;

    while (i < 5)
    {
      System.out.println("Enter a number");
      sourceArray[i] = keyboard.nextInt();
      i++;
    }
    for (int j = 0; j < sourceArray.length; j++)
    {
      total += sourceArray[j];
    }

    System.out.println(total/ sourceArray.length);

  }
}
