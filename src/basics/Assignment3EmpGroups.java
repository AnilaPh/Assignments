package basics;

public class Assignment3EmpGroups {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int [] numbers = new int [] {1, 2, 3, 4, 5};
		int [] id = new int[3];
		String [] name= new String[3];
		Assignment3Employees obj =new Assignment3Employees();
		id[0]=obj.employeeId[0];
		name[0]=obj.employeeName[0];
		System.out.println("Employee1 id : "+id[0] );
		System.out.println("Employee1 name : "+name[0] );
		
		id[1]=obj.employeeId[1];
		name[1]=obj.employeeName[1];
		System.out.println("Employee1 id : "+id[1] );
		System.out.println("Employee1 name : "+name[1] );	
		
		id[2]=obj.employeeId[2];
		name[2]=obj.employeeName[2];
		System.out.println("Employee1 id : "+id[2] );
		System.out.println("Employee1 name : "+name[2] );		
			
			
	}

}
