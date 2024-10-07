public class GarageTest
{
  public static void main (String[] args)
  {
    Garage garage1 = new Garage();
    Garage garage2 = new Garage();
    garage1.park(new Car("Fiat", "Good model", "Blue", "BT12312", 2012), 1);
    garage1.park(new Car("BMW", "Good model", "Grey", "CD14562", 2012), 2);

    System.out.println(garage1);
  }
}
