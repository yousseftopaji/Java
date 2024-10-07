public class Garage
{
  private Car pos1;
  private Car pos2;

  public Garage()
  {
    pos1 = null;
    pos2 = null;

  }

  public boolean isParkingAreaTaken(int position) {
    if (position == 1)
    {
      return pos1 != null;
    }
    else if (position == 2)
    {
      return pos2 != null;
    }
    else
    {
      return false;
    }
  }

  public void  park(Car car, int position)
  {
    if (position == 1 && pos1 == null)
    {
      pos1 = car;
    }
    else if (position == 2 && pos2 == null)
    {
      pos2 = car;
    }
  }

  public Car leaveGarage(int position)
  {
    Car temp;
    if (position == 1)
    {
      temp = pos1;
      pos1 = null;
      return temp;
    }
    else if (position == 2)
    {
      temp = pos2;
      pos2 = null;
      return temp;
    }
    else return null;
  }


public String toString()
{
  return "Position 1: \n"+pos1 + "\nPosition 2: \n"+pos2;
}

public boolean equals(Object obj)
  {
    if (obj == null || getClass() != obj.getClass())
    {
      return false;
    }

    Garage other = (Garage) obj;

    if (pos1 != null && pos2 != null)
    {
      return pos1.equals(other.pos1)&& pos2.equals(other.pos2);
    }
    else if (pos1 == null && pos2 == null)
    {
      return other.pos1==null && other.pos2 ==null;
    }
    else if (pos1 == null)
    {
      return other.pos1 == null && pos2.equals(other.pos2);
    }
    else
    {
      return other.pos2 == null && pos1.equals(other.pos1);
    }
  }
}