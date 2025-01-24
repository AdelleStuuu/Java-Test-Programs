import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    int choice2;
    
    do {
      System.out.println("-----------------------------------");
      System.out.println("Welcome to AdelleCorp! \nWhat is your current position for the day? \n1.AdelleWorker \n2.AdelleManager");
      Scanner input = new Scanner(System.in);
      int choice = input.nextInt();
      if (choice == 1) {
        Employee employee = new Employee();
        employee.work();
        employee.getSalary();
      } else if (choice == 2) {
        HRManager manager = new HRManager();
        manager.work();
        manager.getSalary();
        manager.addEmployee();
      } else {
        System.out.println("Invalid choice");
      }

      System.out.println("-----------------------------------");
      System.out.print("Do you want to continue? (1.Y/2.N): ");
      Scanner input2 = new Scanner(System.in);
      choice2 = input2.nextInt();
      
    } while (choice2 == 1);
    
    System.out.println("Bai Bai!");
  } 
}