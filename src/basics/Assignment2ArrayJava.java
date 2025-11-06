package basics;

public class Assignment2ArrayJava {

	public static void main(String[] args) {
		
		String[][][] details = {
				{//Sem1
					{"Mathematics I", "Physics", "Chemistry", "Computer Programming", "Engineering Drawing", "Basic Electrical Eng."},
					{"Pass(78)", "Pass(85)", "Fail(21)", "Pass(74)", "Pass(88)", "Pass(79)"}
				},
				{//Sem2
					{"Mathematics II", "Mechanics", "Environmental Sci.", "Basic Electronics", "Engineering Physics", "Engineering Graphics"},	
					{"Pass(82)", "Pass(77)", "Pass(93)", "Fail(19)", "Fail(24)", "Pass(90)"}
				},
				
				 { // Semester 3
                    {"Data Structures", "Discrete Mathematics", "Digital Electronics", "Operating Systems", "Signals and Systems", "Object-Oriented Prog."},
                    {"Pass(88)", "Pass(81)", "Pass(76)", "Fail(32)", "Pass(85)", "Pass(78)"}
				 }
					
		};
		//Print Semester 2 Subject 4 and Subject 5 names.
		System.out.println("Print Semester 2 Subject 4  names."+ details[1][0][3]);
		System.out.println("Print Semester 2  Subject 5 names."+ details[1][0][4]);
		
		//Print the Status/Marks of Semester 3 Subject 3 and Subject 6.
		System.out.println("Marks of Semester 3 Subject 3  "+ details[2][1][2]);
		System.out.println("Marks of Semester 3  Subject 6."+ details[2][1][5]);
	}

}
