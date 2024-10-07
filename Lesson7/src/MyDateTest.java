public class MyDateTest
{
  public static void main(String[] args)
  {
    MyDate mdy = new MyDate(1,1, 1997);
//    mdy.setDay(1);
//    mdy.setMonth(12);
//    mdy.setYear(2400);
    System.out.println(mdy.dayOfWeek());
  }
}
