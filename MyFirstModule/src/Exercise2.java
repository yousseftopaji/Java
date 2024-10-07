import java.util.Scanner;
public class Exercise2
{
  public static void main(String[] args)
  {
    Scanner keyboard = new Scanner(System.in);
    System.out.println("Add the first number");
    int firstNumber = keyboard.nextInt();
    System.out.println("Add the second number");
    int secondNumber = keyboard.nextInt();
    System.out.println("Add the third number");
    int thirdNumber = keyboard.nextInt();
    System.out.println(firstNumber+secondNumber+thirdNumber);
    System.out.println(firstNumber*secondNumber*thirdNumber);
  }
}
