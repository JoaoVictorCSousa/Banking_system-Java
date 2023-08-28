package application;

import java.util.Locale;
import java.util.Scanner;

import model.entities.Account;

public class Program {
	
	public static void main(String[]args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Type your account informations");
		System.out.print("Number: ");
		int number = sc.nextInt();
		System.out.print("Name: ");
		sc.nextLine();
		String holder = sc.nextLine();
		System.out.println("Initial amount: ");
		double balance = sc.nextDouble();
		System.out.println("WithDraw Limit: ");
		double withDrawLimit = sc.nextDouble();
		
		Account acc = new Account(number, holder, balance, withDrawLimit);
		
		System.out.println("");
		System.out.println("Inform a quantity to withdraw: ");
		double amount = sc.nextDouble();
		
		acc.withDraw(amount);
		System.out.printf("New Withdraw: %.2f" ,  acc.getBalance());
		
		sc.close();
		
	}

}
