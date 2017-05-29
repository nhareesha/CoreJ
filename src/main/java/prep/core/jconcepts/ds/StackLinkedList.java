/**
 * 
 */
package prep.core.jconcepts.ds;

/**
 * @author Hareesha
 * May 29, 2017 2017
 */
public class StackLinkedList {

	/**
	 * Stack implemented as Linked List
	 */
	
	private StackNode top;
	
	public StackLinkedList(){
		top=null;
	}
	
	public void push(Object val){
		StackNode newNode = new StackNode(val,null);
		if(top==null){
			top=newNode;
		}else{
			newNode.setNext(top);
			top = newNode;
			
		}
	}
	
	public Object pop(){
		StackNode poped = null;
		if(top == null){
			System.out.println("There are no elements in the stack");
		}else{
			poped = top;
			top = top.getNext();
		}
		return poped.getVal();
	}
	
	
	public static void main(String[] args) {
		StackLinkedList sl = new StackLinkedList();
		sl.push("one");
		sl.push("two");
		sl.push("three");
		sl.push("four");
		System.out.println(((String)sl.pop()));
		
	}

}

class StackNode{
	Object val;
	StackNode next;
	
	/**
	 * @param val
	 * @param next
	 */
	public StackNode(Object val, StackNode next) {
		super();
		this.val = val;
		this.next = next;
	}
	
	public Object getVal() {
		return val;
	}
	public void setVal(Object val) {
		this.val = val;
	}
	public StackNode getNext() {
		return next;
	}
	public void setNext(StackNode next) {
		this.next = next;
	}
}