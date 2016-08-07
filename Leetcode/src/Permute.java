import java.util.ArrayList;

/** 
 * author: christ 
 * data：2016年8月7日 下午2:18:38 
 * 类说明 
 */
public class Permute {
	public ArrayList<ArrayList<Integer>> permute(int[] num){
		ArrayList<ArrayList<Integer>> res = new ArrayList<>();
		perm(num,new ArrayList<Integer>(),0,res);
		return res;	
	}
	void perm(int[] num, ArrayList<Integer> temp, int start, ArrayList<ArrayList<Integer>> res){
		for(int i = start; i < num.length; i++){
			temp.add(num[i]);
			if(temp.size() == num.length){
				res.add(new ArrayList<Integer>(temp));
				temp.remove(temp.size()-1);
				break;
			}
			int t = num[i];
			num[i] = num[start];
			num[start] = t;
			perm(num,temp,start+1,res);
			temp.remove(temp.size()-1);
			t = num[i];
			num[i] = num[start];
			num[start] = t;
		}
	}
	public static void main(String[] args){
		Permute pm = new Permute();
		int[] num = {1,2,1};
		ArrayList<ArrayList<Integer>> res = pm.permute(num);
		System.out.println(res);
	}
}
