/**
 * 
 */
package prep.core.jconcepts.ds.stacksAndQueues;

/**
 * @author Hareesha
 * Jul 3, 2017 2017
 */
public class StackC<T> {

	/**
	 * Stack can be implemented using linked list as long the insertion and deletion are in
	 * same order
	 * 
	 * Stack is LIFO
	 * 
	 * pop()
	 * push()
	 * peek()
	 * isEmpty()
	 * 
	 * Implemented using Linked list, where insertion and deletion  are in same order
	 */
	
	StackNode<T> top=null;
	
	/**
	 * Pushes element on to top of the stack.
	 * 
	 * Here linked list is used, which adds elements to the start.
	 * @param data
	 */
	public void push(T data){
		StackNode<T> item = new StackNode<T>(data);
		if(top!=null){
			item.next = top;
			top = item;
		}else{
			//add a exception to say No Such element exception
		}
	}
	
	/**
	 * Pops the elemtns which is on the top of the list
	 * 
	 * Follows LIFO
	 * @return
	 */
	public T pop(){
		
		if(top==null){
			//throw NosuchElement Exception
		}
		else{
			T data = top.data;
			top = top.next;
			return data;
		}
		return null;
	}
	
	/**
	 * Peek() returns element on the top of the Stack
	 * @return T
	 */
	public T peek(){
		if(top == null){
			//thow NoSuchElementException	
		}else{
			T data = top.data;
			return data;
		}
		return null;
	}
	/**
	 * isEmepty() 
	 * @param args
	 */
	public boolean isEmpty(){
		if(top == null){
			return true;
		}
		return false;
	}
	
	public static void main(String[] args) {

	}

}
class StackNode<T>{
	 T data;
	 StackNode<T> next;
	
	public StackNode(T data) {
		super();
		this.data = data;
	}
	
}
