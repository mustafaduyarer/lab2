package lab2;

import java.util.Scanner;

public class Question_3 {

	public static void main(String[] args) {
		System.out.println("Enter a positive number"); 
		
		    Scanner scan = new Scanner(System.in);
		
		    int n = scan.nextInt();
		
		 
		
		    // you have to declare sum before using it
		
		    int sum = 0;
		
		    for(int i = 0;i <= n; i++)
	
		    {
		
		        sum=sum+i;
		    }
	
		    System.out.println("Sum is " + sum);

	    }

	}


