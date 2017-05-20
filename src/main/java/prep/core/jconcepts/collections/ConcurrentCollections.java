/**
 * 
 */
package prep.core.jconcepts.collections;

import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;

/**
 * @author Hareesha
 * May 20, 2017
 */
public class ConcurrentCollections {

	/**
	 * Concurrent Collections does not throw ConcurrentModificationException, on concurrent operations
	 * 
	 * CopyOnWriteArrayList, CopyOnWriteArraySet, ConcurrentSkipListSet
	 */
	public static void main(String[] args) {
		
		List<Integer> cl = new CopyOnWriteArrayList<>();
		Set<Integer> cs = new CopyOnWriteArraySet<>();
		for(int i=0;i<10;i++){
			cl.add(i);
			cs.add(i);
		}
		
		System.out.println(cl);
		
		Iterator<Integer> lit = cl.listIterator();
		
		for(int i =0 ; lit.hasNext();i++){
			System.out.println(lit.next());
			if(i==9){
				cl.add(11);
			}
		}
		System.out.println(cl);
		
		Iterator<Integer> sit = cs.iterator();
		for(int i =0 ; sit.hasNext();i++){
			System.out.println(sit.next());
			if(i==9){
				cs.add(11);
			}
		}
		System.out.println(cs);
		
		
		
	}

	
}
