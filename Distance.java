/*
Write a program Distance.java that takes two integer command-line arguments x
and y and prints the Euclidean distance from the point (x, y) to the origin (0, 0). The
formulae to calculate distance = sqrt(x*x + y*y). Use Math.power function
*/

import java.util.Scanner;

public class Distance {

	public static void main(String[] args) {
		//try catch statement 
		try {
			Scanner scan = new Scanner(System.in);
			//The input provided by user is store
			System.out.println("Enter value for x");
			int x = scan.nextInt();
			System.out.println("Enter value for y ");
			int y = scan.nextInt();
			
			//call static calculate method
			calculate(x, y);
			
			//close scanner class 
			scan.close();
		} catch (Exception e) {
			System.out.println("Enter integer only");

	}

}
	//static method calculate 
	static void calculate(int x, int y) {
		
		//calculating and printing distance = sqrt(x*x + y*y)
		System.out.println("Distance is " + Math.sqrt(Math.pow(x,2)+Math.pow(y,2)));
	}
}






/*
	OutPut

Enter value for x
2
Enter value for y 
2
Distance is 2.8284271247461903


*/