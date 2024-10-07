import java.util.Scanner;

public class Exercise6
{
    public static void main (String[] args)
    {
      Scanner keyboard = new Scanner(System.in);
      System.out.println("Enter your name:");
      String name= keyboard.nextLine();
      System.out.println("Enter your age:");
      int age = keyboard.nextInt();
      keyboard.nextLine();
      System.out.println("Enter a name of a city:");
      String city= keyboard.nextLine();
      System.out.println("Enter a name of a college:");
      String college= keyboard.nextLine();
      System.out.println("Enter a name of a profession:");
      String profession= keyboard.nextLine();
      System.out.println("Enter a name of an animal:");
      String animal= keyboard.nextLine();
      System.out.println("Enter a name of a pet's name:");
      String petName= keyboard.nextLine();

      System.out.printf("There once was a person named " +name+ " who lived in CITY. At the age of" +age+"\n"
          + name+ "went to college at COLLEGE. "+name+" graduated and went to work as a\n"
          + profession+". Then, "+name+" adopted a(n) "+animal+" named "+petName+". They both lived\n"
          + "happily ever after!");
    }
}
