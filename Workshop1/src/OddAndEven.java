import java.util.Random;

public class OddAndEven
{
  public static void main(String[] args)
  {
    Random randomNumbers = new Random();

    int num1 = randomNumbers.nextInt(100)+1;
    int num2 = randomNumbers.nextInt(100)+1;
    int num3 = randomNumbers.nextInt(100)+1;
    int num4 = randomNumbers.nextInt(100)+1;
    int num5 = randomNumbers.nextInt(100)+1;
    int num6 = randomNumbers.nextInt(100)+1;

    int sumEven=0;
    int sumOdd=0;
    System.out.println("Random Numbers: ");
    System.out.println(num1);
    System.out.println(num2);
    System.out.println(num3);
    System.out.println(num4);
    System.out.println(num5);
    System.out.println(num6);

    if (num1 % 2 == 0) {
      sumEven += num1;
    } else {
      sumOdd += num1;
    }
    if (num2 % 2 == 0) {
      sumEven += num2;
    } else {
      sumOdd += num2;
    }
    if (num3 % 2 == 0) {
      sumEven += num3;
    } else {
      sumOdd += num3;
    }
    if (num4 % 2 == 0) {
      sumEven += num4;
    } else {
      sumOdd += num4;
    }
    if (num5 % 2 == 0) {
      sumEven += num5;
    } else {
      sumOdd += num5;
    }
    if (num6 % 2 == 0) {
      sumEven += num6;
    } else {
      sumOdd += num6;
    }
    int sum = sumEven+sumOdd;

    System.out.println("The sum of Even Numbers is: "+sumEven);
    System.out.println("The sum of Odd Numbers is: "+sumOdd);
    System.out.println("The sum of All Numbers is: "+sum);
  }
}
