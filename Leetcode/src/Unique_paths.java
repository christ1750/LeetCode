/** 
 * author: christ 
 * data��2016��7��15�� ����11:05:54 
 * ��˵�� 
 */
public class Unique_paths {
	public int uniquePaths(int m, int n){
		int[][] res = new int[m][n];
		for(int i = 0; i < m; i++){
			res[i][0] = 1;
		}
		for(int i = 0; i < n; i++){
			res[0][i] = 1;
		}
		for(int i = 1; i < m; i++){
			for(int j = 1; j < n; j++){
				res[i][j] = res[i-1][j]+res[i][j-1];
			}
		}
		return res[m-1][n-1];
	}
	public static void main(String[] args){
		Unique_paths up = new Unique_paths();
		int a = up.uniquePaths(3, 7);
		System.out.println(a);
	}
}
