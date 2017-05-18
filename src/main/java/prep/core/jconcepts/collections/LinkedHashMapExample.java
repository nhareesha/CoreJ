/**
 * 
 */
package prep.core.jconcepts.collections;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * @author Hareesha
 * May 18, 2017 2017
 */
public class LinkedHashMapExample {
	/* Generally HashMap does not maintain insertion order
	 * LinkedHashMap is used to preserve the insertion order
	 * It internally uses the doublly linked list
	 * 
	 * */
	public static void main(String[] args) {
		Map<CustomeFrame,String> fmap = new LinkedHashMap<>();
		CustomeFrame f1 = new CustomeFrame("F1",41);
		CustomeFrame f2 = new CustomeFrame("F3",11);
		CustomeFrame f3 = new CustomeFrame("F2",21);
		CustomeFrame f4 = new CustomeFrame("F0",1);
		
		fmap.put(f4, "First Frame");
		fmap.put(f3, "Second Frame");
		fmap.put(f2, "Third Frame");
		fmap.put(f1, "Fourth Frame");
		
		for(CustomeFrame f : fmap.keySet()){
			System.out.println(f + " :::" + fmap.get(f));
		}
		
		//Insertion order is maintained, Used when we want to preserve the insertion order
	}

}

class CustomeFrame{
	private String name;
	private int num;
	
	/**
	 * @param name
	 * @param num
	 */
	public CustomeFrame(String name, int num) {
		super();
		this.name = name;
		this.num = num;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + num;
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
		CustomeFrame other = (CustomeFrame) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (num != other.num)
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "CustomeFrame [name=" + name + ", num=" + num + "]";
	}
	
}