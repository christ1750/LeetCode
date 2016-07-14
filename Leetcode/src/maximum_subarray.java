/** 
 * author: christ 
 * data：2016年7月14日 下午9:19:35 
 * 最大子数组
 * 首先加上A[i]，判断和之前比谁大，如果此时的值为负的，那么前面的就全部都不要了
 * 误区在于并不需要判断A[i]是否是正负，只要sum为负数，那么就清0
 */
public class maximum_subarray {
	public int maxSubArray(int[] A){
		int sum = 0;
		int max = Integer.MIN_VALUE;
		for(int i = 0; i < A.length; i++){
			sum = sum+A[i];
			max = Math.max(max,sum);
			if(sum < 0){
				sum = 0;
			}
		}
		return max;
	}
}
