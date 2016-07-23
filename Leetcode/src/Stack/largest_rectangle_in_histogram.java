package Stack;

import java.util.Stack;

/** 
 * author: christ 
 * data：2016年7月22日 下午7:50:26 
 * 类说明 
 */
public class largest_rectangle_in_histogram {
	public int largestRectangleArea(int[] height){
		Stack<Integer> S = new Stack<>();
		int[] h = new int[height.length+1];
		for(int i = 0; i < height.length; i++){
			h[i] = height[i];
		}
		h[height.length] = 0;
		int res = 0;
		for(int i = 0; i < h.length; i++){
			if(S.isEmpty() || h[i] > h[S.peek()]){
				S.push(i);
			}else{
				int temp = S.peek();
				S.pop();
				res = Math.max(res, h[temp]*(S.isEmpty()?i:i-S.peek()-1));
				i--;
			}
		}
		return res;
	}
	
}
