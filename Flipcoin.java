
/*
 Flip Coin and print percentage of Heads and Tails
a. I/P -> The number of times to Flip Coin. Ensure it is a positive integer.
b. Logic -> Use Random Function to get value between 0 and 1. If < 0.5 then tails or
heads
c. O/P -> Percentage of Head vs Tails
 */

import java.util.Scanner;

public class Flipcoin {

	public static void main(String[] args) {
        
		System.out.println("Welcome to the Flip coin Game");
		
		// local variable 
		int head=0;
		int tail =0;
		Scanner scan = new Scanner(System.in); 
		
		//Ask to user to Enter a number to filp a coin
		System.out.println("Enter a number to filp a coin");
		
		//store the value in num
		int num = scan.nextInt();
		
		//for loop Random Function to get value between 0 and 1
		for(int i=0; i<num; i++) {
			
			// Random Function
			double Random = (int) Math.floor(Math.random()%10*2);
			
			//if else condition  
			if(Random == 1) {
				head++;
			}
			else {
				tail++;
			}
			
			//Increment by 1 for loop 
			i++;
		}
		
		//calculating Percentage of head in integer 
		int Percentage_of_Head = (head*100/num);
		
		//calculating Percentage of Tail in integer
		int Percentage_of_Tail = (tail*100/num);
		
		//Printing Percentage of head and tail
		System.out.println("Percentage of Head = " +Percentage_of_Head);
		System.out.println("Percentage of Tail = " +Percentage_of_Tail);

	}

}






/*
 Output
 
Welcome to the Flip coin Game
Enter a number to filp a coin
2
Percentage of Head = 50
Percentage of Tail = 0
 
 */
