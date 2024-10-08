public class Exercise7
{
  public static void main (String[] args)
  {
    int[] golf = {3,5,1,3,3,2,4,2,3,1,1,4,5,2,5,1};
    int total = 0;
    int totalOfOne=0;

    for (int i = 0; i <golf.length; i++)
    {
      total += golf[i];
      if (golf[i] == 1)
      {
        totalOfOne++;
      }
    }
    System.out.println("Total is: "+ total);
    System.out.println("Total of one-hits is: "+totalOfOne);
    System.out.println("Average: " + ((double)total/golf.length));
  }
}
