/** 
 * author: christ 
 * data��2016��7��14�� ����6:57:41 
 * ��������
 * -123��-321
 * 100��1
 * ��һ���ǵ��õİ�
 * �ڶ����ǰ��ճ������������
 */
public class Reverse_integer {
	public int reverse(int x){
		int res = 0;
		boolean flag = false;
		if(x < 0){
			x = -x;
			flag = true;
		}
		String a = Integer.toString(x);		
		StringBuffer sb = new StringBuffer(a);
		sb.reverse();
		res = Integer.parseInt(sb.toString());
		if(flag){
			res = -res;
		}
		return res;		
	}
	public int reverse_1(int x){
		int res = 0;
		boolean flag = false;
		if(x < 0){
			flag = true;
			x = -1;
		}
		while(x != 0){
			res += x%10;
			res = res*10;
			x = x/10;
		}
		res = res/10;
		if(flag){
			res = -res;
		}
		return res;
	}
	public static void main(String[] args){
		Reverse_integer ri = new Reverse_integer();
		int res = ri.reverse(-100);
		System.out.println(res);
	}
}
