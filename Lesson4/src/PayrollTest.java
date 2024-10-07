public class PayrollTest {

  public static void main(String[] args) {
    // Create an instance of Payroll
    Payroll payroll = new Payroll("Youssef", 123.0, 123);
    System.out.println(payroll);
    // Test setting and getting the name
    //System.out.println("Testing setName and getName:");
    //payroll.setName("John Doe");
    //System.out.println("Actual Name: " + payroll.getName());  // Should return "John Doe"

    // Test setting and getting the hourly rate
    //System.out.println("\nTesting setHourRate and getHourRate:");
    //payroll.setHourRate(50.0);
    //System.out.println("Actual Hourly Rate: " + payroll.getHourRate());  // Should return 50.0

    // Test setting and getting the number of hours worked
    //System.out.println("\nTesting setNumberOfHours and getNumberOfHours:");
    //payroll.setNumberOfHours(160);
    //System.out.println("Actual Number of Hours: " + payroll.getNumberOfHours());  // Should return 160

    // Optional: Compute the total salary
    //double totalSalary = payroll.getHourRate() * payroll.getNumberOfHours();
    //System.out.println("\nTotal Salary: " + totalSalary);  // Should return 50.0 * 160 = 8000.0
  }
}
