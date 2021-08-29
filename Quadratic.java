
/*
Write a program Quadratic.java to find the roots of the equation a*x*x + b*x + c.
Since the equation is x*x, hence there are 2 roots. The 2 roots of the equation
can be found using a formula (Note: Take a, b and c as input values)
delta = b*b - 4*a*c
Root 1 of x = (-b + sqrt(delta))/(2*a)
Root 2 of x = (-b - sqrt(delta))/(2*a)

*/

import java.util.Scanner;

public class Quadratic {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		//try catch box
		try {
			//ask to user enter the value 
			System.out.println("Enter a ");
			//store the value in a 
			int a = s.nextInt();
			//ask to user enter the value 
			System.out.println("Enter b");
			//store the value in b
			int b = s.nextInt();
			//ask to user enter the value 
			System.out.println("Enter c");
			//store the value in c
			int c = s.nextInt();
			//calling static method
			roots(a, b, c);
			s.close();
		}
		catch (Exception e) {
			System.out.println("enter correct input");
		}	

	}
	//static method 
	static void roots(int a, int b, int c) {
		// calculating delta value
		int delta = Math.abs(b * b - 4 * a * c);
		double x1 = (-b + Math.pow(delta, 1 / 2)) / (2 * a);
		double x2 = (-b - Math.pow(delta, 1 / 2)) / (2 * a);
		System.out.println(x1);
		System.out.println(x2);

	}
}





/*
OUTPUT
Enter a 
2
Enter b
2
Enter c
2
-0.25
-0.75

*/