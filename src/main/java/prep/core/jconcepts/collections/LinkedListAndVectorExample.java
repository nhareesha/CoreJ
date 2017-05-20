/**
 * 
 */
package prep.core.jconcepts.collections;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

/**
 * @author Hareesha
 * May 20, 2017 2017
 */
public class LinkedListAndVectorExample {

	/**
	 * LinkedList is used when there is need for frequent modification
	 * of list like adding and deleting elements.
	 * 
	 * Unlike ArrayList , it doesnt require to copy all the elements of the list
	 * when list is modified.It is not indexed.
	 * 
	 * Retrival is O(N)
	 * 
	 * Vector is synchronised and hence the operations are slower compared
	 * to ArrayList.It grows double in size when the initial capacity is filled.
	 * It is indexed and hence retrieval is easier when compared to 
	 * modification.
	 * 
	 * Iterator or listIterator both throw CocurrentModificationException
	 * 
	 * As they are indexed , both maintian the insertion order
	 */
	public static void main(String[] args) {
		
		List<ListItem> l = new LinkedList<>();
		
		for(int i=0;i<5;i++){
			l.add(new ListItem("LinkedListItem"+i,1000+i));
		}
		
		System.out.println(l);
		
		List<ListItem> vec = new Vector<>();
		for(int i=0;i<5;i++){
			vec.add(new ListItem("VectorItem"+i,2000+i));
		}
		
		System.out.println(vec);
		
		//for sorting we use Collections.sort static method,it need Comparator interface instance
		//or class to implemenet comparator interface
		
		Collections.sort(l,new ListItemComparator());
		System.out.println("List After Sort - In decending Order: ");
		System.out.println(l);
		
	}

}

class ListItem{
	private String name;
	private int val;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getVal() {
		return val;
	}
	public void setVal(int val) {
		this.val = val;
	}
	@Override
	public String toString() {
		return "ListItem [name=" + name + ", val=" + val + "]";
	}
	
	/**
	 * @param name
	 * @param val
	 */
	public ListItem(String name, int val) {
		super();
		this.name = name;
		this.val = val;
	}
	
}

class ListItemComparator implements Comparator<ListItem>{

	/* (non-Javadoc)
	 * @see java.util.Comparator#compare(java.lang.Object, java.lang.Object)
	 */
	@Override
	public int compare(ListItem o1, ListItem o2) {
		
		int nameComp = (o1.getName().compareTo(o2.getName()));
		int res = nameComp>0?-1:nameComp<0?1:0;//Decending
		
		//int res = nameComp>0?1:nameComp<0?-1:0;//Ascending order
			
		return res;
	}
	
}
