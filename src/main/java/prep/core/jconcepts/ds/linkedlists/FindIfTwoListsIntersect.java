/**
 * 
 */
package prep.core.jconcepts.ds.linkedlists;

/**
 * @author Hareesha
 * Jul 3, 2017 2017
 */
public class FindIfTwoListsIntersect {

	/**
	 * Given two linked lists check if they intersect
	 * 
	 * that means they should have same node(by reference)
	 * 
	 * 1-2-3-4-5-6-7
	 * 
	 * 11-12-13-14-15-5-6-7
	 * 
	 * 
	 * 
	 */
	public static void main(String[] args) {
		ListNode l1 = new ListNode(1);
		ListNode l2 = new ListNode(2);
		ListNode l3 = new ListNode(3);
		ListNode l4 = new ListNode(4);
		ListNode l5 = new ListNode(5);
		ListNode l6 = new ListNode(6);
		ListNode l7 = new ListNode(7);
		
		//
		l1.next = l2;
		l2.next=l3;
		l3.next=l4;
		l4.next = l5;
		l5.next=l6;
		l6.next=l7;
		
		ListNode c1 = new ListNode(11);
		ListNode c2 = new ListNode(12);
		ListNode c3 = new ListNode(13);
		ListNode c4 = new ListNode(14);
		ListNode c5 = new ListNode(15);
	
		
		c1.next=c2;
		c2.next=c3;
		c3.next=c4;
		c4.next=c5;
		c5.next = l5;
		
		LinkedListC list = new LinkedListC();
		
		ListNode intersectingNode = list.checkIfIntersect(l1, c1);
		if(intersectingNode == null){
			System.out.println("Lists do not intersect");
		}else{
			System.out.println("Lists Intersect at Node : "+intersectingNode + " :which has data -->"+intersectingNode.data);
		}
		
	}

}
