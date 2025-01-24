import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    do {
      System.out.println("Enter a vehicle type (car or motorcycle): ");
      String vehicleType = scanner.nextLine();
      System.out.println(" ");

      if (vehicleType.equals("car")) {
        Car car = new Car();
        System.out.println(" ");
        car.startEngine();
        car.stopEngine();
      } else if (vehicleType.equals("motorcycle")) {
        Motorcycle motorcycle = new Motorcycle();
        System.out.println(" ");
        motorcycle.startEngine();
        motorcycle.stopEngine();
     } else {
        System.out.println("Invalid vehicle type. Please try again.");
      }

      System.out.println(" ");
      System.out.println("Do you want to continue? (yes/no)");
      String continueOption = scanner.nextLine();
      System.out.println(" ");
      if (!continueOption.equals("yes")) {
        break;

      } 
    } while (true);
    scanner.close();
  }
}