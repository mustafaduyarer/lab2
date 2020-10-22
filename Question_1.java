package lab2;

import java.util.Scanner;

public class Question_1 {

	public static void main(String[] args) {
		 
		Scanner sc = new Scanner(System.in);
		 
		 int largest=0, smallest=0;
		 System.out.print("Enter your first number ");
		 int num = sc.nextInt();
		 smallest=num;
		 int num2=0, num1=0;
		 
		 do {
			 System.out.print("Enter your next number ");
			 num1 = sc.nextInt();
			 if(num1<smallest) 
				 smallest=num1;
			 if(num1>largest)
				 largest=num1;
			 System.out.print("Do you want to enter another number:0 for no and 1 for yes "); 
			 num2 = sc.nextInt();			 
		 }
		 while(num2==1);
		 System.out.println();
		 System.out.println("The smalllest value: " + smallest);
		 System.out.println("The largest value: " + largest);
		
		
		
	}

}
