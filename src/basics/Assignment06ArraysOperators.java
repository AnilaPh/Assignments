package basics;

public class Assignment06ArraysOperators {

	public static void main(String[] args) {
		/***********Create two arrays to store student names ["Suresh","Mahesh","Naresh"] and
		marks [75, 80, 82] Add 10 marks to each students using assignment operators and
		store it into another array, after adding 10 marks identify the average marks of all
		students*********/
		
		//String[] studentNames = new String[3];
		String[] studentNames = {"Suresh","Mahesh","Naresh"};
		double[] studentMark = {75, 80, 82};
		
		//add 10 to marks
		
		double[] updatedMark = new double[3];
		updatedMark[0] = studentMark[0] + 10;
		updatedMark[1] = studentMark[1] + 10;
		updatedMark[2] = studentMark[2] + 10;
		
		System.out.println("Student Marks : " + studentMark[0] + "  " + studentMark[1] + "  " + studentMark[2] );
		
		//Print updated marks
		System.out.println("-------------------------------------------");
		System.out.println("Updated Student Marks :");
		System.out.println("-------------------------------------------");
		System.out.println( studentNames[0] +" : "  + updatedMark[0] );
		System.out.println( studentNames[1] +" : "  + updatedMark[1] );
		System.out.println( studentNames[2] +" : "  + updatedMark[2] );
		
	
		System.out.println("Average Marks = " + ((updatedMark[0]+updatedMark[1]+updatedMark[2])/3.0));
		

	}

}
