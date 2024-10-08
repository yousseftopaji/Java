import java.util.Arrays;

public class Exercise3
{
  public static void main(String[] args)
  {
    int[] sourceArray = {1,2,3,4,5};
    int[] destinationArray = new int[sourceArray.length*2];

    System.arraycopy(sourceArray, 0, destinationArray, 0, sourceArray.length);

    for (int i = 0; i < destinationArray.length; i++)
    {
      System.out.println(destinationArray[i]);
    }
  }
}