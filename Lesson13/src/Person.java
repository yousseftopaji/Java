public class Person
{
    private String name;
    private String address;
    private MyDate birthday;

  public Person(String name, String address, MyDate birthday)
  {
    setName(name);
    this.birthday = birthday;
    setAddress(address);
  }

  public Person(String name, MyDate birthday)
  {
    setName(name);
    this.birthday = birthday;
  }

  public Person(MyDate birthday)
  {
    this.birthday = birthday;
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
