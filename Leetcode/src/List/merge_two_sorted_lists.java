package List;
/** 
 * author: christ 
 * data��2016��7��19�� ����10:29:56 
 * ��˵�� 
 */
public class merge_two_sorted_lists {
	public ListNode mergeTwoLists(ListNode l1, ListNode l2){
		ListNode res = null;
		if(l1 == null && l2 == null){
			return null;
		}
		if(l1 == null){
			res = l2;
			return res;
		}
		if(l2 == null){
			res = l1;
			return l1;
		}
		
		while(l1 != null && l2 != null){
			if(l1.val < l2.val){
				res.val = l1.val;
				res = res.next;
				l1 = l1.next;
			}else{
				res.val = l2.val;
				res = res.next;
				l2 = l2.next;
			}
		}
		while(l1 != null){
			res.val = l1.val;
			res = res.next;
			l1 = l1.next;
		}
		while(l2 != null){
			res.val = l2.val;
			res = res.next;
			l2 = l2.next;
		}
		return res;
	}
}
