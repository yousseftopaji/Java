public class Chess
{
  public static void main(String[] args)
  {


  double rice=1;
  double total = 1;

  for (int i=2; i<=64; i++)
  {
    rice= 2*rice;
    total = total+rice;


    //temp=Math.pow(rice,i);
    //System.out.println(temp+ "       "+(i+1));
  }
    System.out.println(rice);
    System.out.println(total);

}}
