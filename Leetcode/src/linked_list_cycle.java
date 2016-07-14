/** 
 * author: christ 
 * data：2016年7月14日 下午9:00:50 
 * 判断链表是否有环，其中判断链表头是非常重要的，要注意顺序，还有是快指针的下一节点下下一节点是否存在
 * 另外判断两个加点是否是同一个节点可以直接判断，不能只判断值
 */
public class linked_list_cycle {
	public boolean hasCycle(ListNode head){
		if(head == null){
			return false;
		}
		ListNode slow = head;
		ListNode fast = head;
		while(fast.next != null&&fast.next.next != null){
			slow = slow.next;
			fast = fast.next.next;
			if(slow == fast){
				return true;
			}
		}
		return false;
	}

}
