package Tree;

/** 
 * author: christ 
 * data��2016��7��14�� ����6:50:38 
 * ��˵�� 
 * ������������
 */
public class Maximum_depth_of_binary_tree {
	public int maxDepth(TreeNode root){
		int res = 0;
		if(root == null){
			res = 0;
		}
		else{
			res = Math.max(maxDepth(root.left), maxDepth(root.right))+1;
		}
		return res;
	}

}
