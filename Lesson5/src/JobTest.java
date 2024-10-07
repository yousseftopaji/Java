public class JobTest {

  public static void main(String[] args) {

    // Create two Job objects using both constructors
    Job job1 = new Job("Software Engineer", 80000, new Person("Youssef", ""));
    Job job2 = new Job("Data Scientist", 95000);

    // Print initial Job object details
    System.out.println("Initial Job Details:");
    System.out.println(job1);
    System.out.println(job2);

    // Use getters to fetch details
    System.out.println("\nUsing Getters:");
    System.out.println("Job1 Title: " + job1.getTitle());
    System.out.println("Job1 Salary: " + job1.getSalary());
    System.out.println("Job1 Employee: " + job1.getEmployee());

    System.out.println("Job2 Title: " + job2.getTitle());
    System.out.println("Job2 Salary: " + job2.getSalary());
    System.out.println("Job2 Employee: " + job2.getEmployee());

    // Use setters to modify details
    System.out.println("\nModifying Job2 using Setters:");
    job2.setTitle("Senior Data Scientist");
    job2.setSalary(105000);
    job2.setEmployee(new Person("Amira", ""));

    System.out.println(job2);

    // Give percentage raise
    System.out.println("\nApplying Salary Raise:");
    job1.givePercentageRaise(10); // Increase salary by 10%
    job2.givePercentageRaise(5);  // Increase salary by 5%

    // Print updated Job details
    System.out.println("\nUpdated Job Details after raise:");
    System.out.println(job1);
    System.out.println(job2);
  }
}
