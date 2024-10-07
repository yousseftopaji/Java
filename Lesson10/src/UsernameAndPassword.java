import java.util.Scanner;

public class UsernameAndPassword
{
  public static void main(String[] args)
  {
    String username;
    String password;
    String confirmation;

    Scanner keyboard = new Scanner(System.in);
    System.out.println("Enter a username");
    username = keyboard.nextLine();

    System.out.println("Enter a password");
    password = keyboard.nextLine();

    System.out.println("Confirm the password");
    confirmation = keyboard.nextLine();

    while (!(password.equals(confirmation)))
    {
      System.out.println("The password and the confirmation do not match. enter the confirmation again: ");
      confirmation = keyboard.nextLine();
    }
    System.out.println(username);
    System.out.println(password);
  }
}
