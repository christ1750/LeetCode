package Stack;
/** 
 * author: christ 
 * data��2016��7��21�� ����5:29:57 
 * ͨ��ʹ������ָ�룬�ֱ���������ߣ��ʹ��������ߣ���ÿһ�����Ӵ洢ˮ�����������߸��Ӹ߶ȵ���Сֵ����
 * ȫ�ֵĴ�ˮ��Ҳ�����ֵ��ȥ��ǰ���ӵĸ߶�
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
				res += Math.max(0, leftMax-A[left]);//����ȫ�ֵĴ�ˮ��
				leftMax = Math.max(leftMax, A[left++]); //������ߵ����ֵ
			}else{
				res +=Math.max(0, rightMax-A[right]);//����ȫ�ֵĴ�ˮ��
				rightMax = Math.max(rightMax, A[right--]);//�����ұߵ����ֵ
			}
		}
		return res;
	}
}
