
//Java Program to Swap Two Numbers

import java.util.Scanner;

public class SwapTwoNumber {

	public static void main(String[] args) {
		//local variable
		int x, y, t;// x and y are to swap
		
		//scanner function to scan the value 
	    Scanner sc = new Scanner(System.in);  
	    System.out.println("Enter the value of X and Y");  
	    x = sc.nextInt();  
	    y = sc.nextInt();
	    
	    //print Statement 
	    System.out.println("before swapping numbers: "+x +"  "+ y);  
	      
	    //swapping   
	       t = x;  
	       x = y;  
	       y = t;  
	       System.out.println("After swapping: "+x +"   " + y);  
	       System.out.println( );  

	}

}




/*
 	OUTPUT
Enter the value of X and Y
2
3
before swapping numbers: 2  3
After swapping: 3   2
 
 */


