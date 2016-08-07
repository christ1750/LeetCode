package Array;
/** 
 * author: christ 
 * data��2016��7��14�� ����10:07:40 
 * ��˵�� 
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
