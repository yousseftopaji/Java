import java.util.Scanner;

public class Question1
{
  public static void main(String[] args)
  {
    Scanner keyboard = new Scanner(System.in);

    System.out.println("Type an integer: ");
    double firstInt = keyboard.nextInt();

    System.out.println("Type a second integer: ");
    double secondInt = keyboard.nextInt();

    System.out.println("Type a third integer: ");
    double thirdInt = keyboard.nextInt();

    System.out.println("Type a fourth integer: ");
    double fourthInt = keyboard.nextInt();

    keyboard.nextLine();

    System.out.println("Type your name: ");
    String name = keyboard.nextLine();

    double firstOperation = firstInt+secondInt;
    double secondOperation = secondInt*thirdInt;
    double thirdOperation = thirdInt-fourthInt;
    double fourthOperation = (fourthInt/firstInt);
    double totalSum = (firstOperation + secondOperation + thirdOperation + fourthOperation);
    System.out.println("Hi "+name+", here are the results of the calculations: ");
    System.out.println("The sum of ("+firstInt+ " + "+secondInt+") is "+firstOperation);
    System.out.println("The product of ("+secondInt+" x "+thirdInt+") is "+secondOperation);
    System.out.println("The difference of ("+thirdInt+" - "+fourthInt+") is "+ thirdOperation);
    System.out.println("The quotient of ("+fourthInt+" / "+firstInt+") is "+(fourthOperation));
    System.out.println("The total sum is " + totalSum);

  }
}
