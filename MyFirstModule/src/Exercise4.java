import java.util.Scanner;
public class Exercise4
{
  public static void main(String[] args)
  {
    Scanner keyboard = new Scanner(System.in);
    System.out.print("What is your name? ");
    String name= keyboard.nextLine();
    System.out.print("What is your age? ");
    int age = keyboard.nextInt();
    keyboard.nextLine();
    System.out.print("What is your address? ");
    String address = keyboard.nextLine();
    System.out.println(name + "\n" + age + "\n"+ address);
  }
}
