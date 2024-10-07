import java.util.Random;
import java.util.Scanner;

public class GuessANumber
{
  public static void main(String[] args)
  {
    Random random = new Random();
    int randomNumber = random.nextInt(1000)+1;
    int guessedNumber;
    int count = 1;
    Scanner keyboard = new Scanner(System.in);
    System.out.println("Guess the number:");
    do
    {
       guessedNumber = keyboard.nextInt();
       if (guessedNumber ==randomNumber)
       {
         System.out.println("Correct!");
       }
       else if (guessedNumber>randomNumber){
         System.out.println("Incorrect, the random number is smaller, try again.");
         count++;
       }
       else
       {
         System.out.println("Incorrect, the random number is higher, try again.");
         count++;
       }
    }
    while (!(guessedNumber == randomNumber));
    System.out.println("Great job, the random number is "+randomNumber+" and it took you "+ count+" times to guess it.");
  }
}
