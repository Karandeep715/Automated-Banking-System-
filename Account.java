package bankingsystem;
import java.text.DecimalFormat;
import java.util.*;



public class Account {
	Scanner input = new Scanner(System.in);
	DecimalFormat moneyFormat = new DecimalFormat("'Rs',###,##0.00");
	
	/* Setting the Customer Number */
	
	public int setCustomerNumber(int customerNumber) {
		this.customerNumber=customerNumber;
		return customerNumber;
	}
	
	/* Get the Customer Number */
	
	public int getCustomerNumber() {
		
		return customerNumber;
	}
	
	/* Set the Pin number */
	
	public int setPinNumber(int pinNumber) {
		
		this.pinNumber=pinNumber;
		return pinNumber;
	}
	
	/* Get Pin Number */
	
	public int getPinNumber() {
		return pinNumber;
	}
	
	/* Get checking Account Balance */
	
	public double getCurrentBalance() {
		
		return currentBalance;
		
	}
	
	/* Get Saving Account Balance */
	
	public double getSavingBalance() {
		return savingBalance;
	}
	
	
	/* Calculate Current Account withdrawal */
	
	public double calcCurrentWithdraw(double amount) {
		currentBalance= (currentBalance - amount);
		return currentBalance;
	}
	
	/* Calculate Saving Account withdrawal */
	
	public double calcSavingWithdraw(double amount) {
		
		savingBalance = (savingBalance - amount);
		return savingBalance;
		
	}
	
	/* Calculate  Current account deposit */
	
	public double calcCurrentDeposit(double amount) {
		currentBalance = (currentBalance + amount);
		return currentBalance;
		
	}
	
	/* Calculate Saving Account deposit */
	
	public double calcSavingDeposit(double amount) {
		savingBalance=(savingBalance + amount);
		return savingBalance;
	}
	
	/* Customer Current Account withdraw input */
	
	public void getCurrentWithdrawInput() {
		
		System.out.println("Current Account Balance: " + moneyFormat.format(currentBalance));
		System.out.print("Amount you want to withdraw from Current Account: ");
		double amount = input.nextDouble();
		
		if((currentBalance - amount)>= 0) {
			
			calcCurrentWithdraw(amount);
			System.out.println("New Current Account Balance: " + moneyFormat.format(currentBalance));
		} else {
			System.out.println("Balance cannot be negative." + "\n");
		}
	}
	
	/* Customer Saving Account Withdraw input */
	public void getSavingWithdrawInput() {
		System.out.println("Saving Account Balance: " + moneyFormat.format(savingBalance));
		System.out.print("Amount you want to withdraw from Saving Account: ");
		double amount = input.nextDouble();
		
		if((savingBalance - amount)>= 0) {
			calcSavingWithdraw(amount);
			System.out.println("New Saving Account Balance: " + savingBalance + "\n");
		}else {
			System.out.println("Balance cannot be neagtive." + "\n");
		}
	}
	
	/* Customer Current Account Deposit Input */
	
	public void getCurrentDepositInput() {
		System.out.println("Current Account Balance: " + moneyFormat.format(currentBalance));
		System.out.print("Amount you want to deposit from Current Account: ");
		double amount = input.nextDouble();
		
		if((currentBalance + amount)>= 0) {
			calcCurrentDeposit(amount);
			System.out.println("New Current Account balance: " + moneyFormat.format(currentBalance));
		}else {
			System.out.println("Balance cannot be negative." + "\n");
		}
	}
	
	/*  Customer Saving Account Deposit Input */
	
	public void getSavingDepositInput() {
		System.out.println("Saving Account Balance: " + moneyFormat.format(savingBalance));
		System.out.print("Amount you want to deposit from Saving Account: ");
		double amount = input.nextDouble();
		if((savingBalance + amount)>= 0) {
			calcSavingDeposit(amount);
			System.out.println("New Saving Account Balance: " + moneyFormat.format(savingBalance));
		}else {
			System.out.println("Balance cannot be negative." + "\n");
		}
	}
	
	private int customerNumber;
	private int pinNumber;
	private double currentBalance = 0;
	private double savingBalance = 0;
		
}
