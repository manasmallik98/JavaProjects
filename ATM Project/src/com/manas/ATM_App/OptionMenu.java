package com.manas.ATM_App;

import java.io.IOException;
import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Scanner;

public class OptionMenu extends Account{
	Scanner menuInput=new Scanner(System.in);
	DecimalFormat moneyFormat = new DecimalFormat("'$'###,##0.00");
	int selection;
	
	HashMap<Integer, Integer> data = new HashMap<>();
	
	//validate login information customer number and pin number
	public void getLogin() throws IOException {
		int x=1;
		do {
			try {
				data.put(9438600, 454);
				data.put(8018315, 266);
				data.put(8249919, 905);
				System.out.println("Welcome To The ATM Project");
				System.out.println("Enter Your Customer Number");
				setCustomerNumber(menuInput.nextInt());
				System.out.println("Enter Your Pin Numer");
				setPinNum(menuInput.nextInt());
				
			} catch (Exception e) {
				System.out.println("\n"+"Invalid characters Only number "+"\n");
				x=2;
			}
			for(Entry<Integer, Integer> entry: data.entrySet()) {
				if (entry.getKey()==getCustomerNumber() && entry.getValue()==getPinNum()) {
					getAccountType();
				}
			}
			System.out.println("Wrong Customer Number Or Pin Number");
		} while (x==1);
	}
	//display account type menu with selection
	public void getAccountType() {
		System.out.println("Select the account you want to access");
		System.out.println("Type 1 - Checking Account");
		System.out.println("Type 2 - Saving Account");
		System.out.println("Type 3 - Exit");
		System.out.println("Choice");
		selection=menuInput.nextInt();
		
		switch (selection) {
		case 1:
			getChecking();
			break;
		case 2:
			getSaving();
			break;
		case 3:
			System.out.println("Thank You For using This ATM project");
			break;
		default:
			System.out.println("Invalid Input");
		}
	}
	public void getChecking() {
		System.out.println("Checking Account");
		System.out.println("Type 1 - View Balance");
		System.out.println("Type 2 - Withdraw Balance");
		System.out.println("Type 3 - Deposit Balance");
		System.out.println("Type 4 - Exit");
		System.out.println("choice");
		selection=menuInput.nextInt();
		
		switch(selection) {
		case 1:
			System.out.println("Checking Account Balance: "+moneyFormat.format(getCheckingBalance()));
			getAccountType();
			break;
		case 2:
			getCheckingWithdrawInput();
			getAccountType();
			break;
		case 3:
			getCheckingDepositInput();
			getAccountType();
			break;
		case 4:
			System.out.println("Thank You For using This ATM project");
			break;
		default:
			System.out.println("Invalid Input");
		}
		
	}
	public void getSaving() {
		System.out.println("Saving Account");
		System.out.println("Type 1 - View Balance");
		System.out.println("Type 2 - Withdraw Balance");
		System.out.println("Type 3 - Deposit Balance");
		System.out.println("Type 4 - Exit");
		System.out.println("choice");
		selection=menuInput.nextInt();
		
		switch(selection) {
		case 1:
			System.out.println("Saving Account Balance: "+moneyFormat.format(getSavingBalance()));
			getAccountType();
			break;
		case 2:
			getSavingWithdrawInput();
			getAccountType();
			break;
		case 3:
			getSavingDepositeInput();
			getAccountType();
			break;
		case 4:
			System.out.println("Thank You For using This ATM project");
			break;
		default:
			System.out.println("Invalid Input");
		}
	}
			
}
