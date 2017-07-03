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
				break;
			}
			n = n.next;
		}
		return head;
	}
	/**
	 * Retun head of linked list
	 */
	public ListNode getHead(){
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

		ListNode p = null;
		while(n!=null){
			
			if(set.contains(n.data)){
				p.next = n.next;
				n = n.next;
				
			}else{
				set.add(n.data);
				p=n;
				n= n.next;
			}
		}
		
	}
	/**
	 * Delete a given node from a linked list
	 * @param n
	 */
	public void deleteGivenNode(ListNode n){
		if(n==null){
			return;
		}
		
		ListNode nextNode = n.next;
		n.data = nextNode.data;
		n.next = nextNode.next;
		
	}
	
	/**using 2 pointers
	 * return Only even number in the linkedlist
	 * @param args
	 */
	public void findEvenNumber(){
		if(head==null){
			return;
		}
		//this is to delete the all the odd number nodes from the front of the list
		while(head.data%2!=0){
			head = head.next;
		}
		ListNode n = head;
		ListNode p1 = n;
		ListNode p2 = n.next;
		while(p2!=null){
			if(p2.data % 2 != 0){
				p1.next = p2.next;
				p2=p2.next;
			}else{
			p1=p1.next;
			p2=p2.next;
			}
	}	
}	
		/**
		 * Find if linked list is circular
		 * use HashSet to track nodes, if node is already present then it return true
		 */
		public boolean findIfCircular(){
			HashSet<ListNode> set = new HashSet<ListNode>();
			ListNode n = head;
			while(n!=null){
				if(set.contains(n)){
					return true;
				}
				set.add(n);
				n=n.next;
			}
			return false;
		}
		
		/**
		 * to reverse a list we assume that we have the head node avaiable
		 * @return head
		 * 
		 * 1->2->3->4
		 * 
		 * 4->3->2->1
		 */
		public ListNode reverseList(){
			
			if(head==null){
				return null;
			}
			
			ListNode newHead = null;
			ListNode n = head;
			while(n!=null){
				ListNode l = new ListNode(n.data);
				l.next = newHead;
				newHead=l;
				n=n.next;
			}
			
			return newHead;
		}
		
		/**
		 * Compare two linked list to check if they have same data
		 * @return
		 */
		public boolean compareTwoLists(ListNode l1, ListNode l2){
			while(l1!=null && l2!=null){
				if(l1.data != l2.data){
					return false;
				}
				l1 = l1.next;
				l2=l2.next;
			}
			
			return true;
		}

	public static void main(String[] args) {
		LinkedListC ll= new LinkedListC();
		ll.addToEnd(4);
		ll.addToEnd(2);
		ll.addToEnd(3);
		ll.addToEnd(4);
		ll.addToEnd(3);
		ll.addToEnd(4);
		ll.addToEnd(48);
		ll.addToEnd(0);
		ll.addToEnd(48);
		
		ll.display();
		ll.delete(48);
		ll.display();
		
		ll.findkthNodeFromLast(3);
		
		ll.removeDuplicated();
		ll.display();
		
		ll.findEvenNumber();
		ll.display();
		
		System.out.println(ll.findIfCircular());
	}

}
class ListNode{
	ListNode next = null;
	int data;
	ListNode(int d){
		this.data = d;
	}
}
