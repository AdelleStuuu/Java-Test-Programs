public class Truck extends Vehicle{
  void description() {
    System.out.println("-------------Description-------------");
    System.out.println("This is an ADL Transpor");
    System.out.println("Made by AdelleCorp Trucking");
    System.out.println("Made in 2043");
    System.out.println("It uses AdelleTruckerOil");
  }

  void fuelCal() {
    int fuelCapacity = 32;
    int kilometersRan = 600;
    int fuelConsumption = kilometersRan/fuelCapacity;
    int fuelEfficiency = kilometersRan/fuelConsumption;

    System.out.println("-------------Fuel Description-------------");
    System.out.println("The fuel capacity of this vehicle is " + fuelCapacity + " liters" + "\nThe kilometrage is " + kilometersRan + " kilometers." + "\nThe fuel Efficiency is " + fuelEfficiency + " liters per kilometer.");
  }

}