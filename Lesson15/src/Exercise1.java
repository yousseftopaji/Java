public class Exercise1
{
  public static void main(String[] args)
  {
    int[] numbers = {1,2,3,4,5};

    for (int i = 0; i<= numbers.length-1; i++)
    {
      numbers[i]= numbers[i]*2;
    }

    for (int i = 0; i < numbers.length; i++)
    {
      System.out.println(numbers[i]);
    }
  }
}
