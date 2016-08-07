package Array;
/** 
 * author: christ 
 * data��2016��7��14�� ����8:30:28 
 * ��˵�� 
 */
public class Best_time_to_buy_and_sell_stock_ii {
	public int maxProfit(int[] prices){
		if(prices == null || prices.length == 0){
			return 0;
		}
		int profit = 0;
		for(int i = 0; i < prices.length-1; i++){
			if(prices[i] < prices[i+1]){
				profit +=prices[i+1]-prices[i];
			}
		}
		return profit;
	}
}
