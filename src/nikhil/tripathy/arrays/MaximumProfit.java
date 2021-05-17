package nikhil.tripathy.arrays;

//https://leetcode.com/problems/best-time-to-buy-and-sell-stock/

public class MaximumProfit {
	public static void main(String... args) {
		
		int arr[] = {7,1,5,3,6,4};
		System.out.println(maxProfit(arr));
	}

// This will not work, Time limit exceeds.	
//	public static int maxProfit(int prices[]) {
//		int profit = 0, local =0;
//		for (int i=0;i<prices.length-1;i++) {
//			for (int j=i+1;j<prices.length;j++) {
//				local = prices[j]-prices[i];
//				if (local > profit)
//					profit = local;
//			}
//		}
//		return profit;
//	}
	
	public static int maxProfit(int prices[]) {
		int profit = 0, minPrice = Integer.MAX_VALUE;
		for (int i=0;i<prices.length;i++) {
			if (prices[i] < minPrice) {
				minPrice = prices[i];
			}
			else if(prices[i] - minPrice > profit)
				profit = prices[i] - minPrice;
		}
		return profit;
	}
}
