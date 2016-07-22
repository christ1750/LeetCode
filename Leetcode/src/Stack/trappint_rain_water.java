package Stack;
/** 
 * author: christ 
 * data：2016年7月21日 下午5:29:57 
 * 通过使用两个指针，分别从左往右走，和从右往左走，而每一个格子存储水的总量由两边格子高度的最小值决定
 * 全局的储水量也是最大值减去当前格子的高度
 */
public class  trappint_rain_water{
	public int trap(int[] A){
		if(A == null || A.length < 3){
			return 0;
		}
		int res = 0;
		int left = 1;
		int right = A.length-2;
		int leftMax = A[0];
		int rightMax = A[A.length-1];
		while(left <= right){
			if(leftMax < rightMax){
				res += Math.max(0, leftMax-A[left]);//更新全局的存水量
				leftMax = Math.max(leftMax, A[left++]); //更新左边的最大值
			}else{
				res +=Math.max(0, rightMax-A[right]);//更新全局的存水量
				rightMax = Math.max(rightMax, A[right--]);//更新右边的最大值
			}
		}
		return res;
	}
}
