package Tree;

import java.util.ArrayList;

/** 
 * author: christ 
 * data：2016年7月19日 上午9:45:18 
 * 就是中序遍历，记住存储空间list要用全局的
 */
public class binary_tree_inorder_traversal {
	ArrayList<Integer> list = new ArrayList<>();
	public ArrayList<Integer> inorderTraversal(TreeNode root){
		if(root == null){
			return list;
		}
		inorder(root);
		return list;
	}
	private void inorder(TreeNode root){
		if(root == null){
			return;
		}
		inorderTraversal(root.left);
		list.add(root.val);
		inorderTraversal(root.right);
	}
}
