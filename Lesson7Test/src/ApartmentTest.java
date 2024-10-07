public class ApartmentTest
{
  public static void main(String[] args)
  {

    Tenant tenant1 = new Tenant("Youssef");
    Tenant tenant2 = new Tenant("Thea");

    Apartment apartment1 = new Apartment(20000);
    Apartment apartment2 = new Apartment(20000, 5);
    Apartment apartment3 = new Apartment(20000);

    apartment1.setRent(15000);

    apartment2.rentTo(tenant1);
    apartment3.rentTo(tenant2);
    apartment2.evict();

    System.out.println(apartment1);
    System.out.println(apartment2);
    System.out.println(apartment3);
  }
}
