public class Car
{
  //Fields
  private int yearModel;
  private String make;
  private int speed;

  //Constructor that takes the year model and the make as arguments.
  public Car (int yearModel, String make)
  {
    this.yearModel = yearModel;
    this.make=make;
    speed = 0;
  }


  //Accessors. (get methods)
  public int getYearModel()
  {
    return yearModel;
  }

  public String getMake()
  {
    return make;
  }

  public int getSpeed()
  {
    return speed;
  }

  //Accelerate method to add 5 to the speed every time it is called
  public void accelerate()
  {
    speed += 5;
  }

  //Brake method that will subtract 5 from the speed every time it is called
  public void brake()
  {
    speed-=5;
  }

  public String toString()
  {
    return "Year model: " + yearModel + "\nMake: " + make + "\nSpeed: " + speed;
  }
}
