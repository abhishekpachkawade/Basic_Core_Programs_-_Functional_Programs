/*
Power of 2
a. Desc -> This program takes a command-line argument N and prints a table of the
powers of 2 that are less than or equal to 2^N.
b. I/P -> The Power Value N. Only works if 0 <= N < 31 since 2^31 overflows an int
c. Logic -> repeat until i equals N.
d. O/P -> Print the year is a Leap Year or not.

*/
import java.util.Scanner;

public class PowerOfTwo {

	public static void main(String[] args) {
		
		// scanner class is use to scan the user value 
		Scanner scan = new Scanner(System.in);
		
		// ask the number to user 
		System.out.println("Enter Number ");
		int number = scan.nextInt();
		
		// creating  object of PowerOfTwo class
		PowerOfTwo poweroftwo = new PowerOfTwo();
		
		//call a Functions
		poweroftwo.checkNumberLessThan31(number);
		
		//close scanner class 
		scan.close();

	}

	
	// check Number Less then 31
	public boolean checkNumberLessThan31(int number) {
		//if else condition 
		if(number<31) {
			for(int i=0; i<number;i++) {
				System.out.println("2 ^ "+i+""+Math.pow(2,i));
			}
			return false;
		}
		else {
			System.out.println("Please Enter the Number less than 31");
			return true;
		}
	}
}
	
	



/*
 OUTPUT
Enter Number 
5
2 ^ 01.0
2 ^ 12.0
2 ^ 24.0
2 ^ 38.0
2 ^ 416.0

OR

Enter Number 
32
Please Enter the Number less than 31
 
 
 
 */



