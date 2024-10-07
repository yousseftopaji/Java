public class Pi {
  public static void main(String[] args) {
    double pi = 1.0;
    double previousPi = 0.0; // To store the previous value of pi for comparison
    int n = 3; // Start with 3 as the denominator
    int iterations = 0; // To count the number of iterations

    // Continue the loop until the difference between two consecutive values of pi is less than 0.00001
    while (Math.abs(pi - previousPi) >= 0.00001) {
      previousPi = pi; // Save the current value of pi for comparison later
      if (iterations % 2 == 0) {
        pi = pi - 1.0 / n;
      } else {
        pi = pi + 1.0 / n;
      }
      n += 2; // Increase the denominator by 2 for the next term
      iterations++; // Increment the iteration count
    }

    System.out.println("Pi = " + (4 * pi));
    System.out.println("Iterations needed: " + iterations);
  }
}
