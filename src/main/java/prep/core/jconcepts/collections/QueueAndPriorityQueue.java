/**
 * 
 */
package prep.core.jconcepts.collections;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

/**
 * @author Hareesha
 * May 29, 2017
 */
public class QueueAndPriorityQueue {

	/**
	 * Queue in java is implemented using LinkedList, FIFO
	 * 
	 * Queue is an Interface and it extends Java.util.Collection interface
	 * 
	 * PriorityQueue : Internally ararnges elements in the natural sort order.
	 * So for custom classes need to implement comparable interface  otherwise it
	 * throws ClassCastException
	 */
	public static void main(String[] args) {
		
		//Basic Queue from java.util package
		Queue<String> queue = new LinkedList<String>();
		queue.add("I am First"); //First In
		queue.add("I am Second");
		queue.add("Third is here");
		queue.add("So I am Four");
		queue.add("Here is the Fifth");
		System.out.println(queue.poll()); //First Out
		System.out.println(queue.peek()); //Doesn't remove element from the queue , but returns element
		System.out.println(queue.poll());
		
		//Priority Queue
		PriorityQueue<Integer> qp1 = new PriorityQueue<>();
		
		qp1.add(11);
		qp1.add(1);
		qp1.add(0);
		qp1.add(3);
		qp1.add(2);
		
		System.out.println(qp1.poll());
		
		//
		PriorityQueue<QueueInst> qp2 = new PriorityQueue<>();
		qp2.add(new QueueInst(20,"Twenty") );
		qp2.add(new QueueInst(0,"Zero") );
		qp2.add(new QueueInst(19,"Nineteen") );
		qp2.add(new QueueInst(1,"Twenty") );
		
		System.out.println(qp2.poll());
		
		
	}

}

class QueueInst implements Comparable<QueueInst>{
	private int num;
	private String name;
	
	/**
	 * @param num
	 * @param name
	 */
	public QueueInst(int num, String name) {
		super();
		this.num = num;
		this.name = name;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + num;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		QueueInst other = (QueueInst) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (num != other.num)
			return false;
		return true;
	}

	
	/* (non-Javadoc)
	 * @see java.lang.Comparable#compareTo(java.lang.Object)
	 */
	@Override
	public int compareTo(QueueInst that) {
		
		return (this.getNum()-that.getNum()>0?1:(this.getNum()-that.getNum()<0?-1:0));
	}
	@Override
	public String toString() {
		return "QueueInst [num=" + num + ", name=" + name + "]";
	}
	
}
