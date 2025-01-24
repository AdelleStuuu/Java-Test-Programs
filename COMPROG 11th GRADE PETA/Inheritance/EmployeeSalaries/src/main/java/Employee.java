import java.util.Scanner;
public class Employee {
  Scanner input = new Scanner(System.in);
  int salary = 10000, workWeeks;

  void work() {
    System.out.println("-----------------------------------");
    System.out.print("You work for how many weeks? ");
    workWeeks = input.nextInt();
  }
  
  void getSalary() {
    System.out.println("-----------------------------------");
    System.out.println("Salary For this month is: $" + salary* workWeeks);
    System.out.println("Thank you for working at AdelleCorp");
  }
}