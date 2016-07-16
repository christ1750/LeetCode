/** 
 * author: christ 
 * data��2016��7��15�� ����11:20:45 
 * ��ɫ����
 * ע�⽻��ֵ��˳��
 * ��Ҫʹ������ָ�룬���һ���ұ�һ�����ֱ𱣴�0ֵ��2ֵ��1ֱֵ�����
 */
public class sort_colors {
	public void sortColors(int[] A){
		int n = A.length;
		int temp = 0;
		int left = -1;
		int right = n;
		int i = 0;
		while(i < right){
			if(A[i] == 0){
				++left;
				temp = A[i];
				A[i] = A[left];
				A[left] = temp;
				i++;
			}else if(A[i] == 2){
				right--;
				temp = A[right];
				A[right] = A[i];
				A[i] = temp;
			}else{
				i++;
			}			
		}		
	}
	public static void main(String[] args){
		sort_colors sc = new sort_colors();
		int[] A = {1,0,2,1,2,0};
		sc.sortColors(A);
		for(int i = 0; i < A.length; i++){
			System.out.println(A[i]);
		}
	}
}
