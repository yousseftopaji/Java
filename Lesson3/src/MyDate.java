public class MyDate
{
  private int day;
  private int month;
  private int year;

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
}
