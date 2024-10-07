public class Temperature {
  private double fahrenheitTemp;

  // Constructor that initializes fahrenheitTemp
  public Temperature(double fahrenheitTemp) {
    this.fahrenheitTemp = fahrenheitTemp;
  }

  // Default constructor
  public Temperature() {
    fahrenheitTemp = 0;
  }

  // Setter for Fahrenheit temperature
  public void setFahrenheitTemp(double fahrenheitTemp) {
    this.fahrenheitTemp = fahrenheitTemp;
  }

  // Getter for Fahrenheit temperature
  public double getFahrenheitTemp() {
    return fahrenheitTemp;
  }

  // Convert Fahrenheit to Celsius
  public double getCelsius() {
    return ((double) 5 / 9) * (fahrenheitTemp - 32);
  }

  // Convert Fahrenheit to Kelvin
  public double getKelvin() {
    return (((double) 5 / 9) * (fahrenheitTemp - 32) + 273.15);
  }
}
