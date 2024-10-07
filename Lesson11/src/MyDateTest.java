import java.util.Scanner;

public class MyDateTest
{
  public static void main(String[] args)
  {
    Scanner keyboard = new Scanner(System.in);

    MyDate birthday = new MyDate(2,1,1997);
    MyDate currentDay = MyDate.today();
    MyDate anotherDay= new MyDate(27, 9, 2024);
    MyDate today = new MyDate();

    System.out.println(anotherDay.isBefore(today));
    System.out.println(anotherDay);
    System.out.println(today);

    System.out.println(birthday.getMonthName());
//  variable count refers to how many leap years in between "birthday" and "today" objects.
    int count=0;

    MyDate birth2 = birthday.copy();
    for (int i = birth2.getYear(); i<= currentDay.getYear(); i++)
    {
      birth2.setYear(i);
      if (birth2.isLeapYear())
      {
        count++;
      }
    }
    System.out.println(count + " leap years");

//  countDays counts how many days there are between the two objects.
    int countDays = 0;

//    birthday year was changed in the for loop to count how many leap years there are. therefore, I set it back to what it was again.
    //birthday.setYear(1997);

    MyDate birth3 = birthday.copy();
    while (!(birthday.getDay()== currentDay.getDay() && birthday.getMonth()== currentDay.getMonth() && birthday.getYear() == currentDay.getYear()))
    {
      birthday.nextDay();
      countDays++;
    }
    System.out.println(countDays);



   currentDay.nextDays(1123);
    System.out.println(currentDay);

  }
}
