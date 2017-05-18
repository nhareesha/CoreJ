/**
 * 
 */
package prep.core.jconcepts.collections;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

/**
 * @author Hareesha
 * May 18, 2017
 */
/**
 * TreeMap gives the natural sort order for keys of the Map collection
 * TreeMap internally uses comparable to compare and sort the keys .
 * So for any custom class to fit in as TreeMap key, needs to implement Comaprable Interface
 * @author Hareesha
 * May 18, 2017 2017
 */
public class TreeMapExample {

	public static void main(String[] args) {
		Employee e1 = new Employee("a1",12000);
		Employee e2 = new Employee("a2",1000);
		Employee e3 = new Employee("a3",3000);
		Employee e4 = new Employee("a4",10000);
		
		Map<Employee,String> emp = new TreeMap<Employee,String>();
		emp.put(e1, "Role1");
		emp.put(e2, "Role2");
		emp.put(e3, "Role3");
		emp.put(e4, "Role4");
		
		for(Employee e : emp.keySet()){
			System.out.println(e+" VALUE :" + emp.get(e));
		}
		
		//Employee with third highest sal on key
		Iterator<Employee> setIt = emp.keySet().iterator();
		int index = emp.size()-3;
		Employee val= null;
		for(int i=0;setIt.hasNext();i++){
			val=setIt.next();
			if(i==index){
				break;
			}
			
		}
		
		//To sort based on value collection can be reversed.
		
		System.out.println(val);
	}

}

class Employee implements Comparable<Employee>{
	private String id;
	private int sal;
	
	public Employee(String id,int sal ){
		this.sal = sal;
		this.id = id;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public int getSal() {
		return sal;
	}

	public void setSal(int sal) {
		this.sal = sal;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", sal=" + sal + "]";
	}

	/* (non-Javadoc)
	 * @see java.lang.Comparable#compareTo(java.lang.Object)
	 */
	public int compareTo(Employee emp) {
		
		return (this.sal-emp.sal>0?1:(this.sal-emp.sal<0)?-1:0);
	}
	
}