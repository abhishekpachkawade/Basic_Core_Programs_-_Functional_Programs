
/*
Factors
a. Desc -> Computes the prime factorization of N using brute force.
b. I/P -> Number to find the prime factors
c. Logic -> Traverse till i*i <= N instead of i <= N for efficiency.
d. O/P -> Print the prime factors of number N.

*/

import java.util.Scanner;

public class PrimeFactor {

	public static void main(String[] args) {
		// scanner class is use to scan the user value 
		Scanner scan = new Scanner(System.in);
						
		// ask the number to user 
		System.out.println("Enter Number ");
		int number = scan.nextInt();
						
		// creating  object of PrimeFactor class
		PrimeFactor primefactor = new PrimeFactor();
		
		//call a Functions
		primefactor.findPrimeFactor(number);
		scan.close();

	}
	
	//function to calculate prime factor of number
	public void findPrimeFactor(int number){
		
		for(int i=1;i*i<=number;i++){
			if(number%i==0)
				System.out.print(" "+i);
			}
	}
}



/*
  	OutPUt
 
   Enter Number 
   12
   1 2 3
  
 */

