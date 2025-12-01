package basics;

import java.util.HashMap;
import java.util.Map;

public class Assignment10LoopsMapTable {

	public static void main(String[] args) {
		
		/**There are 5 Employee records. Now Calculate the Hike percentage of each Employee and store the
		Values in Map with EmployeeName and HikePercentagevalue and Print them.

		Ex: Map<String, Double> output ;

		Hike = ( Base Salary * variable pay % ) + Bonus + Reward ;
		Hike % = Hike / Base Salary . */
		String[] empName = {"Alice Johnson", "Bob Smith", "Carol Davis", "David Brown", "Eva Green"};
		
		//Employee details
		Double[] emp1Details = {75000.0,5.1,4.2};
		//System.out.println("emp1Details in array" + emp1Details[0]);
		Double[] emp2Details = {68000.0,3.2,3.8};
		Double[] emp3Details = {82000.0,7.1,4.5 };
		Double[] emp4Details = {90000.0,10.2,2.5};
		Double[] emp5Details = {60000.0,2.4,3.5};
		
		
		//Map<String,Double[]> empDetails = new HashMap<String,Double[]>();
		Map<String,Double[]> empDetails = new HashMap<>();
		empDetails.put(empName[0], emp1Details);
	 	//System.out.println("empName[0] " + empName[0]);
		empDetails.put(empName[1], emp2Details);
		empDetails.put(empName[2],emp3Details);
		empDetails.put(empName[3],emp4Details);
		empDetails.put(empName[4],emp5Details);
	
		
		//Calculate hike
		
		Map<String,Double> hikeMap = new HashMap<String, Double>();
		//Map<String,Double> hikeMap = new HashMap<>();
		for(String emp : empName) {
			Double[] data = empDetails.get(emp);
		//	System.out.println("data " + data);
		//	System.out.println("data[0],  data[1], data[2] " +data[0]+ " " + data[1]+"  " + data[2]);
		double hikePercent = calculateHike(data[0],data[1],data[2]);
			hikeMap.put(emp, hikePercent);
			 	
		}
		
		//Print hike
		for(String emp : empName) {
			System.out.println(emp + "  " + hikeMap.get(emp) + "%" );
		}
	}

	//Method for calculating hike
	
	public static double calculateHike(double baseSalary, double exp, double rating) {
		double variablePayPercent;
		double bonus;
		double reward;
		double hike;
		double hikePercent;
		if(rating >= 4.0) {
			variablePayPercent=  15.0; 
			bonus = 1500;
		} else if(rating >= 3.0) {
			variablePayPercent=  10.0;
			bonus = 1200;
		} else {
			variablePayPercent= 3.0;
			bonus = 300;	
		}
		//experience check
		if( exp > 5) {
			reward = 5000;
		}
		else 
			reward = 0;
		
		hike =( baseSalary * variablePayPercent /100 )+ bonus + reward ;
		hikePercent = hike / baseSalary *100;
		return(hikePercent);
		
	}
	
}
