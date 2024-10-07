public class CarTest
{
  public static void main(String[] args)
  {
    Car car1 = new Car(1997, "BMW");

    car1.accelerate();
    System.out.println("Current Speed: " + car1.getSpeed());

    car1.accelerate();
    System.out.println("Current Speed: " + car1.getSpeed());

    car1.accelerate();
    System.out.println("Current Speed: " + car1.getSpeed());

    car1.accelerate();
    System.out.println("Current Speed: " + car1.getSpeed());

    car1.accelerate();
    System.out.println("Current Speed: " + car1.getSpeed());

    car1.brake();
    System.out.println("Current Speed: " + car1.getSpeed());

    car1.brake();
    System.out.println("Current Speed: " + car1.getSpeed());

    car1.brake();
    System.out.println("Current Speed: " + car1.getSpeed());

    car1.brake();
    System.out.println("Current Speed: " + car1.getSpeed());

    car1.brake();
    System.out.println("Current Speed: " + car1.getSpeed());
  }
}
