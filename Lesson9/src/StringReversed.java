import java.util.Scanner;

public class StringReversed
{
  public static void main(String[] args)
  {
    String string;
    Scanner keyboard = new Scanner(System.in);

do
{
  System.out.print("Enter a String: ");
  string = keyboard.nextLine();

  if (!string.equalsIgnoreCase("quit"))
  {
    for (int i = string.length()-1; i >= 0; i--)
    {
      System.out.print(string.charAt(i));
    }
    System.out.println();
  }
}
while (!string.equalsIgnoreCase("quit"));
}}
