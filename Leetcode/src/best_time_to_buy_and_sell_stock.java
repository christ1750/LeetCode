/** 
 * author: christ 
 * data��2016��7��15�� ����9:41:53 
 * ������ֳ����Σ�left��right������������С�ģ����ҵ����Ҵ�ģ�Ȼ������
 * left����洢���ǵ�ǰ�������ܻ�õ���Сֵ��right�����Ҵ��ҵ���ǰ����
 * ���ֵ��ԭ����������С�ģ��ұ��Ҵ��
 */
public class best_time_to_buy_and_sell_stock {
	public int maxProfit(int[] prices){
		if(prices.length <= 1){
			return 0;
		}
		int n = prices.length;
		int[] left = new int[n];
		int[] right = new int[n];
		int leftMin = prices[0];
		int rightMax = prices[n-1];
		int sum = 0;
		for(int i = 1; i < n; i++){
			leftMin = Math.min(leftMin, prices[i]);
			left[i] = Math.min(prices[i]-leftMin, left[i-1]);
		}
		for(int i = n-2; i >= 0; i--){
			rightMax = Math.max(prices[i], rightMax);
			right[i] = Math.max(rightMax-prices[i], right[i+1]);
		}
		for(int i = 0; i < n; i++){
			if(sum < left[i]+right[i]){
				sum = left[i]+right[i];
			}
		}
		return sum;
	}
	public static void main(String[] args){
		best_time_to_buy_and_sell_stock bb = new best_time_to_buy_and_sell_stock();
		int[] prices = {2,1,2,0,1};		
		int a = bb.maxProfit(prices);
		System.out.println(a);
	}
}
