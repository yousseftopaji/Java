import java.util.Scanner;

public class Username
{
  public static void main(String[] args)
  {
    Scanner keyboard = new Scanner(System.in);

    System.out.println("Enter a username:");
    String username = keyboard.nextLine();

    System.out.println("Enter a password:");
    String password = keyboard.nextLine();

    System.out.println("Enter your password again to confirm:");
    String confirmPassword = keyboard.nextLine();

    while (!password.equals(confirmPassword))
    {
      System.out.println("The password and the confirmation don't match, please enter your password again");

      // Re-enter the password and confirmation
      System.out.println("Enter a password:");
      password = keyboard.nextLine();

      System.out.println("Enter your password again to confirm:");
      confirmPassword = keyboard.nextLine();
    }

    // If they match, print success message
    System.out.println("Great! Password confirmed. And the username is: "+username);

  }
}
