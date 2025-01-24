public class Car extends Vehicle{

  void description() {
    System.out.println("-------------Description-------------");
    System.out.println("This is a Model 3ADL ");
    System.out.println("Made by The AdelleCorp Automobile Sector");
    System.out.println("Made during 2054");
    System.out.println("Uses the Fuel of AdelleCrudes");
  }
  
  void fuelCal() {
    int fuelCapacity = 50;
    int kilometersRan = 550;
    int fuelConsumption = kilometersRan/fuelCapacity;
    int fuelEfficiency = kilometersRan/fuelConsumption;

    System.out.println("-------------Fuel Description-------------");
    System.out.println("The fuel capacity of this vehicle is " + fuelCapacity + " liters" + "\nThe kilometrage is " + kilometersRan + " kilometers." + "\nThe fuel Efficiency is " + fuelEfficiency + " liters per kilometer.");
  }
  
}