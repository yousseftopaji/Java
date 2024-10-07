public class Person
{
    private String name;
    private String birthday;

    public Person(String name, String birthday)
    {
      this.name = name;
      this.birthday = birthday;
    }

    public Person()
    {
      name = "Youssef";
      birthday = "02/01/1997";
    }

    public String toString()
    {
      return name ;
    }
    public void setName(String n)
    {
      name = n;
    }
    public void setBirthday(String b)
    {
      birthday = b;
    }
    public String getName()
    {
      return name;
    }
    public String getBirthday()
    {
      return birthday;
    }
}
