/**
 * 
 */
package prep.core.jconcepts.ds.linkedlists;

/**
 * @author Hareesha
 * Jun 29, 2017
 */
public class LinkedListC {

	/**
	 * LinkedList , only head is given
	 */
	
	ListNode head = null;
	void addToEnd(int d){
		ListNode end = new ListNode(d);
	
		if(head==null){
			head = end;
			return;
		}
		ListNode n = head;
		while(n.next!=null){
			n = n.next;
		}
		n.next = end;
	}
	
	ListNode delete(int d){
		if(head==null){
			return null;
		}
		
		ListNode n = head;
		if(n.data==d){
			head = n.next;
			return head;
		}
		while(n.next!=null){
			if(n.next.data==d){
				n.next = n.next.next;
			}
			n = n.next;
		}
		return head;
	}
	
	void display(){
		if(head==null){
			return;
		}
		ListNode n = head;
		while(n!=null){
			System.out.print("->"+n.data);
			n = n.next;
		}
	}
	public static void main(String[] args) {
		LinkedListC ll= new LinkedListC();
		ll.addToEnd(1);
		ll.addToEnd(2);
		ll.addToEnd(3);
		ll.addToEnd(4);
		ll.display();
		ll.delete(3);
		ll.delete(1);
		ll.display();
	}

}
class ListNode{
	ListNode next = null;
	int data;
	ListNode(int d){
		this.data = d;
	}
}
