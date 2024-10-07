public class Person
{
    private String name;
    private String address;
    private MyDate birthday;
    private Brain brain;

  public Person(String name, String address, MyDate birthday)
  {
    setName(name);
    this.birthday = birthday;
    setAddress(address);
    brain = new Brain();
  }

  public Person(String name, MyDate birthday)
  {
    setName(name);
    address="";
    this.birthday = birthday;
    brain = new Brain();
  }

  public Person(MyDate birthday)
  {
    setName("");
    address ="";
    this.birthday = birthday;
    brain = new Brain();
  }

  public void setAddress(String address)
  {
    this.address = address;
  }

  public void setName(String name)
  {
    this.name = name;
  }


  public String getName()
    {
      return name;
    }

  public MyDate getBirthday()
  {
    return birthday;
  }

  public String getAddress()
  {
    return address;
  }

  public int getAge ()
  {
    int age = MyDate.today().getYear() - birthday.getYear();
    if (birthday.getMonth() <= MyDate.today().getMonth())
    {
      return age;
    } else if (birthday.getMonth() == MyDate.today().getMonth() && birthday.getDay() <= MyDate.today()
        .getDay())
    {
      return age;
    }
    else
    {
      return age -1;
    }
  }

  public int getIQ()
  {
    return brain.getIQ();
  }

  public boolean isBrainDamaged()
  {
    return brain.isBrainDamaged();
  }

  public boolean doYouRemember(String topic)
  {
    return brain.recall(topic);
  }

  public void rememberThis(String topic)
  {
    if (!doYouRemember(topic))
    {
      brain.remember(topic);
    }
    else
      brain.refreshMemory(topic);
  }

  public String whatAreYouThinkingAbout()
  {
    return brain.recall();
  }

  public String toString()
  {
    return "Name: "+name + "\n"+"Address: "+ address + "\n"+"Birthday: "+ birthday;
  }

public boolean equals(Object obj)
  {
    if (obj == null || getClass() != obj.getClass())
    {
      return false;
    }
    Person other = (Person) obj;
    return this.name.equals(other.name) && this.birthday.equals(other.birthday) && this.address.equals(other.address);
  }
}
