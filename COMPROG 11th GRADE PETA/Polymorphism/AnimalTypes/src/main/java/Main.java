// import static org.junit.jupiter.api.Assertions.assertEquals;

// import org.junit.jupiter.api.Test;

public class Main {
  public static void main(String[] args) {
    Animal animal = new Animal();
    Lion lion = new Lion();
    Tiger tiger = new Tiger();
    Panther panther = new Panther();
    
    System.out.println("Animal!");
    animal.eat();
    animal.sound();
    System.out.println(" ");
    System.out.println("Lion!");
    lion.eat();
    lion.sound();
    System.out.println(" ");
    System.out.println("Tiger!");
    tiger.eat();
    tiger.sound();
    System.out.println(" ");
    System.out.println("Panther!");
    panther.eat();
    panther.sound();
  }
}