public class MyDateTest
{
  public static void main(String[] args)
  {
    MyDate mdy = new MyDate();
    mdy.setDay(1);
    mdy.setMonth(2);
    mdy.setYear(2400);
    System.out.println( mdy.isLeapYear());
  }
}
