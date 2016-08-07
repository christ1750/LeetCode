/** 
 * author: christ 
 * data：2016年8月7日 下午3:02:13 
 * 类说明 
 */
public class NextPermutation {
	public void nextPermutation(int[] num){
		if(num==null || num.length <= 1){
			return;
		}
		int pos = -1;
		for(int i = num.length-1; i > 0; i--){
			if(num[i-1] < num[i]){
				pos = i-1;
				break;
			}
		}
		if(pos == -1){
			reverse(num,0,num.length-1);
			return;
		}
		for(int i = num.length-1; i > pos; i--){
			if(num[i]>num[pos]){
				int tmp = num[pos];
				num[pos] = num[i];
				num[i] = tmp;
				break;
			}
		}
		reverse(num,pos+1,num.length-1);
	}
	public void reverse(int[] num, int start, int end){
		int head = start;
		int tail = end;
		while(head < tail){
			int tmp = num[head];
			num[head] = num[tail];
			num[tail] = tmp;
			head++;
			tail--;
		}
	}
}
