import java.util.Scanner;
public class Exercise3
{
    public static void main(String[] args)
    {
      Scanner keyboard = new Scanner(System.in);
      System.out.println("Add the sales tax rate");
      double salesTax = keyboard.nextDouble();
      System.out.println("Add the price of the first item");
      int firstNumber = keyboard.nextInt();
      System.out.println("Add the price of the second item");
      int secondNumber = keyboard.nextInt();
      System.out.println("Add  the price of  the third item");
      int thirdNumber = keyboard.nextInt();
      System.out.println((salesTax*firstNumber + firstNumber) + "\n" +(salesTax*secondNumber + secondNumber) + "\n"+ (salesTax*secondNumber + secondNumber));
    }
}
