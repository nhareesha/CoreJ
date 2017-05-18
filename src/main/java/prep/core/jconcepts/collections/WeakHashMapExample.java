/**
 * 
 */
package prep.core.jconcepts.collections;

import java.util.Map;
import java.util.WeakHashMap;

/**
 * @author Hareesha
 * May 18, 2017 2017
 */
public class WeakHashMapExample {

	/*
	 * WeakHashMap is used to store keys as WeakReference, which can be reclaimed 
	 * by garbage collector, if there is no strong reference to the key(of the WeakHashMap)
	 * 
	 * The Key inserted in WeakHashMap gets wrapped in java.lang.ref.WeakReference
	 * 
	 * When there is a need to construct a large chache this weakHashMap can be used,
	 * so that GC will take care of weak references and thus saves the space
	 * */
	public static void main(String[] args) {
		
		Map<Entry,String> wkMap = new WeakHashMap<>();
		wkMap.put(new Entry("Name-1"),"WeakReference - 1");
		wkMap.put(new Entry("Name-2"),"WeakReference - 2");
		wkMap.put(new Entry("Name-3"),"WeakReference - 3");
		
		System.out.println(wkMap.size());
		
		System.gc();//May run , may not run
		
		System.out.println(wkMap.size());
	}

}

class Entry{
	private String name;
	
	public Entry(String name){
		super();
		this.name = name;
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Entry other = (Entry) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	
	@Override
	public String toString() {
		return "Entry [name=" + name + "]";
	}
	
}
