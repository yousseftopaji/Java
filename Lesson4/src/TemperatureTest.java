import java.util.Scanner;

public class TemperatureTest {
  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);

    // Prompt the user to enter a Fahrenheit temperature
    System.out.print("Enter the Fahrenheit temperature: ");
    double userFahrenheit = keyboard.nextDouble();

    // Create a Temperature object using the Fahrenheit value entered by the user
    Temperature ftemp = new Temperature(userFahrenheit);

    // Display the temperature in Celsius and Kelvin
    System.out.println("Celsius: " + ftemp.getCelsius());
    System.out.println("Kelvin: " + ftemp.getKelvin());

    keyboard.close();
  }
}
