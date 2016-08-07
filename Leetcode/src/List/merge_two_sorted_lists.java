package List;
/** 
 * author: christ 
 * data��2016��7��19�� ����10:29:56 
 * ��˵�� 
 */
public class merge_two_sorted_lists {
	public ListNode mergeTwoLists(ListNode l1, ListNode l2){
		if(l1 == null){
			return l2;
		}
		if(l2 == null){
			return l1;
		}
		ListNode res = new ListNode(0);
		ListNode head = res;
		while(l1 != null && l2 != null){
			if(l1.val < l2.val){
				head.next = l1;
				l1 = l1.next;
				head = head.next;
			}else{
				head.next = l2;
				l2 = l2.next;
				head = head.next;
			}
		}
		if(l1 != null){
			head.next = l1;
		}
		if(l2 != null){
			head.next = l2;
		}
		return res;
	}
}
