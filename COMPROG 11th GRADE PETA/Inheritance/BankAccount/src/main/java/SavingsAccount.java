import java.util.Scanner;
public class SavingsAccount extends BankAccount {
  Scanner input = new Scanner(System.in);
  int amount, amountWithdraw;

  void deposit() {
    System.out.println("-------------------------------");
    System.out.print("Enter the amount to be deposited: ");
    amount += input.nextInt();
    System.out.println("Amount deposited: " + amount);
  }
  
  void withdraw() {
    System.out.println("-------------------------------");
    System.out.print("Enter the amount to be withdrawn: ");
    amountWithdraw = input.nextInt();
    if (amountWithdraw < amount) {
      amount -= amountWithdraw;
      System.out.println("Amount withdrawn: " + amountWithdraw);
      System.out.println("Amount left: " + amount);
    } else if (amountWithdraw > amount || amount - amountWithdraw < 100){
      System.out.println("Insufficient balance or minimum balance constraint");
    }
  }
}