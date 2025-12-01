package basics;

public class Assignment07ConditionalStatements {
	public static void main(String[] args) {
		
		String customerName = "John Doe";
		int creditScore = 720;
		double income = 55000.0;
		boolean isEmployed = true;
		double debtToIncomeRatio = 35.0;
		
		if (creditScore > 750) {
			System.out.println("Loan is Approved");
			//If the credit score is above 750, the loan is automatically approved.
		} else if (creditScore > 650) {
			//If the credit score is between 650 and 750, check income >50000
			if (income >= 50000) {
				if (isEmployed)
					if (debtToIncomeRatio < 40 )
						//Debt-to-Income Ratio:
					  System.out.println("Loan is Approved");
					else
						System.out.println("Not eligible for loan. Debt-to-Income Ratio not less than 40%");
					
				else
					System.out.println("Not eligible for loan. Not employed");					
			}
			else
				System.out.println("Not eligible for loan. Income less than 50000");
								
		}
		else
			System.out.println("Not eligible for loan. Credit Score below 650");
			
		
	}

}
