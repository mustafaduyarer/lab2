package lab2;

import java.util.Scanner;

public class Question_5 {

	public static void main(String[] args) {
		double mealCharge;
	    double tax = 0.0675; // 6.75% constant amount of meal charge
		double taxAmount;
		double totalWithTax;
	    double tip = 0.20; // 20% constant amount of total amount after adding tax amount
		double tipAmount; 
		double totalBill;
		
		Scanner keyboard = new Scanner(System.in);
				
		//user has to enter the charge for the meal
		System.out.println("Please enter the charge for your meal $ ");
		mealCharge = keyboard.nextDouble();
		
		keyboard.nextLine();
				
		//calculate meal charge, tax amount, tip amount, and total bill
		taxAmount = mealCharge * tax;
		totalWithTax = mealCharge + taxAmount;
		tipAmount = totalWithTax * tip;
		totalBill = totalWithTax + tipAmount;
		
		//display to user meal charge, tax amount, tip amount, and total bill
		System.out.println("Your meal charge amount is $" + mealCharge + ".");
		System.out.println("Your tax amount is $" + taxAmount + ".");
		System.out.println("Your tip amount is $" + tipAmount + ".");
		System.out.println("-----------------------------------");
		System.out.println("Your total bill amount is $" + totalBill + ".");
				

	}

}
