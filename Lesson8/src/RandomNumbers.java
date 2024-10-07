import java.util.Random;
import java.util.Scanner;

public class RandomNumbers
{
  public static void main(String[] args)
  {
    Random randomNumber = new Random();
    Scanner keyboard = new Scanner(System.in);

    int number = randomNumber.nextInt(10)+1;

    System.out.println("Guess the number:");
    int guessingNumber = keyboard.nextInt();

    System.out.println(number == guessingNumber ? "Correct!" : "Wrong, the number is: "+number);
  }
}

