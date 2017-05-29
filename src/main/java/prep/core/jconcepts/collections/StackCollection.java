/**
 * 
 */
package prep.core.jconcepts.collections;

import java.util.Stack;

/**
 * @author Hareesha
 * May 29, 2017 2017
 */
public class StackCollection {

	/**
	 * Stack is a predefined datastructure from util package in java
	 */
	public static void main(String[] args) {
		Stack<String> stck = new Stack<>();
		stck.push("1st element");
		stck.push("2nd element");
		stck.push("3rd element");
		stck.push("4th element"); //LAST IN
		
		System.out.println(stck.pop()); //First OUT
		
		System.out.println(stck.peek()); //peek does not remove element from stack
		
		System.out.println(stck.pop());//pop removes the element from the stack
	}

}
