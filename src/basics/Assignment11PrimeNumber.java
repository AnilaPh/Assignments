package basics;

import java.util.Scanner;

public class Assignment11PrimeNumber {

	public static void main(String[] args) {
		//Prime number
		
		//int number =7 ;
		boolean isPrime =true;
		
		//Accept the number from user
		Scanner input = new Scanner(System.in);
		System.out.println("Input the number and hit enter :  ");
		int number = input.nextInt();
		
		//check whether the number is prime
		if(number <= 1)
			isPrime = false;
		
		else {
			for(int i=2; i<number ;i++) {
				if(number % i == 0)
				{
					isPrime = false;
					break;
				}
					
			}
		}
		
		//print whether the number is prime or not	
		
		if(isPrime)
			System.out.println(number + " is prime");
		else
			System.out.println(number + " is not prime");
		
	}

}
