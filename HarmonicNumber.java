

//Prints the Nth Harmonic number: 1/1 + 1/2 + ... + 1/N

import java.util.Scanner;

public class HarmonicNumber {

	public static void main(String[] args) {
		
		// scanner class is use to scan the user value 
		Scanner scan = new Scanner(System.in);
				
		// ask the number to user 
		System.out.println("Enter Number ");
		int number = scan.nextInt();
				
		// creating  object of HarmonicNumber class
		HarmonicNumber HarmonicNum = new HarmonicNumber();
				
		//call a Functions
		HarmonicNum.checkNumberIsZero(number);
		HarmonicNum.calculateHarmonic(number);
		
	}
	
	
	
		// check Number Is Zero return type boolean 
		public boolean checkNumberIsZero(int number){
			//if else condition if number is zero than return false else true
			if(number==0)
				return false;
			else
				return true;
		}

		
		// calculating Harmonic Number 	
		public double calculateHarmonic(int number){
			// local variable type of variable double 
			double result=0;
			
			//for loop to calculating Harmonic series 
			for(int i=1;i<=number;i++){
				
				result=result+(double)1/i;
				System.out.println(result);
			}
	        System.out.println("Output of Harmonic Series is "+result);
			return result;
		}
	
}






/*
	OutPut

Enter Number 
2
1.0
1.5
Output of Harmonic Series is 1.5


*/
