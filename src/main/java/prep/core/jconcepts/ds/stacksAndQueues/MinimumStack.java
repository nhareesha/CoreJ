/**
 * 
 */
package prep.core.jconcepts.ds.stacksAndQueues;

import java.util.Stack;

/**
 * @author Hareesha
 * Jul 16, 2017
 */
public class MinimumStack {
	
	Stack<Integer> stack = new Stack<Integer>();
	Stack<Integer> minstack = new Stack<Integer>();
	
	public void push(int data){
		stack.push(data);
		if(!(minstack.isEmpty())){
			if(data <= minstack.peek()){
				minstack.push(data);
			}
		}else{
			minstack.push(data);
		}
		
	}
	public void pop(){
		if(!(minstack.isEmpty())){
			if(stack.peek() == minstack.peek()){
				minstack.pop();
			}
		}	
			if(!(stack.isEmpty())){
				stack.pop();
			}
	}
	public int getMin(){
			return minstack.peek();
	}
	
	public static void main(String[] args){
		
		//2 3 4 1 0 6 4 2
		MinimumStack s = new MinimumStack();
		s.push(3);
		s.push(2);
		s.push(4);
		s.push(-1);
		s.push(2);
		s.push(-1);
		
		System.out.println(s.getMin());
		s.pop();
		System.out.println(s.getMin());
		
	}
}
