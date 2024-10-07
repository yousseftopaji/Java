public class Apartment
{
  private double rent;
  private int numberOfRooms;
  private Tenant tenant;

  public Apartment (double rent, int numberOfRooms)
  {
    this.rent = rent;
    this. numberOfRooms = numberOfRooms;
    tenant = null;
  }

  public Apartment (double rent)
  {
    this.rent = rent;
    numberOfRooms = 1;
    tenant = null;
  }

  public double getRent()
  {
    return rent;
  }

  public int getNumberOfRooms()
  {
    return numberOfRooms;
  }

  public Tenant getTenant()
  {
    return tenant;
  }

  public void setRent(double rent)
  {
    this.rent = rent;
  }

  public boolean isAvailable()
  {
    if (tenant == null)
    {
      return true;
    }
    else return false;
  }

  public void rentTo(Tenant tenant)
  {
    if (isAvailable())
    {
      this.tenant = tenant;
    }
  }

  public void evict()
  {
    if (!isAvailable())
    {
      tenant = null;
    }
  }

  public String toString()
  {
    if (tenant != null)
    {return "rent"+ rent + "\nnumber of rooms" +numberOfRooms + tenant.getName() ;}
    else return "there is no tenant!";
  }
}
