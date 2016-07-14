/** 
 * author: christ 
 * data��2016��7��14�� ����9:19:35 
 * ���������
 * ���ȼ���A[i]���жϺ�֮ǰ��˭�������ʱ��ֵΪ���ģ���ôǰ��ľ�ȫ������Ҫ��
 * �������ڲ�����Ҫ�ж�A[i]�Ƿ���������ֻҪsumΪ��������ô����0
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
