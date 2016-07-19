/** 
 * author: christ 
 * data：2016年7月18日 下午7:30:18 
 * 先按照主对角线对称，然后按照左右对称，两次对称之后完成90°旋转
 */
public class rotation_image {
	public void rotate(int[][] matrix){
		int m = matrix[0].length;
		int n = matrix.length;
		for(int i = 0; i < n; i++){
			for(int j = 0; j < i; j++){
				int temp = 0;
				temp = matrix[i][j];
				matrix[i][j] = matrix[j][i];
				matrix[j][i] = temp;
			}
		}
		for(int i = 0; i < n; i++){
			for(int j = 0; j < m/2; j++){
				int temp = 0;
				temp = matrix[i][j];
				matrix[i][j] = matrix[i][m-j-1];
				matrix[i][m-j-1] = temp;
			}
		}
	}
	public static void main(String[] args){
		rotation_image ri = new rotation_image();
		int[][] matrix = {{1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,15},{16,17,18,19,20},{21,22,23,24,25}};
		for(int i = 0; i < matrix.length; i++){
			for(int j = 0; j < matrix[0].length; j++){
				System.out.print(matrix[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println();
		ri.rotate(matrix);
		for(int i = 0; i < matrix.length; i++){
			for(int j = 0; j < matrix[0].length; j++){
				System.out.print(matrix[i][j]+" ");
			}
			System.out.println();
		}
	}
}
