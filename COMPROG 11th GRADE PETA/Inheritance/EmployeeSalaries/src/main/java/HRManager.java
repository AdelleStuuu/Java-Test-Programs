import java.util.Scanner;
public class HRManager {
  Scanner input = new Scanner(System.in);
  int salary = 15000, workWeeks;

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
  
  void addEmployee() {
    System.out.println("-----------------------------------");
    System.out.print("How many employees are you adding? ");
    int numEmployees = input.nextInt();
    System.out.println("Thank you for adding " + numEmployees + " employees");
    System.out.println("You have served AdelleCorp well");
  }
}