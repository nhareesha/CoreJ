/**
 * 
 */
package prep.core.jconcepts.ds;

/**
 * @author Hareesha
 * May 27, 2017
 */
public class LinkedListDouble {

	/**
	 * Doubly LinkedList
	 */
	
	private NodeD head;
	
	public void add(Object val){
		NodeD newNode =new NodeD(val,null,null);
		if(head==null){
			head=newNode;
			return;
		}else{
			newNode.setNext(head);
			newNode.setPrevious(null);
			head=newNode;
		}
	}
	
	/**
	 * Deletes first Node from the doubly linked list
	 */
	public void delete(){
		if(head==null){
			System.out.println("No elements in the doubly linked list");
		}else{
			NodeD newHead = head.getNext();
			newHead.setPrevious(null);
			head = newHead;
		}
	}
	
	public void display(){
		NodeD tempHead = head;
		while(tempHead.getNext()!=null){
			System.out.println(tempHead.getVal());
			tempHead = tempHead.getNext();
		}
		System.out.println(tempHead.getVal());
	}
	public static void main(String[] args) {
		LinkedListDouble dl = new LinkedListDouble();
		dl.add(12);
		dl.add(20);
		dl.add(100);
		dl.display();
		dl.delete();
		System.out.println("2nd display");
		dl.display();
		
		
	}

}
class NodeD{
	private Object val;
	private NodeD next;
	private NodeD previous;
	public Object getVal() {
		return val;
	}
	public void setVal(Object val) {
		this.val = val;
	}
	public NodeD getNext() {
		return next;
	}
	public void setNext(NodeD next) {
		this.next = next;
	}
	public NodeD getPrevious() {
		return previous;
	}
	public void setPrevious(NodeD previous) {
		this.previous = previous;
	}
	/**
	 * @param val
	 * @param next
	 * @param previous
	 */
	public NodeD(Object val, NodeD next, NodeD previous) {
		super();
		this.val = val;
		this.next = next;
		this.previous = previous;
	}
	
}
