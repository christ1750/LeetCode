/** 
 * author: christ 
 * data：2016年7月14日 下午8:18:23 
 * 判断是不是回文串
 */
public class Palindrome_number {
	public boolean isPalindrome(int x){
		char[] cc = Integer.toString(x).toCharArray();
		int i = 0;
		int j = cc.length-1;
		while(i <= j){
			if(cc[i] == cc[j]){
				i++;
				j--;
			}else{
				return false;
			}			
		}
		return true;
	}

}
