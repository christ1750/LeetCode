/** 
 * author: christ 
 * data：2016年7月18日 下午9:18:23 
 * 数组加1，要考虑的情况比较多，进位比较麻烦，要把第一位和最后一位单拿出来计算，没有进位的数要注意清0
 */
public class plus_one {
	public int[] plusOne(int[] digits){
		int n = digits.length;
		if(n == 0){
			return null;
		}else if(n == 1){
			if(digits[0]+1 == 10){
				int[] res = {1,0};
				return res;
			}else{
				int[] res = new int[1];
				res[0] = digits[0]+1;
				return res;
			}
		}else{
			int carry = 0;
			boolean flag = false;
			if(digits[n-1]+1 == 10){
				digits[n-1] = 0;
				carry = 1;						
			}else{
				digits[n-1] = digits[n-1]+1;
			}
			for(int i = n-2; i > 0; i--){
				if(digits[i]+carry == 10){
					digits[i] = 0;
					carry = 1;
				}else{
					digits[i] = digits[i]+carry;
					carry = 0;
				}
			}
			if(digits[0] + carry == 10){
				digits[0] = 0;
				flag = true;
				System.out.println(true);
			}else{
				digits[0] = digits[0]+carry;
				System.out.println(false);
			}
			if(flag){
				int[] res = new int[n+1];
				res[0] = 1;
				for(int i = 0; i < n; i++){
					res[i+1] = digits[i];
					System.out.println(res[i]);
				}
				return res;
			}else{
				int[] res = new int[n];
				for(int i = 0; i < n; i++){
					res[i] = digits[i];
				}
				return res;
			}
		}
		
	}
	public int[] plusOne1(int[] digits){
		String s = digits.toString();
		int i = Integer.parseInt(s);
		i = i+1;
		String ss = Integer.toString(i);
		char[] r = ss.toCharArray();
		int[] res = new int[r.length];
		for(int j = 0; j < r.length; j++){
			res[j] = r[j];
		}
		return res;
	}
	public static void main(String[] args){
		plus_one po = new plus_one();
		int[] digits = {2,4,9,3,9};
		int[] res = po.plusOne(digits);
		for(int i = 0; i < res.length; i++){
			System.out.println(res[i]);
		}
	}
}
