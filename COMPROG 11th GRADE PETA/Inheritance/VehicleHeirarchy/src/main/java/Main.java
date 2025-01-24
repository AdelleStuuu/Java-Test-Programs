import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    Vehicle vehicle = new Vehicle();
    Truck truck = new Truck();
    Car car = new Car();
    Motor motor = new Motor();
    int choice2;

    do {
      System.out.println("-----------------------------------\nWelcome to AdelleCorp!\nwhat do want to check today?\n-----------------------------------\n1.Vehicle Template \n2.AdelleCar \n3.AdelleTruck \n4.AdelleMotor");
      System.out.print("Enter your choice: ");
      int choice = input.nextInt();
      if(choice == 1) {
        vehicle.description();
        vehicle.fuelCal();
      } else if (choice == 2) {
        car.description();
        car.fuelCal();
      } else if (choice == 3) {
        truck.description();
        truck.fuelCal();
      } else if (choice == 4) {
        motor.description();
        motor.fuelCal();
      } else {
        System.out.println("Invalid input");
      }

      System.out.println("-----------------------------------");
      System.out.println("Do you want to continue? (1=Y/2=N)");
      System.out.print("Enter your choice: ");
      choice2 = input.nextInt();
    } while (choice2 == 1);
  }

}