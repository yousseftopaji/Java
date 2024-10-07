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
  public boolean isLeapYear()
  {
    if (year % 4 == 0 && year % 100 != 0)
    {
      return true;
    }
    else if (year % 400 == 0)
    {
      return true;
    }
    else
    {
      return false;
    }
  }
  public int daysInMonth()
  {
      if (month == 1 || month == 3 || month == 5  || month == 7  || month == 8  || month == 10  || month == 12)
      {
        return 31;
      }
      else if (month == 2)
      {
        if (isLeapYear())
        {return 29;}
        else
        {return 28;}
      }
      else if ( month == 4  || month == 6 || month == 9  || month == 11)
      {return 30;}


      else
      {return -1;}
    }
  public String getAstroSign()
  {
    if (day >= 21 && month == 3 || day <= 19 && month ==4)
    {
      return "aries";
    }
    else if (day >= 20 && month == 4 || day <= 20 && month ==5)
    {
      return "Taurus";
    }
    else if (day >= 21 && month == 5 || day <= 20 && month ==6)
    {
      return "Gemini";
    }
    else if (day >= 21 && month == 6 || day <= 22 && month ==7)
    {
      return "Cancer";
    }
    else if (day >= 23 && month == 7 || day <= 22 && month ==8)
    {
      return "Leo";
    }
    else if (day >= 23 && month == 8 || day <= 22 && month ==9)
    {
      return "Virgo";
    }
    else if (day >= 23 && month == 9 || day <= 22 && month ==10)
    {
      return "Libra";
    }
    else if (day >= 23 && month == 10 || day <= 21 && month ==11)
    {
      return "Scorpio";
    }
    else if (day >= 22 && month == 11 || day <= 21 && month ==12)
    {
      return "Sagittarius";
    }
    else if (day >= 22 && month == 12 || day <= 19 && month ==1)
    {
      return "Capricorn";
    }
    else if (day >= 22 && month == 1 || day <= 18 && month ==2)
    {
      return "Aquarius";
    }
    else if (day >= 19 && month == 2 || day <= 20 && month ==3)
    {
      return "Pisces";
    }
    else return "invalid input";
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
 }

