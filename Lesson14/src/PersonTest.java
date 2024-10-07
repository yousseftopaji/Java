import java.util.Scanner;

public class PersonTest
{
  public static void main(String[] args)
  {
    Person p1 = new Person("Youssef", "Marselis Boulevard 167B", new MyDate(2,1,1997));



    Scanner keyboard = new Scanner(System.in);
    System.out.println("What do you want Youssef to remember");
    p1.rememberThis(keyboard.nextLine());

    System.out.println(p1.whatAreYouThinkingAbout());
  }

}
