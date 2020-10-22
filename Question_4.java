package lab2;

import java.util.Scanner;

public class Question_4 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double numOfMales=0;
		double numOfFemales=0;
		
		System.out.println("How many males are in the class ");
		numOfMales=scan.nextInt();
		
		System.out.println("How many females are in the class ");
		numOfFemales = scan.nextInt();
		
	
		double total=numOfMales+numOfFemales;
		System.out.println(total);
		System.out.println("percentage of males "+(numOfMales * 100) / total);
		System.out.print("percentage of females "+(numOfFemales * 100) / (numOfMales + numOfFemales));

	}

}
