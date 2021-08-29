
/*
2D Array
a. Desc -> A library for reading in 2D arrays of integers, doubles, or booleans from
standard input and printing them out to standard output.
b. I/P -> M rows, N Cols, and M * N inputs for 2D Array. Use Java Scanner Class
c. Logic -> create 2 dimensional array in memory to read in M rows and N cols
d. O/P -> Print function to print 2 Dimensional Array. In Java use PrintWriter with
OutputStreamWriter to print the output to the screen.

*/
import java.util.Scanner;

public class TwoDArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//ask to user Enter the rows
		System.out.println("Enter the rows");
		//store the value in n
		int n = sc.nextInt();
		
		//ask to user Enter the rows
		System.out.println("Enter the columns");
		//store the value in n
		int m = sc.nextInt();
		// print statement 
		System.out.println("Cases for 2D Array ....");
		System.out.println("1  ==>> Integer");
		System.out.println("2  ==>> Double");
		System.out.println("3  ==>> Boolean");
		//store in cas 
		int cas = sc.nextInt();
		
		//switch case statement 
		switch(cas){
		case 1:
			//array of integer
			int arr[][] = new int[n][m];
			for(int i=0;i<n;i++){
				for(int j=0;j<m;j++){
					arr[i][j] = sc.nextInt();
				}
			}
			for(int i=0;i<n;i++){
				for(int j=0;j<m;j++){
					System.out.print(" "+arr[i][j]);
				}
				System.out.println(" ");
			}
		case 2:
			//array of double type
			double arrD[][] = new double[n][m];
			for(int i=0;i<n;i++){
				for(int j=0;j<m;j++){
					arrD[i][j] = sc.nextInt();
				}
			}
			for(int i=0;i<n;i++){
				for(int j=0;j<m;j++){
					System.out.print(" "+arrD[i][j]);
				}
				System.out.println(" ");
			}
			
		case 3:
			//array of boolean type
			boolean arrB[][] = new boolean[n][m];
			for(int i=0;i<n;i++){
				for(int j=0;j<m;j++){
					arrB[i][j] = sc.nextBoolean();
				}
			}
			for(int i=0;i<n;i++){
				for(int j=0;j<m;j++){
					System.out.print(" "+arrB[i][j]);
				}
				System.out.println(" ");
			}
			//default statement 
		default :
			System.out.println("INVALID");
		}
	}

}




/*

	OUTPUT
Enter the rows
2
Enter the columns
2
Cases for 2D Array ....
1  ==>> Integer
2  ==>> Double
3  ==>> Boolean
1
12 25 75 84
 12 25 
 75 84 

*/

