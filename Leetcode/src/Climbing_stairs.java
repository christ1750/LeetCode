/** 
 * author: christ 
 * data：2016年7月15日 上午9:03:10 
 * 上台阶问题
 * 递归或者循环
 * 循环的时候要注意保存数组是从下标0到n的数组，所以数组长度为n+1
 */
public class Climbing_stairs {
	public int climbStairs(int n){
		if(n == 1 || n == 0){
			return 1;
		}
		else{
			return climbStairs(n-1)+climbStairs(n-2);
		}
	}
	public int climbStairs1(int n){
		if(n == 0 || n == 1){
			return 1;
		}
		int[] res = new int[n+1];
		res[0] = 1;
		res[1] = 1;
		for(int i = 2; i <= n; i++){
			res[i] = res[i-1]+res[i-2];
		}
		
		return res[n];
	}
	public static void main(String[] args){
		Climbing_stairs cs = new Climbing_stairs();
		int res = cs.climbStairs(3);
		System.out.println(res);
	}

}
