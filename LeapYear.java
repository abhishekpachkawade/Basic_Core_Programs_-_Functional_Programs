
/*
 * Leap Year
a. I/P -> Year, ensure it is a 4 digit number.
b. Logic -> Determine if it is a Leap Year.
c. O/P -> Print the year is a Leap Year or not.
 
**/

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		// scanner class is use to scan the user value 
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the 4 digit Year to check year is leap year or not ");
		int year = scan.nextInt();
		
		// creating  object of LeapYear class 
		LeapYear leapyear = new LeapYear();
		
		//call a Functions
		leapyear.checkFourDigitNumber(year);
		leapyear.checkLeapYear(year);
		

	}
	// Check for 4 digit number
	public boolean checkFourDigitNumber(int year){
			if(year<10000) {
				return false;
			}
			else {
		
			    System.out.println("Please Enter Proper Year");
				return true;
			}
	}

/*
	Condition for Leap Year
	1. A year is a leap year if it is divisible by 4 but not by 100. 
	2. If a year is divisible by both 4 and by 100, then it can only be a leap year
	 if it is also divisible by 400. 
**/

		
	//Check for Leap year
	public boolean checkLeapYear(int year){
			//if else condition 
			 if(((year%4==0)&&(year%100!=0))||(year%400==0)) {
				 
				 System.out.println("Year is leapYear");
				 return true;
			 }
			 else {
				System.out.println("Year is not leap Year");
				 return false;
			 }
	}
}






/*
 * Out Put of this Program 
Enter the 4 digit Year to check year is leap year or not  
2000
Year is leapYear
    
    OUTPUT 2
Enter the 4 digit Year to check year is leap year or not 
200212
Please Enter Proper Year
Year is leapYear

  **/

