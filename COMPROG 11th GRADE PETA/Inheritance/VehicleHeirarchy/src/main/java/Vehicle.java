public class Vehicle {

  void description() {
    System.out.println("-------------Description-------------");
    System.out.println("This is an AdelleVehicle");
    System.out.println("Made by what part of AdelleCorp?");
    System.out.println("Made in what year?");
    System.out.println("What fuel does it use?");
  }
  
  void fuelCal() {
    int fuelCapacity = 20;
    int kilometersRan = 100;
    int fuelConsumption = kilometersRan/fuelCapacity;
    int fuelEfficiency = kilometersRan/fuelConsumption;

    System.out.println("-------------Fuel Description-------------");
    System.out.println("The fuel capacity of this vehicle is " + fuelCapacity + " liters" + "\nThe kilometrage is " + kilometersRan + " kilometers." + "\nThe fuel Efficiency is " + fuelEfficiency + " liters per kilometer.");
  }
    
  
}