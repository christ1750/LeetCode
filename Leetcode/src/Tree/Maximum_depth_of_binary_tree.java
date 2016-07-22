package Tree;

/** 
 * author: christ 
 * data：2016年7月14日 下午6:50:38 
 * 类说明 
 * 求树的最大深度
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
