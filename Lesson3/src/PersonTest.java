public class PersonTest
{
  public static void main(String[] args)
  {
    Person per = new Person();
    per.setName("Youssef");
    per.setBirthday("02/01/1997");

    System.out.println("My name is: " + per.getName()+", and I was born in: " + per.getBirthday());
  }
}
