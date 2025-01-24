public class Motor extends Vehicle{

  void description() {
    System.out.println("-------------Description-------------");    
    System.out.println("This is the MTN 2ADL");
    System.out.println("Made by AdelleCorp Motor Industries");
    System.out.println("Made during 2032");
    System.out.println("in use of AdelleKeelows");
  }

  void fuelCal() {
    int fuelCapacity = 20;
    int kilometersRan = 200;
    int fuelConsumption = kilometersRan/fuelCapacity;
    int fuelEfficiency = kilometersRan/fuelConsumption;

    System.out.println("-------------Fuel Description-------------");
    System.out.println("The fuel capacity of this vehicle is " + fuelCapacity + " liters" + "\nThe kilometrage is " + kilometersRan + " kilometers." + "\nThe fuel Efficiency is " + fuelEfficiency + " liters per kilometer.");
  }

}