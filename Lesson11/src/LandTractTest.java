import java.util.Scanner;

public class LandTractTest {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    // Getting dimensions for the first tract
    System.out.print("Enter the length of the first tract: ");
    double length1 = scanner.nextDouble();
    System.out.print("Enter the width of the first tract: ");
    double width1 = scanner.nextDouble();

    // Getting dimensions for the second tract
    System.out.print("Enter the length of the second tract: ");
    double length2 = scanner.nextDouble();
    System.out.print("Enter the width of the second tract: ");
    double width2 = scanner.nextDouble();

    // Creating two LandTract objects
    LandTract tract1 = new LandTract(length1, width1);
    LandTract tract2 = new LandTract(length2, width2);

    // Displaying the area of each tract
    System.out.println("\nFirst Tract: " + tract1);
    System.out.println("Second Tract: " + tract2);

    // Checking if the two tracts are of equal size
    if (tract1.equals(tract2)) {
      System.out.println("The two tracts are of equal size.");
    } else {
      System.out.println("The two tracts are not of equal size.");
    }
  }
}