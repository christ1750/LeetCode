/** 
 * author: christ 
 * data��2016��7��14�� ����9:00:50 
 * �ж������Ƿ��л��������ж�����ͷ�Ƿǳ���Ҫ�ģ�Ҫע��˳�򣬻����ǿ�ָ�����һ�ڵ�����һ�ڵ��Ƿ����
 * �����ж������ӵ��Ƿ���ͬһ���ڵ����ֱ���жϣ�����ֻ�ж�ֵ
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
