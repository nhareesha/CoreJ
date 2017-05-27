/**
 * 
 */
package prep.core.jconcepts.ds;

import java.util.LinkedList;

import sun.launcher.resources.launcher;

/**
 * @author Hareesha
 * May 26, 2017
 */
public class LinkedListU {

	/**
	 * LIFO - LikeStack impl with LinkedList concept
	 * Add element to the LinkedList
	 * 
	 * For LinkedList we will only have the head Node.
	 * 
	 * For insertion O(1) if it is inserted at the start of List
	 * else O(n) else where
	 * 
	 */
	
	private Node head;
	/**
	 * @param head
	 */
	public LinkedListU() {
		super();
		this.head = null;
	}

	public void add(Object val){
		Node newNode = new Node(val,null);
		if(head==null){
			head=newNode;
		}else{
			newNode.setNxt(head);
			head=newNode;
		}
		
	}
	
	public void delete(){
		if(head==null){
			System.out.println("No elements in LinkedList");
		}else{
			Node newHead = head.getNxt();
			head=null;
			head=newHead;
			
		}
	}
	public void display(){
		Node tackPtr = head;
		while(tackPtr.getNxt()!=null){
			System.out.println(tackPtr.getVal());
			tackPtr=tackPtr.getNxt();
		}
		System.out.println(tackPtr.getVal());
	}
	public static void main(String[] args) {
		LinkedListU l = new LinkedListU();
		l.add(1);
		l.add(2);
		l.add(10);
		l.delete();
		l.display();
	}

}

class Node{
	private Object val;
	private Node nxt;
	/**
	 * @param val
	 * @param nxt
	 */
	public Node(Object val, Node nxt) {
		super();
		this.val = val;
		this.nxt = nxt;
	}
	public Object getVal() {
		return val;
	}
	public void setVal(Object val) {
		this.val = val;
	}
	public Node getNxt() {
		return nxt;
	}
	public void setNxt(Node nxt) {
		this.nxt = nxt;
	}
	
	
}