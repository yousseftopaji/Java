public class MyDate
{
  private int day;
  private int month;
  private int year;

  public MyDate()
  {
    day=2;
    month=3;
    year=2024;
  }

  public MyDate(int day, int month, int year)
  {
    this.day= day;
    this.month=month;
    this.year = year;
  }
  public void setDay(int dd)
  {
    day = dd;
  }
  public void setMonth(int mm)
  {
    month= mm;
  }
  public void setYear(int yy)
  {
    year= yy;
  }
  public int getDay()
  {
    return day;
  }

  public int getMonth()
  {
    return month;
  }

  public int getYear()
  {
    return year;
  }

  public String displayDate()
  {
    return day+"/"+month+"/"+year;
  }
  public String toString()
  {
    return day+"/"+month+"/"+year;
  }
}
