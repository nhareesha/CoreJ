/**
 * 
 */
package prep.core.jconcepts.ds_alg_problems;

import prep.core.jconcepts.ds.LinkedListU;

/**
 * @author Hareesha
 * May 30, 2017 2017
 */
public class LLMiddleElement {

	/**
	 * Problem : Find the middle element of the linked list, in one pass.
	 * 
	 * Ans : For linked lists all we have is head element.In usual scenario , if we can find the length 
	 * of the list , then we can find the mid in another pass.
	 * this has O(n2)
	 * 
	 * We can reduce it to O(n) by using two pointers, one for iterating for every node 
	 * and another for every other node.
	 * 
	 * By the time first pointer reaches the end node, the second will be pointing to the possible
	 * middle node.
	 */
	public static void main(String[] args) {
		LinkedListU list = new LinkedListU();
		list.add("1st node...hello");
		list.add("2nd node");
		list.add("3rd node");//possibly middle
		list.add("4th node");
		list.add("5th node");
		list.add("6th node");
		list.add("7th node");
		list.add("8th node");
		list.add("9th node");
		list.add("10th node");
		list.add("11th node");
		
		System.out.println((String)list.findMiddleNode());
		System.out.println((String)list.findnthElement(3));
		
	}

}
