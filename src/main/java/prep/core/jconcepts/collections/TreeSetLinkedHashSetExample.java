/**
 * 
 */
package prep.core.jconcepts.collections;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

/**
 * @author Hareesha
 * May 19, 2017 2017
 */
public class TreeSetLinkedHashSetExample {

	/**
	 * Tree set , sortd the elements of the set in the natural sort order
	 * It uses comparable Interface to do so.Any custom class, if need to stored in 
	 * Tree set it needs to implement comparable Interface.
	 * 
	 * LinkedHashSet maintains the insertion order.
	 * 
	 * HashSet does not maintain order and not sequential
	 */
	public static void main(String[] args) {
		SetExample e1 = new SetExample("zname",3);
		SetExample e2 = new SetExample("aname",1);
		SetExample e3 = new SetExample("kname",2);
		
		Set<SetExample> tset = new TreeSet<>();
		tset.add(e1);
		tset.add(e2);
		tset.add(e3);
		
		//TreeSet gets natural sort Order
		System.out.println(tset);
		//[SetExample [name=aname, roll=1], SetExample [name=kname, roll=2], SetExample [name=zname, roll=3]]
		
		LinkedHashSet<SetExample> lset = new LinkedHashSet<SetExample>();
		lset.add(e1);
		lset.add(e2);
		lset.add(e3);
		
		//LinkedHashSet maintains the insertion order
		System.out.println(lset);
		
		//[SetExample [name=zname, roll=3], SetExample [name=aname, roll=1], SetExample [name=kname, roll=2]]
	}

}

class SetExample implements Comparable{
	
	private String name;
	private int roll;
	
	/**
	 * @param name
	 * @param roll
	 */
	public SetExample(String name, int roll) {
		super();
		this.name = name;
		this.roll = roll;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRoll() {
		return roll;
	}

	public void setRoll(int roll) {
		this.roll = roll;
	}

	/* (non-Javadoc)
	 * @see java.lang.Comparable#compareTo(java.lang.Object)
	 */
	@Override
	public int compareTo(Object obj) {
		
		SetExample that = (SetExample)obj;
		return (this.getName().compareTo(that.getName()));
	}

	@Override
	public String toString() {
		return "SetExample [name=" + name + ", roll=" + roll + "]";
	}
	
}