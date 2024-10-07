public class CarTest
{
  public static void main(String[] args)
  {
    Car car1 = new Car("Mazda","Mazda 2", "Grey",  "BT30 183", 2008);
    Car car2 = new Car("Youssef", "invisible", "blue", "200", 2025);

    Car car3 = car1.copy();


    car2.setLicenseNumber("asdasdad");
    System.out.println(car3);
  }
}
