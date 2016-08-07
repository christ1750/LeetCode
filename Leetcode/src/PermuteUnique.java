import java.util.ArrayList;

/** 
 * author: christ 
 * data：2016年8月7日 下午3:55:07 
 * 类说明 
 */
public class PermuteUnique {
	public ArrayList<ArrayList<Integer>> permuteUnique(int[] num){
		ArrayList<ArrayList<Integer>>res = new ArrayList<>();
		if(num == null || num.length == 0){
			return res;
		}
		perm(num,0,res);
		return res;
	}
	public void perm(int[] num, int index, ArrayList<ArrayList<Integer>> array){
		if(index == num.length-1){
			ArrayList<Integer> list = new ArrayList<>();
			for(int i = 0; i < num.length; i++){
				list.add(num[i]);
			}
			array.add(list);
			return;
		} 
		for(int i = index; i < num.length; i++){
			if(is_swap(num,i,index) == true){
				swap(num,index,i);
				perm(num,index+1,array);
				swap(num,index,i);
			}
		}
	}
	public boolean is_swap(int[] num, int i, int index){
		for(int k = index; k < i; k++){
			if(num[k] == num[i]){
				return false;
			}
		}
		return true;
	}
	public void swap(int[] num, int i, int j){
		int temp = num[i];
		num[i] = num[j];
		num[j] = temp;
	}
}
