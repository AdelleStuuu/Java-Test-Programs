import java.util.Scanner;

public class BankAccount {
  double money, fees, balance; // Added balance field
  Scanner sc = new Scanner(System.in);
  
  void deposit() {
    System.out.println("Enter the amount you want to deposit: ");
    money = sc.nextDouble();
    balance += money;
    System.out.println("You have deposited " + money + " Credits.");
  }
  
  void withdraw() { 
    System.out.println("Enter the amount you want to withdraw: ");
    money = sc.nextDouble();
    fees = money * 0.05;
    if (money > balance) {
      System.out.println("Insufficient balance.");
    } else {
      balance -= (money + fees);
      System.out.println("You have withdrawn " + money + " Credits.");
    }
  }

  void checkBalance() {
    System.out.println("Your current balance is " + balance + " Credits.");
  }
}