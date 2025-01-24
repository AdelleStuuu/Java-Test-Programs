import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    int choice1;
    Scanner sc = new Scanner(System.in);
    BankAccount account = new BankAccount();
    SavingAccount savingAccount = new SavingAccount();
    CheckingAccount checkingAccount = new CheckingAccount();

    do {

      System.out.println("Welcome to the AdelleBank!\nWhat do you wanna do?\n1.Bank Account\n2.Saving Account\n3.Checking Account");
      int choice = sc.nextInt();
      System.out.println(" ");
      switch (choice) {
        case 1:

          System.out.println("Welcome to the Bank Account!\nWhat do you wanna do?\n1.Deposit\n2.Withdraw\n3.Check Balance");
          choice = sc.nextInt();
          switch (choice) {
            case 1: 
              System.out.println(" ");
              account.deposit();
              System.out.println(" ");
              break;
            case 2: 
              System.out.println(" ");
              account.withdraw();
              System.out.println(" ");
              break;
            case 3: 
              System.out.println(" ");
              account.checkBalance();
              System.out.println(" ");
              break;
          }  
          break;
        case 2:

          System.out.println("Welcome to the Savings Account!\nWhat do you wanna do?\n1.Deposit\n2.Withdraw\n3.Check Balance");
          choice = sc.nextInt();
          switch (choice) {
              case 1: 
              System.out.println(" ");
                savingAccount.deposit();
                System.out.println(" ");
                break;
              case 2: 
              System.out.println(" ");
                savingAccount.withdraw();
                System.out.println(" ");
                break;
              case 3: 
              System.out.println(" ");
                savingAccount.checkBalance();
                System.out.println(" ");
                break;

              }
          break;

        case 3:
          System.out.println("Welcome to the Checking Account!\nWhat do you wanna do?\n1.Deposit\n2.Withdraw\n3.Check Balance");
          choice = sc.nextInt();
          switch (choice) {
            case 1: 
              System.out.println(" ");
              checkingAccount.deposit();
              System.out.println(" ");
              break;
            case 2: 
              System.out.println(" ");
              checkingAccount.withdraw();
              System.out.println(" ");
              break;
            case 3: 
              System.out.println(" ");
              checkingAccount.checkBalance();
              System.out.println(" ");
              break;
              }
          break;
          }

      System.out.println("Do you wish to continue? (1=Y/2=N)");
      choice1 = sc.nextInt();
      System.out.println(" ");
    } while (choice1 == 1);
    
  }
        
}