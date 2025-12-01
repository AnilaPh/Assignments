package basics;

public class Assignment09ArraysLoops {

	public static void main(String[] args) {
		
		int[] arrayNumbers = {12,34,11,36,87,98,93};
		
		int temp = 0;
		
		//Sorting by comparing numbers
		
		for( int i=0; i<arrayNumbers.length ; i++)
		{
			for ( int j = 0 ; j < arrayNumbers.length ; j++) {
				if ( arrayNumbers[i] < arrayNumbers[j]) {
					temp = arrayNumbers[i];
					arrayNumbers[i] = arrayNumbers[j];
					arrayNumbers[j] = temp;
				}
			}
		}
		System.out.println("Second Largest Number in the array : " + arrayNumbers[1]);
		System.out.println("Third Largest Number in the array: " + arrayNumbers[2]);		
	}

}
