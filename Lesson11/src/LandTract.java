class LandTract {
  private double length;
  private double width;

  // Constructor
  public LandTract(double length, double width) {
    this.length = length;
    this.width = width;
  }

  // Method to calculate the area of the tract
  public double getArea() {
    return length * width;
  }

  public boolean equals(LandTract obj)
  {
    return getArea() == obj.getArea();
  }

  public String toString() {
    return "Length: " + length + ", Width: " + width + ", Area: " + getArea();
  }
}
