public class Area
{
  public static double area(double radius)
  {
    return Math.PI * radius*radius;
  }

  public static double area(double width, double length)
  {
    return width*length;
  }

  public static double area(double radius, double height, boolean isCylinder)
  {
    return Math.PI*radius*radius*height;
  }
}
