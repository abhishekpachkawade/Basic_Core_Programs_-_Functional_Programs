
/*
Write a program WindChill.java that takes two double command-line arguments t
and v and prints the wind chill. Use Math.pow(a, b) to compute ab. Given the
temperature t (in Fahrenheit) and the wind speed v (in miles per hour), the
National Weather Service defines the effective temperature (the wind chill) to be:

Note: the formula is not valid if t is larger than 50 in absolute value or if v is larger
than 120 or less than 3 (you may assume that the values you get are in that range).

*/

import java.util.Scanner;

public class WindChill {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		//ask to user enter the value
		System.out.println("Enter x condoned");
		//store the value in x with the double type
		double x = scan.nextDouble();
		//ask to user enter the value
		System.out.println("Enter y condoned");
		//store the value in y with the double type
		double y = scan.nextDouble();
		//calling method with passing 2 parameter 
		windChill(x, y);

	}
	
	//static method 
	static void windChill(double a, double b) {
		double windchill = (35.74+0.6215*a+(0.4275*a-35.75)*Math.pow(b, 0.16));
		System.out.println(windchill);		
	}

}






/*
OUTPUT
Enter x condoned
2
Enter y condoned
3
-4.61788822725628

*/
