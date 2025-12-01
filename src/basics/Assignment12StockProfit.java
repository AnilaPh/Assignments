package basics;

public class Assignment12StockProfit {

	public static void main(String[] args) {
		// Stock Profit
		//int[] prices = {7,1,5,3,6,4};
		//int[] prices = {7,6,4,3,1};
		int[] prices = {7,6,4,9,1};
		int sellDay = 0;
		int buyDay = 0;
		int currentProfit =0;
		int profit = 0;
		
		for(int i = 0 ; i < prices.length; i++) {
			for(int j = i + 1 ; j < prices.length ; j++) {
				currentProfit = prices[j]-prices[i];
				if(currentProfit > profit ) {
					//highPrice = prices[j];
					profit = currentProfit;
					buyDay = i + 1 ;
					sellDay = j + 1;
				}
					
			}
		}
		
		if (profit > 0) {
			System.out.println("Profit is " + profit);
			System.out.println("Buy on day " + buyDay);
			System.out.println("Sell on day " + sellDay);
		}
		else
			System.out.println("Please do not buy now. Wait for a better time to invest.");

	}

}
