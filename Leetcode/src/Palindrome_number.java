/** 
 * author: christ 
 * data��2016��7��14�� ����8:18:23 
 * �ж��ǲ��ǻ��Ĵ�
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
