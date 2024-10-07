import java.time.Clock;
import java.time.LocalDate;

public class MyDate
{
  private int day;
  private int month;
  private int year;

  public MyDate(int day, int month, int year)
  {
    this.day = day;
    this.month = month;
    this.year = year;
  }

  public MyDate()
  {
    LocalDate currentDate = LocalDate.now();
    this.day = currentDate.getDayOfMonth();
    this.month = currentDate.getMonthValue();
    this.year = currentDate.getYear();
  }

  public void setDay(int dd)
  {
    day = dd;
  }

  public void setMonth(int mm)
  {
    month = mm;
  }

  public void setYear(int yy)
  {
    year = yy;
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

  public boolean isLeapYear()
  {
    return year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
  }

  public int daysInMonth()
  {
    if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8
        || month == 10 || month == 12)
    {
      return 31;
    }
    else if (month == 2)
    {
      if (isLeapYear())
      {
        return 29;
      }
      else
      {
        return 28;
      }
    }
    else if (month == 4 || month == 6 || month == 9 || month == 11)
    {
      return 30;
    }

    else
    {
      return -1;
    }
  }

  public String getAstroSign()
  {
    if (day >= 21 && month == 3 || day <= 19 && month == 4)
    {
      return "aries";
    }
    else if (day >= 20 && month == 4 || day <= 20 && month == 5)
    {
      return "Taurus";
    }
    else if (day >= 21 && month == 5 || day <= 20 && month == 6)
    {
      return "Gemini";
    }
    else if (day >= 21 && month == 6 || day <= 22 && month == 7)
    {
      return "Cancer";
    }
    else if (day >= 23 && month == 7 || day <= 22 && month == 8)
    {
      return "Leo";
    }
    else if (day >= 23 && month == 8 || day <= 22 && month == 9)
    {
      return "Virgo";
    }
    else if (day >= 23 && month == 9 || day <= 22 && month == 10)
    {
      return "Libra";
    }
    else if (day >= 23 && month == 10 || day <= 21 && month == 11)
    {
      return "Scorpio";
    }
    else if (day >= 22 && month == 11 || day <= 21 && month == 12)
    {
      return "Sagittarius";
    }
    else if (day >= 22 && month == 12 || day <= 19 && month == 1)
    {
      return "Capricorn";
    }
    else if (day >= 22 && month == 1 || day <= 18 && month == 2)
    {
      return "Aquarius";
    }
    else if (day >= 19 && month == 2 || day <= 20 && month == 3)
    {
      return "Pisces";
    }
    else
      return "invalid input";
  }

  public String getMonthName()
  {
    return switch (month)
    {
      case 1 -> ("January");
      case 2 -> ("February");
      case 3 -> ("March");
      case 4 -> ("April");
      case 5 -> ("May");
      case 6 -> ("June");
      case 7 -> ("July");
      case 8 -> ("August");
      case 9 -> ("September");
      case 10 -> ("October");
      case 11 -> ("November");
      case 12 -> ("December");
      default -> ("Problematic month!");
    };
  }

  public void nextDay()
  {
    day++;
    if (day > daysInMonth())
    {
      month++;
      day=1;
      if (month>12)
      {
        year++;
        month=1;
      }
    }
  }

  public boolean equals(Object obj)
  {
    if (obj == null || getClass() != obj.getClass())
    {
      return false;
    }
    MyDate other = (MyDate) obj;
    return this.day == other.day && this.month == other.month && this.year == other.year;
  }

  public MyDate copy()
  {
    return new MyDate(day, month, year);
  }

  public MyDate(MyDate obj)
  {
    this.day= obj.day;
    this.month= obj.month;
    this.year = obj.year;
  }

  public void nextDays(int days)
  {
    for (int i = 0; i < days; i++)
    {
      nextDay();
    }
  }

  public String toString()
  {
    return day+"/"+month+"/"+year;
  }

  public static MyDate today()
  {
    LocalDate currentDate = LocalDate.now();
    int currentDay = currentDate.getDayOfMonth();
    int currentMonth = currentDate.getMonthValue();
    int currentYear = currentDate.getYear();

    return new MyDate(currentDay,currentMonth,currentYear);
  }

  public boolean isBefore(MyDate date2) {
    if (this.year < date2.year) {
      return true;
    } else if (this.year == date2.year) {
      if (this.month < date2.month) {
        return true;
      } else if (this.month == date2.month) {
        return this.day < date2.day;
      }
    }
    return false;
  }
}


