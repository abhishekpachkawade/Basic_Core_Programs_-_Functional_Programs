
//Java Program to Compute Quotient and Remainder

import java.util.Scanner;

public class QuotientRemender {

	public static void main(String[] args) {
		//ask to user Enter the number
		System.out.println("Enter a number");
        Scanner scan = new Scanner(System.in);
        //store the value in number1
        int number1 = scan.nextInt();
        //ask to user Enter the Divisor
        System.out.println("Enter a Divisor");
        ////store the Divisor in number1
        int number2 = scan.nextInt();
        
        //creating a object of QuotientRemainder class and also passing 2 value 
        QuotientRemender quotientRemender = new QuotientRemender(number1,number2);
	}
	
	//method calculate QuotientRemender passing two value
	public QuotientRemender(int number1,int number2) {
		 //calculating Remainder and Quotient
		 int Remainder = number1%number2;
	     int Quotient = number1/number2;
	     //printing the Remainder and Quotient 
	     System.out.println("Remainder: "+Remainder+" Quotient: "+Quotient);
	}
}






/*
 Output
Enter a number
20
Enter a Divisor
2
Remainder: 0 Quotient: 10
 
 */

