public class Payroll
{
  private String name;
  private double hourRate;
  private int numberOfHours;

  public Payroll()
  {
    name= "Youssef";
    hourRate= 158.4;
    numberOfHours= 37*4;
  }

  public Payroll(String name, double hourRate, int numberOfHours)
  {
    this.name=name;
    this.hourRate=hourRate;
    this.numberOfHours=numberOfHours;
  }

  public String toString()
  {
    return "Name is: "+name+"\nSalary is: "+hourRate*numberOfHours;
  }
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
