package basics;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Assignment04Collections {

	public static void main(String[] args) {
		System.out.println("==================Collections==========================");
		/*
		 * 1. Create Lists with area of top 5 largest cities. Print the total area of
		 * the 3rd and 4th cities combined.
		 */
		System.out.println("==================List==========================");
		List<Double> landArea = new ArrayList<Double>();
		landArea.add(2000.01);
		landArea.add(5000.01);
		landArea.add(3000.08);
		landArea.add(2500.06);
		landArea.add(3450.7);
		double totalArea = landArea.get(2)+landArea.get(3);
		System.out.println("City Area of 3rd and 4th :" + totalArea +" sq km");
		//System.out.println(landArea.get(2)+landArea.get(3));
		
		System.out.println();
		System.out.println("==================Set==========================");
		
		
		/*2. Create a set of the top 10 most visited tourist attractions in the world and print out all
		of them and its size.*/
		Set<String> touristAttractions = new HashSet<String>();
		touristAttractions.add("Los Angeles");
		touristAttractions.add("Disney Land");
		touristAttractions.add("Disney World");
		touristAttractions.add("Hollywood");
		touristAttractions.add("TajMahal");
		touristAttractions.add("Atlanta");
		touristAttractions.add("Paris");
		touristAttractions.add("London");
		touristAttractions.add("Dubai");
		touristAttractions.add("Abubhabi");
		System.out.println("Attractive Places : " );
		System.out.println(touristAttractions);
		System.out.println("No. of places : "+touristAttractions.size());
		
		System.out.println();
		System.out.println("===============Array=============================");
		/*3. Create an array of 10 numbers (any 10 numbers) and print out the Average of 5th and
		6th Value.*/
		int[] arrayNumbers= {20,30,40,15,25,35,27,40,40,20};
		double average =( arrayNumbers[4]+ arrayNumbers[5])/2.0;
		System.out.println(" The Average of 5th and 6th Value" + average);
		
		
		System.out.println();
		System.out.println("==================movies==========================");
		/*
		 * 4. Create a list of the top 5 highest-grossing movies of all time and print
		 * out the third movie on the list.
		 */
		List<String> movies = new ArrayList<String>();
		movies.add("movie1");
		movies.add("movie2");
		movies.add("movie3");
		movies.add("movie4");
		movies.add("movie5");

		System.out.println("Highest grossing movies ");
		System.out.println(movies);
		System.out.println("the third movie on the list "+ movies.get(2) );
	}

}
