public class Clock
{
  private int hour;
  private int minute;
  private int second;
  private boolean timeFormat24;

  public Clock (int h, int m, int s)
  {
    hour = h;
    minute = m;
    second = s;
  }

  public Clock (int totalTimeInSecond)
  {
    int s = totalTimeInSecond % 60;
    int h = totalTimeInSecond / 60;
    int m = h % 60;
    h = h/60;


    hour = h;
    minute = m;
    second = s;
  }

  public void set (int h, int m, int s, boolean format24)
  {
    hour = h;
    minute = m;
    second = s;
    timeFormat24 = format24;
  }

  public int getHour()
  {
    return hour;
  }

  public int getMinute()
  {
    return minute;
  }

  public int getSecond()
  {
    return second;
  }

  public void tic()
  {
    second += 1;
  }

  public int convertToSeconds()
  {
    return (hour*3600)+(minute*60)+second;
  }

  public boolean isBefore(Clock time)
  {
    if (this.hour < time.hour)
    {
      return true;
    }
    else if (this.hour > time.hour)
    {
      return false;
    }
    else
    {
      if (this.minute < time.minute)
      {
        return true;
      }
      else if (this.minute > time.minute)
      {
        return false;
      }
      else
      {
        return this.second < time.second;
      }
    }
  }

  public int timeInSecondsTo(Clock time)
  {
    return isBefore(time) ?(time.hour -this.hour)*3600+(time.minute-this.minute)*60+(time.second-this.second) : (this.hour-time.hour)*3600+(this.minute-time.minute)*60+(this.second-time.second);
  }

  public Clock timeTo(Clock time)
  {
    int timeDifferenceInSeconds = timeInSecondsTo(time);
    return new Clock(timeDifferenceInSeconds);
  }

  public boolean isTimeFormat24() {
    return timeFormat24;
  }

  public void setTimeFormat(int hourFormat) {
    if (hourFormat == 12) {
      timeFormat24 = false;  // Set to 12-hour format
    } else if (hourFormat == 24) {
      timeFormat24 = true;   // Set to 24-hour format
    }
    // If the input is neither 12 nor 24, no changes are made
  }

  public String toString ()
  {
    if (timeFormat24)
    {
      // 24-hour format
      return hour+":"+minute+":"+second;
    }
    else
    {
      // 12-hour format
      int displayHour = hour % 12;
      if (displayHour == 0)
        displayHour = 12; // Handle the case for 12 AM and 12 PM
      String period = (hour < 12) ? "AM" : "PM";
      return displayHour+":"+ minute+":"+  second+" "+period;
    }
  }
}
