/** 
 * author: christ 
 * data：2016年8月7日 下午6:56:01 
 * 类说明 
 */
public class set_matrix_zeroes {
	public void setZeroes(int[][] matrix){
		if(matrix == null || matrix.length == 0){
			return;
		}
		int m = matrix.length;
		int n = matrix[0].length;
		boolean rowZero = false;
		boolean colZero = false;				
		for(int i = 0; i < m; i++){
			if(matrix[i][0] == 0){
				colZero = true;
				break;
			}
		}
		for(int i = 0; i < n; i++){
			if(matrix[0][i] == 0){
				rowZero = true;
				break;
			}
		}
		for(int i = 1; i < m; i++){
			for(int j = 1; j < n; j++){
				if(matrix[i][j] == 0){
					matrix[0][j] = 0;
					matrix[i][0] = 0;
				}
			}
		}
		for(int i = 1; i < m; i++){
			for(int j = 1; j < n; j++){
				if(matrix[0][j] == 0 || matrix[i][0] == 0){
					matrix[i][j] = 0;
				}
			}
		}
		if(rowZero){
			for(int i = 0; i < n; i++){
				matrix[0][i] = 0;
			}
		}
		if(colZero){
			for(int i = 0; i < m; i++){
				matrix[i][0] = 0;
			}
		}
	}
}
