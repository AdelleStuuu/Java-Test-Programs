import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner Answer = new Scanner(System.in);
    BankAccount bankAccount = new BankAccount();
    SavingsAccount savingsAccount = new SavingsAccount();
    int choice, continueChoice;
    
    do {
      System.out.println("-------------------------------");
      System.out.println("Welcome to AdelleCorps Banking Business! \n how may we help you today? \n1.Bank Account \n2.Savings Account");
      choice = Answer.nextInt();
      System.out.println("-------------------------------");
      if (choice == 1){
        System.out.println("-------------------------------");
        System.out.println("Welcome to your Bank Account! \n1.Deposit \n2.Withdraw");
        choice = Answer.nextInt();
        if (choice == 1) {
          bankAccount.deposit();
        } else if (choice == 2) {
          bankAccount.withdraw();
        }
      } else if (choice == 2) {
        System.out.println("-------------------------------");
        System.out.println("Welcome to your Savings Account! \n1.Deposit \n2.Withdraw");
        choice = Answer.nextInt();
        if (choice == 1) {
          savingsAccount.deposit();
        } else if (choice == 2) {
          savingsAccount.withdraw();
        }
      }

      System.out.println("-------------------------------");
      System.out.println("Would you like to continue? \n1.Yes \n2.No");
      continueChoice = Answer.nextInt();
      
      
    } while (continueChoice == 1); 
      
    
    Answer.close();
  }

}