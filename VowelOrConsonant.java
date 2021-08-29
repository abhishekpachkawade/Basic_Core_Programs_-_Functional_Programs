
//Java Program to Check Whether an Alphabet is Vowel or Consonant

import java.util.Scanner;

public class VowelOrConsonant {

	public static void main(String[] args) {
		
		System.out.println("Enter an alphabet:");
		Scanner scan = new Scanner(System.in);
		//The input provided by user is stored 
		//Returns the char value at the specified index. An index ranges from 0 to length() -1
		char a = scan.next().charAt(0);
		 
		//calling constructor passing one parameter  
		new VowelOrConsonant(a);	
		
	}
	
	//Constructor to check alphabet are vowel or not
	public VowelOrConsonant(char y) {
		
		//if else condition check alphabet are vowel or not 
		 if (y == 'a' || y == 'e' || y == 'i' || y == 'o'
		            || y == 'u' || y == 'A' || y == 'E' || y == 'I'
		            || y == 'O' || y == 'U') {
			 
			 		System.out.println("It is a Vowel.");
		  }
		  else {
		            System.out.println("It is a Consonant.");
	
		  }
	}
}

/*
OUTPUT

Enter an alphabet:
a
It is a Vowel.

OR

Enter an alphabet:
b
It is a Consonant.


*/