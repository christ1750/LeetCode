package Array;
/** 
 * author: christ 
 * data：2016年8月7日 下午7:34:13 
 * 类说明 
 */
public class merge_sorted_array {
	public void merge(int A[], int m, int B[], int n){		
		while(m > 0 && n > 0){
			if(A[m-1] > B[n-1]){
				A[m+n-1] = B[n-1];				
				n--;
			}else{
				A[m+n-1] = A[m-1];				
				m--;
			}
		}
		while(m > 0){
			A[m-1] = A[m-1];
			m--;
		}
		while(n > 0){
			A[n-1] = B[n-1];
			n--;
		}		
	}	
}
