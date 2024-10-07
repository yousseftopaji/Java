public class Point {
  // Instance variables
  private int x;
  private int y;

  // Constructor with two arguments
  public Point(int x, int y) {
    this.x = x;
    this.y = y;
  }

  // Getter for x
  public int getX() {
    return x;
  }

  // Setter for x
  public void setX(int x) {
    this.x = x;
  }

  // Getter for y
  public int getY() {
    return y;
  }

  // Setter for y
  public void setY(int y) {
    this.y = y;
  }

  // Method to move the point to a new position
  public void moveTo(int newX, int newY) {
    this.x = newX;
    this.y = newY;
  }

  // Method to move the point by a certain distance
  public void move(int xDistance, int yDistance) {
    this.x += xDistance; // Update x by adding xDistance
    this.y += yDistance; // Update y by adding yDistance
  }

  // Method to return the point as a string in the format "(x, y)"
  public String toString() {
    return "(" + x + ", " + y + ")";
  }

  public double distanceTo(Point other)
  {
    int xDiff = other.getX() - this.x;
    int yDiff = other.getY() - this.y;
    return Math.sqrt(xDiff * xDiff + yDiff * yDiff);
  }
}
