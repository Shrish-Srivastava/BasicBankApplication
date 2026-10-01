package ApplicationOne;
import java.util.*;

public class BankApp {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		BankAccount bank = new BankAccount(1000001,"Shrish Srivastava",1111,15000.0);
		System.out.println("Please enter the PIN : ");
		int pin = sc.nextInt();
		if(bank.login(pin) ) {
			while(true) {
			System.out.println("Please select a option from the Banking menu: \n 1. Check Balance \n 2. Deposit Amount \n 3. Withdraw Amount \n 4. Display Account Details \n 5. Exit");
			System.out.println("Enter your choice: ");
			int choice = sc.nextInt();
			switch(choice) {
			case 1: bank.checkBalance();
			break;
			
			case 2: System.out.println("Enter deposit amount:");
			double amt = sc.nextDouble();
			bank.deposit(amt);
			break;
			
			case 3: System.out.println("Enter withdrawal amount: ");
			double amt1 = sc.nextDouble();
			bank.withdraw(amt1);
			break;
			
			case 4: bank.displayAccountDetails();
			break;
			
			case 5: System.out.println("Thank you for using the Bank Application.");
			return;
			default: System.out.println("Enter from the given choices. Thank You!");
			}
		}
	}
}
}

class BankAccount {
	private int accountNumber;
	private String accountHolderName;
	private int pin;
	private double accountBalance;
	
	
	BankAccount(int accountNumber, String accountHolderName,  int pin, double accountBalance) {
		this.accountNumber = accountNumber;
		this.accountHolderName = accountHolderName;
		this.pin = pin;
		this.accountBalance = accountBalance;
	}
	
	
	boolean login(int enteredPin) {
		if(enteredPin == pin) {
			System.out.println("Login Successful");
			return true;
		} else {
			System.out.println("Invalid PIN. Please try again.");
			return false;
		}
	}
	
	
	void checkBalance() {
		System.out.println("Current Balance: " + accountBalance);
	}
	
	
	void deposit(double amount) {
		if(amount > 0) {
		accountBalance += amount;
		System.out.println("Amount Deposited Successfully");
		System.out.println("Updated Balance: " + accountBalance);
		}
		else if(amount <= 0) {
			System.out.println("Invalid Deposit Amount");
		}
	}
	
	
	void withdraw(double amount) {
		if(amount > 0 && accountBalance >= amount) {
			accountBalance -= amount;
			System.out.println("Amount Withdrawn Successfully");
			System.out.println("Updated Balance: " + accountBalance);
		}
		else if(amount > accountBalance) {
			System.out.println("Insufficient Balance");
		}
		else if(amount <= 0) {
			System.out.println("Invalid Withdrawal Amount");
		}
	}
	
	
	void displayAccountDetails() {
		System.out.println("Account Number : " + accountNumber);
		System.out.println("Account Holder Name : " + accountHolderName);
	}
}
