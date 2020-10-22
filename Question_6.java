package lab2;

import java.util.Scanner;

public class Question_6 {
//	Write a program that will ask the user to enter the amount of a purchase. 
//	The program should then compute the state and county tax sales tax. Assume 
//	the state sales tax is 4 percent and the county sales tax is 2 percent. 
//	The program should display the amount of the purchase , the state sales tax, 
//	the county sales tax, the total sales tax, and the total of the sale 
//	(which is the sum of the amount of purchase plus the total sales tax)
//	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		double stateSalesTaxPerc=0.04; // 4 percent
		double countyTaxPerc=0.02; // 2 percent 
		
		double purchaseAmount;
	    double countyTax;
	    double stateSalesTax;
	    double totalTax;
		double totalSale;
		
		System.out.println("Please Enter The Purchase Amount:$");
		purchaseAmount = scanner.nextDouble();
		
		countyTax= countyTaxPerc * purchaseAmount;
		stateSalesTax= stateSalesTaxPerc * purchaseAmount;

		totalTax= countyTax + stateSalesTax;
		
		totalSale= totalTax + purchaseAmount;
		
		System.out.println("The purchase amount is : " + purchaseAmount);
		System.out.println("The state sales tax is : " + stateSalesTax);
		System.out.println("The county tax  is : " + countyTax);
		System.out.println("The total tax  is : " + totalTax);
		System.out.println("=====================================");
		System.out.println("The Total Sale is : $ " + totalSale);


		
		
	}

}
