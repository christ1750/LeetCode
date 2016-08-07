/** 
 * author: christ 
 * data��2016��8��5�� ����4:12:05 
 * ��˵�� 
 */
public class Permutation {
	public String getPermutation(int n, int k){		
		//n�Ľ׳�
		int fac = 1;
		for(int i = 0; i < n-1; i++){
			fac = fac*(i+1);
		}
		//��ʼ����
		StringBuffer sb = new StringBuffer();
		for(int i = 0; i < n; i++){
			sb.append(Integer.toString(i+1));
		}
		//������ɵ�����
		StringBuffer s = new StringBuffer();
		
		int now = n-1;
		while(now > 0){
			int index = 0;
			if(k%fac == 0){
				index = k/fac-1;
			}else{
				index = k/fac;
			}
			s.append(sb.charAt(index));
			sb.deleteCharAt(index);
			k = k-index*fac;			
			fac = fac/now;			
			now--;
		}
		s.append(sb.charAt(k-1));
		return s.toString();
	}			
	public static void main(String[] args){
		Permutation pt = new Permutation();
		System.out.println(pt.getPermutation(3,3));
	}
}
