import java.util.ArrayList;

/** 
 * author: christ 
 * data：2016年7月18日 下午8:03:37 
 * 类说明 
 */
public class gray_code {
	public ArrayList<Integer> grayCode(int n){
		ArrayList<Integer> res = new ArrayList<>();
		int num = 1 << n;		
		for(int i = 0; i != num; i++){
			System.out.println(i);
			System.out.println(1^i);
			System.out.println(i >> 1^i);
			System.out.println();
			res.add(i >> 1^i);
		}
		return res;
	}
	public static void main(String[] args){
		gray_code gc = new gray_code();
		gc.grayCode(2);
	}
}
