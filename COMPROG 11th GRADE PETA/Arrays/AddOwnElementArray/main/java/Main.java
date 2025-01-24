import java.util.Scanner;

public class Main {
  public static void main(String[] args) {

    System.out.println("Hello! Welcome to Adelle's place! You can say 10 things here");
    Scanner input = new Scanner(System.in);
    int i = 0;
    String[] AdelleListens = new String[10];
    String AdelleQuestion, AdelleSays;

    do {
      System.out.println("What would you like to say?");
      AdelleSays = input.nextLine();
      AdelleListens[i] = AdelleSays;

      
      System.out.println("Do you want to say something else?");
      AdelleQuestion = input.nextLine();
      i++;
      
    } while (!AdelleQuestion.equalsIgnoreCase("No") && i < 10);

    System.out.println("All the things you said:");
    for (String said : AdelleListens) {
      if (said != null) {
        System.out.println("   -" + said);
      }
    }
  }
  
}