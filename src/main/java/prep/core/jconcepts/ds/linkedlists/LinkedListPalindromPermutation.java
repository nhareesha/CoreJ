/**
 * 
 */
package prep.core.jconcepts.ds.linkedlists;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;

/**
 * @author Hareesha
 * Jun 30, 2017 2017
 */
public class LinkedListPalindromPermutation {

	/**
	 * 1->2->1->2->1
	 */
	public static void main(String[] args) {
		LinkedListC l = new LinkedListC();
		l.addToEnd(1);
		l.addToEnd(0);;
		l.addToEnd(3);;
		l.addToEnd(2);
		l.addToEnd(1);
		
		HashMap<Integer,Integer> map = new HashMap<>();
		ListNode n = l.head;
		while(n!=null){
			if(map.containsKey(n.data)){
				int c  = map.get(n.data);
				map.put(n.data, c+1);
			}else{
				map.put(n.data, 1);
			}
			n=n.next;
		}
		Collection<Integer> l1 = map.values();
		boolean flag = false;
		for(int i : l1){
			if(i%2!=0){
				if(flag){
					System.out.println("Not permuation of Palindrom");
					break;
				}
				flag = true;
			}
		}
		System.out.println(l1);
		
		
		
		
		
	}

}
