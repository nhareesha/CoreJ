/**
 * 
 */
package prep.core.jconcepts.ds.linkedlists;

import java.util.HashSet;

/**
 * @author Hareesha
 * Jun 29, 2017
 */
public class LinkedListC {

	/**
	 * LinkedList , only head is given
	 */
	
	ListNode head = null;
	
	/**
	 * Add to the end of the list
	 * @param d
	 */
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
	/**
	 * Delete
	 * @param d
	 * @return
	 */
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
	
	/**
	 * Display elements of linked list
	 */
	void display(){
		if(head==null){
			return;
		}
		ListNode n = head;
		while(n!=null){
			System.out.print("->"+n.data);
			n = n.next;
		}
		System.out.println();
	}
	/**
	 * remove kth node from last in a singly linked lit
	 * @param k
	 * @return
	 */
	Integer findkthNodeFromLast(int k){
		
		if(head==null){
			return null;
		}
		
		ListNode p1 = head;
		ListNode p2 = head;
		
		for(int i=0;i<k;i++){
			if(p1==null){
				return null;
			}
			p1 = p1.next;
			
		}
		
		while(p1!=null){
			p1=p1.next;
			p2 = p2.next;
		}
		System.out.println(p2.data);
		
		return new Integer(p2.data);
	}
	
	/**
	 * Remove duplicates from a singly linked list
	 * 
	 * only head node is given
	 * 
	 * To acomplish this we can use HashSet
	 * 
	 * we try to add to data to set and see every time next node data is there in set, if there wedelete that next node
	 * @param args
	 */
	public void removeDuplicated(){
		ListNode n = head;
		if(n==null || n.next==null){
			return;
		}
		HashSet<Integer> set= new HashSet<>();
		while(n!=null && n.next!=null){
			set.add(n.data);
			if(set.contains(n.next.data)){
				n.next= n.next.next;
			}
			n = n.next;
		}
		
	}
	public static void main(String[] args) {
		LinkedListC ll= new LinkedListC();
		ll.addToEnd(1);
		ll.addToEnd(2);
		ll.addToEnd(3);
		ll.addToEnd(3);
		ll.addToEnd(41);
		ll.addToEnd(3);
		ll.addToEnd(43);
		ll.addToEnd(43);
	//	ll.display();
	//	ll.delete(3);
		//ll.delete(1);
		ll.display();
		ll.findkthNodeFromLast(3);
		
		ll.removeDuplicated();
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
