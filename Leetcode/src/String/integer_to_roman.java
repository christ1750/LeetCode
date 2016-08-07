package String;
/** 
 * author: christ 
 * data：2016年8月7日 下午6:14:34 
 * 类说明 
 */
public class integer_to_roman {
	public String intToRoman(int num){
		int[] value = {1000,900,500,400,100,90,50,40,10,9,5,4,1};
		String[] numerals = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
		StringBuffer sb = new StringBuffer();
		for(int i = 0; i < value.length; i++){
			while(num >= value[i]){
				num -= value[i];
				sb.append(numerals[i]);
			}
		}
		return sb.toString();
	}
}
