package basics;

import java.util.Scanner;

public class Assignment14DiamondPyramid {

	public static void main(String[] args) {
		// Print the numbers in diamond-shaped pyramid of numbers
		
		try (//Accept Number
				Scanner inputPower = new Scanner(System.in)) {
					System.out.println("Type the number and hit enter key :  ");
					int number = inputPower.nextInt();
					
		// print the upper pyramid
		for(int i=0 ; i <= number ; i++) {
			
			for(int j=number; j>=i ; j--) {
				System.out.print(" ");
			}	
			for(int j=1; j <=i ; j++) {
				System.out.print(j + " ");
				
			}
			System.out.println();	
		}
		
		// print the lower pyramid
		for(int i=number-1 ; i >0  ; i--) {
			for(int j=number; j>=i ; j--) {
				System.out.print(" ");
			}
				
			for(int j=1; j <=i ; j++) {
				System.out.print(j + " ");
				
			}
			
			System.out.println();	
		}
	}

}
}

