/**
 * 
 */
package prep.core.jconcepts.ds;

import java.lang.reflect.Array;

/**
 * @author Hareesha
 * May 29, 2017 2017
 */
public class QueueArray<T> {

	/**
	 * Queue is a DataStructure which allows First In First Out pattern
	 * 
	 * It has 2 pointers that has "front" and "rear" as two pointers
	 * When using Arrays
	 * Insertion : While inserting increment "rear" and insert.
	 * 
	 * Deletion : decrement "rear" and "front" and pop element
	 * 
	 * Insert, delete : O(1)
	 * Search or Access : O(n)
	 */
	
	T[] qarr;
	int size;
	int front;
	int rear;
	
	public QueueArray(Class<T> type){
		this(type,10);
	}
	
	public QueueArray(Class<T> type , int size){
		this.size = size;
		qarr = (T[])Array.newInstance(type, size);
		front=-1;
		rear=-1;
	}
	
	public void queue(T val){
		if(front==-1 ||  rear==-1){
			qarr[0]=val;
			front=0;
			rear=0;
		}else{
			rear=rear+1;
			if(!checkRear(rear)){
				qarr[rear] = val;
			}else{
				System.out.println("Queue is too full to accept any Elements");
			}
		}
	}
	
	public T dequeue(){
		T poped=null;
		if(front==-1 || rear==-1 || front>=size){
			System.out.println("No elements in the queue ");
		}else{
			
			 poped = qarr[front];
			front=front+1;
		}
		return poped;
	}
	
	private boolean checkRear(int rear){
		if(rear==size-1){
			return true;
		}
		return false;
	}
	
	public static void main(String[] args) {
		QueueArray<String> qa= new QueueArray<>(String.class);
		qa.queue("abc1");
		qa.queue("abc2");
		qa.queue("abc3");
		qa.queue("abc4");
		qa.queue("abc5");
		qa.queue("abc6");
		qa.queue("abc7");
		qa.queue("abc8");
		qa.queue("abc9");
		qa.queue("abc10");
		System.out.println((String)qa.dequeue());
		System.out.println((String)qa.dequeue());
		System.out.println((String)qa.dequeue());
		System.out.println((String)qa.dequeue());
		System.out.println((String)qa.dequeue());
		System.out.println((String)qa.dequeue());
		System.out.println((String)qa.dequeue());
		System.out.println((String)qa.dequeue());
		System.out.println((String)qa.dequeue());
		System.out.println((String)qa.dequeue());
		
	}

}
