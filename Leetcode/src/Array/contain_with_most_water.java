package Array;
/** 
 * author: christ 
 * data：2016年7月14日 下午10:07:40 
 * 类说明 
 */
public class contain_with_most_water {
	public int maxArea(int[] height){
		int max = 0;
		int i = 0;
		int j = height.length-1;
		while(i < j){						
			max = Math.max(max, (j-i)*(height[i]<height[j]?height[i++]:height[j--]));			
		}
		return max;
	}
}
