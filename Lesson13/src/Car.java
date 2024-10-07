public class Car
{
  private String make;
  private String model;
  private String color;
  private String licenseNumber;
  private int year;

  public Car(String make, String model, String color, String licenseNumber, int year)
  {
    this.make = make;
    this.year = year;
    this.color = color;
    this.model = model;
    this.licenseNumber = licenseNumber;
  }

  public Car(String make, String model, String color, int year)
  {
    licenseNumber = null;
    this.make = make;
    this.year = year;
    this.color = color;
    this.model = model;
  }

  public String getMake()
  {
    return make;
  }

  public int getYear()
  {
    return year;
  }

  public String getColor()
  {
    return color;
  }

  public String getLicenseNumber()
  {
    return licenseNumber;
  }

  public String getModel()
  {
    return model;
  }

  public void setColor(String color)
  {
    this.color = color;
  }

  public void setLicenseNumber(String licenseNumber)
  {
    this.licenseNumber = licenseNumber;
  }

  public Car copy()
  {
    return new Car (make, model, color, licenseNumber, year);
  }

  public String toString()
  {
    return "Make: "+make+"\n"+"Model: "+model+"\n"+"Color: "+color+"\n"+"License Number: "+licenseNumber+"\n"+"Year: "+year;
  }

  public boolean equals(Object obj)
  {
    if (obj == null || getClass() != obj.getClass())
    {
      return false;
    }

    Car other = (Car)obj;
    return make.equals(other.make)
        && model.equals(other.model)
        && color.equals(other.color)
        && licenseNumber.equals(other.licenseNumber)
        && year == other.year;
  }
}
