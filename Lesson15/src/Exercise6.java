import java.util.Scanner;

public class Exercise6
{
  public static void main(String[] args)
  {
    Scanner keyboard = new Scanner(System.in);
    int[] array1 = new int[4];
    int[] array2 = new int[4];
    int[] sumArray = new int[4];

    int i = 0;
    int j = 0;
    int k = 0;
    while (i < 4)
    {
      System.out.println("Enter a number " + (i + 1));
      array1[i] = keyboard.nextInt();
      i++;
    }

    while (j < 4)
    {
      System.out.println("Enter a number " + (j + 1));
      array2[j] = keyboard.nextInt();
      j++;
    }

    while (k < 4)
    {
      sumArray[k] = array1[k]+ array2[k];
      System.out.println(sumArray[k]);
      k++;
    }
  }
}