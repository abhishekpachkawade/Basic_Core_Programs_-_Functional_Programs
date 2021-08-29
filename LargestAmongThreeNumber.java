
// Java Program to Find the Largest Among Three Numbers

import java.util.Scanner;

public class LargestAmongThreeNumber {

	public static void main(String[] args) {
		//Ask to user Enter any three number
		System.out.println("Enter any Three Numbers");
        Scanner scan = new Scanner(System.in);
        //store the value in n1, n2, n3
        int n1 = scan.nextInt();
        int n2 = scan.nextInt();
        int n3 = scan.nextInt();
        
        //if else condition to check largest number 
        if( n1 >= n2 && n1 >= n3) {
        System.out.println(n1 + " is the largest number.");
        }
        else {
        	if (n2 >= n1 && n2 >= n3) {
       
        		System.out.println(n2 + " is the largest number.");
        	}
        	else {
        		System.out.println(n3 + " is the largest number.");
        	}
        }
	}

}




/*
	outPut

Enter any Three Numbers
12 35 46
46 is the largest number.

*/