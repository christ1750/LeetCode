package Tree;

import java.util.ArrayList;

/** 
 * author: christ 
 * data��2016��7��19�� ����9:45:18 
 * ���������������ס�洢�ռ�listҪ��ȫ�ֵ�
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
