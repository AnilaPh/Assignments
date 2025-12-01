package basics;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Assignment05CollectionsTables {

	public static void main(String[] args) {
		//Student1 details
		Map<String,String> student1Details = new HashMap<String, String>();
		student1Details.put("Name","John Doe");
		student1Details.put("Age","Twenty");
		student1Details.put("Gender","Male");
		student1Details.put("Roll Number","SBA12345");
		student1Details.put("Grade","A++");
		student1Details.put("Major","Computer Science");
		student1Details.put("GPA","A3.8");
		student1Details.put("Email","john@example.com");
		student1Details.put("PAN Number","SDF6543210");
		student1Details.put("Address","123 Elm St");
		
		//Student2 details
		Map<String,String> student2Details = new HashMap<String, String>();
		student2Details.put("Name","Jane Smith");
		student2Details.put("Age","Twenty One");
		student2Details.put("Gender","Female");
		student2Details.put("Roll Number","SBA12346");
		student2Details.put("Grade","B+");
		student2Details.put("Major","Mathematics");
		student2Details.put("GPA","A3.5");
		student2Details.put("Email","jane@example.com");
		student2Details.put("PAN Number","REW6543211");
		student2Details.put("Address","456 Oak St");
		
		//Student3 details
		Map<String,String> student3Details = new HashMap<String, String>();
		student3Details.put("Name","Mike Brown");
		student3Details.put("Age","Twenty Two");
		student3Details.put("Gender","Male");
		student3Details.put("Roll Number","SBA12347");
		student3Details.put("Grade","A+");
		student3Details.put("Major","Physics");
		student3Details.put("GPA","A3.9");
		student3Details.put("Email","jmike@example.com");
		student3Details.put("PAN Number","TYR6543212");
		student3Details.put("Address","789 Pine St");
		
		//Create List<Map<String, String>> for entire Student table
		List<Map<String,String>> studentTable = new ArrayList<Map<String,String>>();
		studentTable.add(student1Details);
		studentTable.add(student2Details);
		studentTable.add(student3Details);
		System.out.println("Student Table "+ studentTable);

		//Employee1 details
		Map<String,String> employee1Details = new HashMap<String, String>();
		employee1Details.put("Employee ID","E001");
		employee1Details.put("Name","Alice Green");
		employee1Details.put("Age","Thirty");
		employee1Details.put("Gender","Female");
		employee1Details.put("Department","Engineering");
		employee1Details.put("Position","Software Engineer");
		employee1Details.put("Salary","75K Pounds");
		employee1Details.put("Email","alice@example.com");
		employee1Details.put("PAN Number","SDF6543210");

		//Employee2 details
		Map<String,String> employee2Details = new HashMap<String, String>();
		employee2Details.put("Employee ID","E002");
		employee2Details.put("Name","Bob Johnson");
		employee2Details.put("Age","Thirty Five");
		employee2Details.put("Gender","Male");
		employee2Details.put("Department","Marketing");
		employee2Details.put("Position","Marketing Manager");
		employee2Details.put("Salary","85K Pounds");
		employee2Details.put("Email","bob@example.com");
		employee2Details.put("PAN Number","REW6543211");
		
		//Employee3 details
		Map<String,String> employee3Details = new HashMap<String, String>();
		employee3Details.put("Employee ID","E003");
		employee3Details.put("Name","Carol White");
		employee3Details.put("Age","Twenty Eight");
		employee3Details.put("Gender","Female");
		employee3Details.put("Department","Sales");
		employee3Details.put("Position","Sales Executive");
		employee3Details.put("Salary","65K Pounds");
		employee3Details.put("Email","carol@example.com");
		employee3Details.put("PAN Number","TYR6543212");
		
		//Create List<Map<String, String>> for entire Employee table
		List<Map<String,String>> employeeTable = new ArrayList<Map<String,String>>();
		employeeTable.add(employee1Details);
		employeeTable.add(employee2Details);
		employeeTable.add(employee3Details);
		System.out.println("Employee Table : "+ employeeTable);
		
		//Product1 details
		Map<String,String> product1Details = new HashMap<String, String>();
		product1Details.put("Product ID","P001");
		product1Details.put("Name","Laptop");
		product1Details.put("Category","Electronics");
		product1Details.put("Price","12K Pounds");
		product1Details.put("Stock Quantity","Not Available");
		product1Details.put("Supplier","Tech Supplies");
		product1Details.put("Warranty","2 years");
		product1Details.put("Rating","4.5 Stars");
		product1Details.put("Manufacturing Date","Aug 2023");
		product1Details.put("Expiry Date","Aug 2028");
		
		//Product2 details
		Map<String,String> product2Details = new HashMap<String, String>();
		product2Details.put("Product ID","P002");
		product2Details.put("Name","Desk Chair");
		product2Details.put("Category","Furniture");
		product2Details.put("Price","150K Pounds");
		product2Details.put("Stock Quantity","Two");
		product2Details.put("Supplier","Office Depot");
		product2Details.put("Warranty","1 year");
		product2Details.put("Rating","4 Stars");
		product2Details.put("Manufacturing Date","Sep 2024");
		product2Details.put("Expiry Date","N/A");
		
		
		//Product3 details
		Map<String,String> product3Details = new HashMap<String, String>();
		product3Details.put("Product ID","P003");
		product3Details.put("Name","Coffee Maker");
		product3Details.put("Category","Kitchen");
		product3Details.put("Price","75 Pounds");
		product3Details.put("Stock Quantity","Two Hundred");
		product3Details.put("Supplier","KitchenWorld");
		product3Details.put("Warranty","6 months");
		product3Details.put("Rating","4.2 Stars");
		product3Details.put("Manufacturing Date","Jan 2025");
		product3Details.put("Expiry Date","Jan 2027");
				
		//Create List<Map<String, String>> for entire Product table
		List<Map<String,String>> productTable = new ArrayList<Map<String, String>>();
		productTable.add(product1Details);
		productTable.add(product2Details);
		productTable.add(product3Details);
		System.out.println("Product Table : "+productTable);
		
		// Create Map<String, List<Map<String, String>>> to store all 3 tables together
		
		Map<String,List<Map<String,String>>> allTables = new HashMap<String,List<Map<String,String>>>();
		allTables.put("StudentDetails",studentTable);
		allTables.put("employeeDetails", employeeTable);
		allTables.put("ProductDetails", productTable);
		System.out.println("Data from all 3 tables -----" + allTables);
		System.out.println("*********************************************************************************");
		System.out.println("All the 3 rows from Product table ------ allTables.get(\"ProductDetails\" -------"+allTables.get("ProductDetails"));
		System.out.println("Entire second row in Product table ------ allTables.get(\"ProductDetails\").get(1) -------"+allTables.get("ProductDetails").get(1));
		System.out.println("Supplier name of second row of product table--- (allTables.get(\"ProductDetails\").get(1).get(\"Supplier\") ------" + allTables.get("ProductDetails").get(1).get("Supplier"));
		System.out.println("**********************************************************************************");
		System.out.println(" Supplier name of second row of product details is " + allTables.get("ProductDetails").get(1).get("Supplier"));
		
	}

}
