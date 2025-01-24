import java.util.Scanner;

public class Main {
  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
     do {
      System.out.println("Enter a sport (basketball, football, or rugby): ");
      String sport = scanner.nextLine();
       System.out.println(" ");
       
      if (sport.equals("basketball")) {
        Basketball basketball = new Basketball();
        basketball.play();
        System.out.println(" ");
      } else if (sport.equals("football")) {
        Football football = new Football();
        football.play();
        System.out.println(" ");
      } else if (sport.equals("rugby")) {
        Rugby rugby = new Rugby();
        rugby.play();
        System.out.println(" ");
      } else {
        System.out.println("Invalid sport");
        System.out.println(" ");
      }

      System.out.println("Do you want to play another sport? (yes/no)");
      String playAgain = scanner.nextLine();
      if (!playAgain.equals("yes")) {
        break;
      }
       System.out.println(" ");
       
     } while (true);
    scanner.close();
  }
}