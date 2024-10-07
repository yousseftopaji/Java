import java.util.Scanner;

public class MyDateTest
{
  public static void main(String[] args)
  {
    Scanner keyboard = new Scanner(System.in);
    MyDate birthday = new MyDate(2,1,1997);
    MyDate today = new MyDate(23, 9, 2024);
//    mdy.setDay(1);
//    mdy.setMonth(12);
//    mdy.setYear(2400);
    System.out.println(birthday.getMonthName());
    int count=0;
    for (int i = birthday.getYear(); i<=today.getYear(); i++)
    {
      birthday.setYear(i);
      if (birthday.isLeapYear())
      {
        count++;
      }
    }
    System.out.println(count);


    int countDays = 0;
birthday.setYear(1997);
    while (!(birthday.getDay()==today.getDay() && birthday.getMonth()==today.getMonth() && birthday.getYear() == today.getYear()))
    {
      birthday.nextDay();
      //  System.out.println(birthday.displayDate());
      countDays++;
    }
    System.out.println(countDays);
  }
}
