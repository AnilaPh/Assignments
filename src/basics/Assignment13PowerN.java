package basics;

import java.util.Scanner;

public class Assignment13PowerN {

	public static void main(String[] args) {
		// Implement pow(x, n), which calculates x raised to the power n (i.e., x^n
		
		try (//Accept base number
		Scanner input = new Scanner(System.in)) {
			System.out.println("Type the base number and hit enter key :  ");
			System.out.println();
			double number = input.nextDouble();
			
			try (//Accept Power
			Scanner inputPower = new Scanner(System.in)) {
				System.out.println("Type the exponent and hit enter key :  ");
				System.out.println();
				int power = inputPower.nextInt();
				
				double result = 1.0;
				
				if (power < 0 )
				{
					number = 1/number;
					power = -1 * power;
				}
				if(number == 0)  
					result = 1;
				else {
					for ( int i = 0 ; i < power ; i++)
						result = result * number;
					
				}
				System.out.println(" First result " + result);

				
				System.out.println(" The "+ power+ "th power of " +number+" is "+result);
			}
		}
		
		

	}

}
