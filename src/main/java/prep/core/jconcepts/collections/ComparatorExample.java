/**
 * 
 */
package prep.core.jconcepts.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

/**
 * @author Hareesha
 * May 18, 2017
 */
public class ComparatorExample {
	
	//In order for objects to be sorted, they need to either implement comparable interface or
	//provide a explict comparator to sort method using compare() method
	public static void main(String[] args) {
		Order o1 = new Order("O1",60);
		Order o2 = new Order("O2",160);
		Order o3 = new Order("O3",600);
		Order o4 = new Order("O4",360);
		Order o5 = new Order("O5",606);
		
		List<Order> ol = new ArrayList<Order>();
		ol.add(o1);
		ol.add(o2);
		ol.add(o3);
		ol.add(o4);
		ol.add(o5);
		
		Collections.sort(ol,new Comparator<Order>(){
			public int compare(Order o1, Order o2){
				int val = (o1.getVal()-o2.getVal()>0)?1:(o1.getVal()-o2.getVal()<0)?-1:0;
				return val;
			}
		} );
		
		Iterator<Order> it= ol.listIterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
		
	}

}

class Order{
	private String orderId;
	private int val;
	public Order(String id, int val){
		this.orderId = id;
		this.val = val;
	}
	public String getOrderId() {
		return orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}
	public int getVal() {
		return val;
	}
	public void setVal(int val) {
		this.val = val;
	}
	@Override
	public String toString() {
		return "Order [orderId=" + orderId + ", val=" + val + "]";
	}
	
	
}

