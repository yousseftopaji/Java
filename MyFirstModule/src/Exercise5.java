import java.util.Scanner;
public class Exercise5
{
  public static void main (String[] args)
  {
    Scanner keyboard = new Scanner(System.in);
    System.out.println("Add three test scores to calculate the average:");
    int first = keyboard.nextInt();
    int second = keyboard.nextInt();
    int third = keyboard.nextInt();
    double average = (first+second+third)/3.0;
    System.out.println(average);
  }
}
