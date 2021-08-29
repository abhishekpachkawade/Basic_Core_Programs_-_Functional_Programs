
//Check the number is even or odd 

import java.util.Scanner;

public class CheckEvenOdd {

	public static void main(String[] args) {
		// variable
		int num;
	    System.out.println("Enter an Integer number");

	    //The input provided by user is store 
	    Scanner input = new Scanner(System.in);
	    num = input.nextInt();
	    input.close();
	    
	    // If number is divisible by 2 then it's an even number
	     // else odd number
	    if ( num % 2 == 0 ) {
	        System.out.println("Entered number is even");
	    }
	     else {
	        System.out.println("Entered number is odd");
	     }
	        

	}

}


/*
	output

Enter an Integer number
12
Entered number is even


**/