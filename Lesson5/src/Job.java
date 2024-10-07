public class Job
{
  private String title;
  private double salary;
  private Person employee;


  public Job (String title, double salary, Person employee)
  {
    this.title = title;
    this.salary = salary;
    this.employee = employee;
  }

  public Job (String title, double salary)
  {
    this.title= title;
    this.salary = salary;
    employee = null;
  }

  public String getTitle()
  {
    return title;
  }

  public double getSalary()
  {
    return salary;
  }

  public Person getEmployee()
  {
    return employee;
  }

  public void setTitle(String title)
  {
    this.title = title;
  }

  public void setSalary(double salary)
  {
    this.salary = salary;
  }

  public void setEmployee(Person employee)
  {
    this.employee = employee;
  }

  public void givePercentageRaise(double percentageRate)
  {
    salary += percentageRate * salary;
  }

  public String toString()
  {
    return "Job Title: " + title + ", Salary: " + salary + ", Employee: " + employee;
  }
}
