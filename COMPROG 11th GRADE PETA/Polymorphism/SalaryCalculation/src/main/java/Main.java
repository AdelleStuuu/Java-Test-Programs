import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Manager manager = new Manager();
    Programmer programmer = new Programmer();
    Scanner scanner = new Scanner(System.in);

    System.out.println("Welcome to AdelleCorp Boss!\nWhich wage do you want to calculate?\n1. Manager\n2. Programmer");
    System.out.print("Enter your choice: ");
    int choice = scanner.nextInt();
    System.out.println(" ");

    if (choice == 1) {
      System.out.println("Manager Salary Calculation:");
      manager.SalaryCalculation();
    } else if (choice == 2) {
      System.out.println("Programmer Salary Calculation:");
      programmer.SalaryCalculation();
    } else {
      System.out.println("Invalid choice. Please select 1 for Manager or 2 for Programmer.");
    }
    
  }

}