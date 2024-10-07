public class PointTest {
  public static void main(String[] args) {
    // Create two Point objects
    Point point1 = new Point(3, 4);
    Point point2 = new Point(5, 7);

    // Print the initial points using the toString method
    System.out.println("Point 1: " + point1.toString()); // Output: (3, 4)
    System.out.println("Point 2: " + point2.toString()); // Output: (5, 7)

    // Test the moveTo method on point1
    point1.moveTo(10, 12);
    System.out.println("Point 1 after moveTo(10, 12): " + point1.toString()); // Output: (10, 12)

    // Test the move method on point2
    point2.move(3, 2);
    System.out.println("Point 2 after move(3, 2): " + point2.toString()); // Output: (8, 9)

    // Test the setX and setY methods
    point1.setX(15);
    point1.setY(20);
    System.out.println("Point 1 after setX(15) and setY(20): " + point1.toString()); // Output: (15, 20)

    // Test the getX and getY methods
    System.out.println("Point 1 X: " + point1.getX()); // Output: 15
    System.out.println("Point 1 Y: " + point1.getY()); // Output: 20

    System.out.println(point1.toString() + " " + point2.toString());
    // Calculate and print the distance between point1 and point2
    double distance = point1.distanceTo(point2);
    System.out.println("Distance between Point 1 and Point 2: " + distance);
  }
}
