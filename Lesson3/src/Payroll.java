public class Payroll
{
  private String name;
  private double hourRate;
  private int numberOfHours;

  public void setName(String n)
  {
    name = n;
  }
  public void setHourRate(double hr)
  {
    hourRate=hr;
  }
  public void setNumberOfHours(int noh)
  {
    numberOfHours= noh;
  }
  public String getName()
  {
    return name;
  }

  public double getHourRate()
  {
    return hourRate;
  }

  public int getNumberOfHours()
  {
    return numberOfHours;
  }
}
