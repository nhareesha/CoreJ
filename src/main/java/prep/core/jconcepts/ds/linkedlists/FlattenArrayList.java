/**
 * 
 */
package prep.core.jconcepts.ds.linkedlists;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Hareesha
 * Aug 2, 2017 2017
 */
public class FlattenArrayList {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		List<Integer> l = new ArrayList<Integer>();
		l.add(1);
		l.add(2);
		l.add(3);
		l.add(11);
		l.add(4);
		l.add(5);
		List<Integer> l1 = new ArrayList<Integer>();
		l.add(5);
		l.add(6);
		l.add(7);
		l.add(8);
		l.add(9);
		l.add(50);
		l.addAll(l1);
		
		flatten(l);
		
	}

	/**
	 * @param l
	 */
	private static void flatten(List l) {
		for(int i = 0 ; i < l.size();i++){
			if(l.get(i) instanceof List){
				flatten((List)l.get(i));
			}else{
				System.out.println(l.get(i));
			}
		}
		
		
	}

}
