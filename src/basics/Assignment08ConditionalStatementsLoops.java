package basics;

import java.util.ArrayList;
import java.util.List;

public class Assignment08ConditionalStatementsLoops {

	public static void main(String[] args) {
		List<Integer> transactionAmount = new ArrayList<Integer>();
		
		int creditCount = 0;
		int debitCount = 0;
		int totalCreditAmount = 0;
		int totalDebitAmount = 0;
		int suspicousCount = 0; 
		
		//Add transaction amount
		transactionAmount.add(50000);
		transactionAmount.add(-2000);
		transactionAmount.add(3000);
		transactionAmount.add(-15000);
		transactionAmount.add(-200);
		transactionAmount.add(-300);
		transactionAmount.add(4000);
		transactionAmount.add(-3000);
		
		//Print all the transaction amount
		System.out.println("All transaction amount : \n" + transactionAmount);
		
		//Check each transaction.
		
		for(int amount:transactionAmount) {
			
			if(amount >=  0) {	//check the amount is credit
				creditCount += 1;
				totalCreditAmount = totalCreditAmount + amount;
				if( amount > 10000) {
					System.out.println("Suspicious credit Transaction of "  + amount);
					suspicousCount +=1;
				}
					
			}else {//check the amount is debit 
				debitCount += 1;
				totalDebitAmount = totalDebitAmount + amount;
				if(( -1 * amount) > 10000) {
					System.out.println("Suspicious debit Transaction of " + amount);
					suspicousCount +=1;	
				
				}				
			}
			
		}
		
		//Print the details
		
		System.out.println("Total no of Credit transactions : " + creditCount );
		System.out.println("Total Credit amount : " + totalCreditAmount );
		System.out.println("Total no of Debit transactions : " + debitCount );
		System.out.println("Total Debit amount : " + totalDebitAmount );
		//debit amount is negative and credit amount is positive. So adding the amounts to get difference
		System.out.println("Amount in the account : " + (totalCreditAmount+totalDebitAmount));
		System.out.println("Suspicious debit Transaction : " + suspicousCount);
	}
}
