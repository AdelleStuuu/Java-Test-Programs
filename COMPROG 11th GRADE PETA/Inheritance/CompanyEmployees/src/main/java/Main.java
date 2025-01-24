import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
    Employee employee = new Employee();
    Manager manager = new Manager();
    Programmer programmer = new Programmer();
    Developer developer = new Developer();
    Scanner scanner = new Scanner(System.in);
    int employeeShown = 0;

    System.out.println("Welcome to AdelleCorp Boss!\nWho would you like to check for today?\n1.Employees\n2.Managers\n3.Programmers\n4.Developers");
    System.out.print("Enter your choice: ");
    int choice = scanner.nextInt();

    if (choice == 1) {
      System.out.print("How many are there? ");
      int numEmployees = scanner.nextInt();

      while (employeeShown < numEmployees) {
        System.out.println(" ");
        System.out.println("+-------Start Line-------+");
        employee.Description();
        System.out.println("---------------------");
        employee.printWorkJugement();
        System.out.println("+--------End Line--------+");
        employeeShown++;
      } 
    } else if (choice == 2) {
        System.out.print("How many are there? ");
        int numEmployees = scanner.nextInt();

        while (employeeShown < numEmployees) {
          System.out.println(" ");
           System.out.println("+-------Start Line-------+");
           manager.Description();
           System.out.println("---------------------");
           manager.printWorkJugement();
           System.out.println("+--------End Line--------+");
           employeeShown++;
        } 
    } else if (choice == 3) {
        System.out.print("How many are there? ");
        int numEmployees = scanner.nextInt();

        while (employeeShown < numEmployees) {
          System.out.println(" ");
           System.out.println("+-------Start Line-------+");
           programmer.Description();
           System.out.println("---------------------");
           programmer.printWorkJugement();
           System.out.println("+--------End Line--------+");
           employeeShown++;
        } 
    } else if (choice == 4) {
        System.out.print("How many are there? ");
        int numEmployees = scanner.nextInt();

        while (employeeShown < numEmployees) {
          System.out.println(" ");
           System.out.println("+-------Start Line-------+");
           developer.Description();
           System.out.println("---------------------");
           developer.printWorkJugement();
           System.out.println("+--------End Line--------+");
        }
    }
    scanner.close();
  }

}