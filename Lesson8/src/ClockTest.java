public class ClockTest
{
  public static void main(String[] args)
  {
    Clock clock1 = new Clock(19000);
    Clock clock2 = new Clock(23, 5, 59);
    Clock clock3 = new Clock(2, 53, 4);

//    System.out.println(clock2.timeTo(clock3));
//    System.out.println(clock3.isBefore(clock2));
    clock2.setTimeFormat(24);
    clock2.tic();
    System.out.println(clock2);
  }
}
