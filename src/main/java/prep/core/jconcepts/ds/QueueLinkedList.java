/**
 * 
 */
package prep.core.jconcepts.ds;

/**
 * @author Hareesha
 * May 29, 2017 2017
 */
public class QueueLinkedList {

	/**
	 * Queue using Singly LinkedList
	 * Queue maintains two ointers for tracking
	 * front and rear
	 * 
	 * Insert, delete: O(1)
	 * 
	 * Search : O(n)
	 */
	QueueNode front;
	QueueNode rear;
	public QueueLinkedList(){
		front=null;
		rear=null;
	}
	
	/**
	 * This method inserts elements in the queue
	 * @param val
	 */
	public void queue(Object val){
		QueueNode newElement = new QueueNode(val,null);
		if(rear==null || front==null){
			
			front=newElement;
			rear=newElement;
		}else{
			rear.next = newElement;
			rear=newElement;
		}
	}
	
	/**
	 * This method delete element following FIFO pattern
	 * @return
	 */
	public Object dequeue(){
		Object o=null;
		if(rear==null || front==null){
			System.out.println("No elements in the queue");
		}else{
			QueueNode poped = front;
			front = front.next;
			o = poped.getVal();
		}
		return o;
	}
	public static void main(String[] args) {
		QueueLinkedList ql = new QueueLinkedList();
		ql.queue("Hello");;
		ql.queue("I am second");
		ql.queue("third is here");
		
		System.out.println((String)ql.dequeue());
	}

}

class QueueNode{
	Object val;
	QueueNode next;
	
	
	/**
	 * @param val
	 * @param next
	 */
	public QueueNode(Object val, QueueNode next) {
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
	public QueueNode getNext() {
		return next;
	}
	public void setNext(QueueNode next) {
		this.next = next;
	}
	
}