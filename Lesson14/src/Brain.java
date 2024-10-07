public class Brain
{
  private String activeMemoryItem;
  private String passiveMemoryItemOne;
  private String passiveMemoryItemTwo;

  public Brain()
  {
    this.activeMemoryItem = "";
    this.passiveMemoryItemOne = "";
    this.passiveMemoryItemTwo = "";
  }

  public int getIQ ()
  {

    int a = activeMemoryItem.length();
    int p1 = passiveMemoryItemOne.length();
    int p2 = passiveMemoryItemTwo.length();
    if (a >= 20 && p1>10 && p2 >10|| p1 >= 20 && a>10 && p2>10|| p2 >= 20 && a>10 && p1 >10)
    {
      return 130;
    }
    else if (a >= 10 && p1 >= 10 &&  p2 >= 10 )
    {
      return 100;
    }
    else
    return 70;
  }

  public boolean isBrainDamaged()
  {
    return activeMemoryItem==null || passiveMemoryItemOne == null || passiveMemoryItemTwo == null;
  }

  public void remember(String info)
  {
    passiveMemoryItemTwo = passiveMemoryItemOne;
    passiveMemoryItemOne = activeMemoryItem;
    activeMemoryItem = info;
  }

  public void refreshMemory(String info)
  {
    if (passiveMemoryItemOne.equals(info))
    {
      passiveMemoryItemOne = activeMemoryItem;
    }
    else
    {
      if (passiveMemoryItemTwo.equals(info))
      {
        passiveMemoryItemTwo = passiveMemoryItemOne;
        passiveMemoryItemOne = activeMemoryItem;
      }
    }
    activeMemoryItem = info;
  }

  public boolean recall(String info)
  {
    return activeMemoryItem.equals(info) || passiveMemoryItemOne.equals(info) || passiveMemoryItemTwo.equals(info);
  }

  public String recall()
  {
    return activeMemoryItem;
  }

  public String toString()
  {
    return "Active memory: " + activeMemoryItem +"\nPassive memory 1: " + passiveMemoryItemOne + "Passive memory 2: " + passiveMemoryItemTwo;
  }

  public boolean equals (Object obj)
  {
    if (obj == null || getClass() != obj.getClass())
    {
      return false;
    }
    Brain other = (Brain) obj;

    return this.activeMemoryItem.equals(other.activeMemoryItem) && this.passiveMemoryItemTwo.equals(other.passiveMemoryItemOne) && this.passiveMemoryItemTwo.equals(other.passiveMemoryItemTwo);
  }
}
