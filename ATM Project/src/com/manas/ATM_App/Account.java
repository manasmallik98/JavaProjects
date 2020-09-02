package com.manas.ATM_App;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Account {
	Scanner input = new Scanner(System.in);
	DecimalFormat moneyFormat = new DecimalFormat("'$'###,##0.00");
	private int customerNumber;
	private int pinNum;
	private double checkingBalance;
	private double savingBalance;
	
	//get the customer numer
	public int getCustomerNumber() {
		return customerNumber;
	}
	//set the customer numbber
	public void setCustomerNumber(int customerNumber) {
		this.customerNumber = customerNumber;
	}
	//get the pin numbber
	public int getPinNum() {
		return pinNum;
	}
	//set the pin number
	public void setPinNum(int pinNum) {
		this.pinNum = pinNum;
	}
	//get checking account bbalance
	public double getCheckingBalance() {
		return checkingBalance;
	}
	//get saving account balance
	public double getSavingBalance() {
		return savingBalance;
	}
	//calculate checking account withdraw
	public double calculateCheckingWithdraw(double amount) {
		checkingBalance = checkingBalance-amount;
		return checkingBalance;
	}
	//calculate saving account withdraw
	public double calculateSavingWithdraw(double amount) {
		savingBalance = savingBalance-amount;
		return savingBalance;
	}
	//calculate checking account deposit
	public double calculateCheckingDeposit(double amount) {
		checkingBalance = checkingBalance + amount;
		return checkingBalance;
	}
	//calculate saving balance  deposite
	public double calculateSavingDeposite(double amount) {
		savingBalance = savingBalance + amount;
		return savingBalance;
	}
	//customer checking account withdraw input
	public void getCheckingWithdrawInput() {
		System.out.println("Your Available Checking Account Balance: "+ moneyFormat.format(checkingBalance));
		System.out.println("Enter The Amount You Want to Withdraw From Checking Account: ");
		double amount=input.nextDouble();
		if (checkingBalance>=amount) {
			double balance=calculateCheckingWithdraw(amount);
			System.out.println("Transaction Successful");
			System.out.println("Your Available Checking Account Balance is: "+moneyFormat.format(balance));
		}
		else {
			System.out.println("Entered Amount is Not Available");
		}
	}
	//customer saving account withdraw input
	public void getSavingWithdrawInput() {
		System.out.println("Your Available Saving Account Balance: "+ moneyFormat.format(savingBalance));
		System.out.println("Enter The Amount You Want to Withdraw From Saving Account: ");
		double amount = input.nextDouble();
		if (savingBalance>=amount) {
			double balance=calculateSavingWithdraw(amount);
			System.out.println("Transaction Successful");
			System.out.println("Your Available Saving Account Balance is: "+moneyFormat.format(balance));
		}
		else {
			System.out.println("Enter Amount is Not Available");
		}
	}
	//customer checking account deposite input
	public void getCheckingDepositInput() {
		System.out.println("Your Available Checking Account Balance: "+ moneyFormat.format(checkingBalance));
		System.out.println("Enter Amount You Want to Deposit into Your Checking Account: ");
		double amount=input.nextDouble();
		if (amount>0) {
			double balance=calculateCheckingDeposit(amount);
			System.out.println("Deposite Successful");
			System.out.println("Available Balance after Deposite is: "+moneyFormat.format(balance));
		}
		else {
			System.out.println("Enter Amount Should Not Negative");
		}
	}
	//customer saving account deposite input
	public void getSavingDepositeInput() {
		System.out.println("Your Available Saving Account Balance: "+ moneyFormat.format(savingBalance));
		System.out.println("Enter Amount You Want to Deposite into Your Saving Account: ");
		double amount=input.nextDouble();
		if(amount>0) {
			double balance=calculateSavingDeposite(amount);
			System.out.println("Deposite To saving Account is Successful");
			System.out.println("Available Balance after Deposite is: "+moneyFormat.format(balance));
		}
		else {
			System.out.println("Enter Amount Should Not Negative");
		}
	}
	
}
