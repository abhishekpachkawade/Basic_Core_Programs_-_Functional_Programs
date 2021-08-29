
/*
Sum of three Integer adds to ZERO
a. Desc -> A program with cubic running time. Read in N integers and counts the
number of triples that sum to exactly 0.
b. I/P -> N number of integer, and N integer input array
c. Logic -> Find distinct triples (i, j, k) such that a[i] + a[j] + a[k] = 0
d. O/P -> One Output is number of distinct triplets as well as the second output is to
print the distinct triplets.

*/


import java.util.Scanner;

public class SumOfThreeZeroTriples {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		//ask to user enter the size of array
		System.out.println("Enter the size of array");
		//store the size of array value in variable integer is sizeOfArray
		int sizeOfArray = scan.nextInt();
		int array[] = new int[sizeOfArray];
		//ask to user enter the array element 
		System.out.println("Enter the element in array");
		
		//store the value in array[i]
		for(int i=0; i<sizeOfArray;i++) {
			
			array[i]= scan.nextInt();
		}
		
		int len = array.length;
		//variable 
		boolean foundTriplet = false;
		//constant 
		int tripletCount = 0;
		//for loop
		for(int i= 0; i<len-2;i++) {
			
			for(int j=i+1; j<len-1;j++) {
				
				for(int k=j+1; k<len;k++) {
					
					if(array[i] + array[j] + array[k]==0) {
						tripletCount++;
						System.out.println(array[i]+ " "+array[j]+ " " +array[k] );
						foundTriplet=true;
					}
				}
			}
		}
		
		System.out.println("The total number of triplets are:"+tripletCount);
		if(!foundTriplet) {
			System.out.println("No Triplets in the following series");
				
		}

	}
}






/*
Enter the size of array
5
Enter the element in array
2 42 65 2 65
The total number of triplets are:0
No Triplets in the following series

*/