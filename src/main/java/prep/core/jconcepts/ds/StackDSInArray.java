/**
 * 
 */
package prep.core.jconcepts.ds;

/**
 * @author Hareesha
 * May 28, 2017
 */
public class StackDSInArray {

	/**
	 * Stack DataStructure follows Last In First Out order
	 * 
	 * Top is pointer that keepts track of elements
	 * 
	 * For search and access, O(N) because we can move in only one direction
	 * 
	 * For Insert and delete O(1) because we can do it on the top of the stack
	 */ 
	
	int top;
	Object[] eleArr;
	int size;
	public StackDSInArray(){
		this(20);
	}
	
	public StackDSInArray(int size){
		this.size=size;
		eleArr =  new Object[size];
		top = -1;
	}
	
	public void push(Object val){
		if(top == size-1){
			System.out.println("Stack is full..No more Insertions");
		}else{
			top = top+1;
			eleArr[top] = val;
		}
	}
	
	/**
	 * Pops elements from the top of the stack that is LIFO
	 * @return
	 */
	public Object pop(){
		Object poped = null;
		if(top == -1){
			return null;
		}else{
			poped=eleArr[top];
			top = top-1;
		}
		return poped;
	}
	
	/**
	 * Display elements of the stack in the reverse order LIFO
	 */
	public void display(){
		for(int i = 0 ;i<eleArr.length;i++){
			Object o = this.pop();
			if(o!=null)
				System.out.println(o);
		}
	}
	

	public static void main(String[] args) {
		StackDSInArray stack = new StackDSInArray();
		stack.push(10);
		stack.push("Hello");
		stack.push(new Boolean("false"));
		stack.push(new Long(100000000l));
		stack.display();
		
	}

}
