/**
 * 
 */
package prep.core.jconcepts.ds.linkedlists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * @author Hareesha
 * Jul 16, 2017 2017
 */
public class FlattenAlIst {
	
	public static void main(String args[]){
		
		/*List<Object> toFlatten =  
				createNestedList(1,2,createNestedList(3,4,5,createNestedList(6,7)),8,9);*/
		
		List<Object> toFlat = Arrays.asList(1,2,Arrays.asList(3,4,5,Arrays.asList(6,7)));
		System.out.print(flatten(toFlat));
	}
	
	public static List<Object> flatten(List<Object> list){
		
		List<Object> result = new ArrayList<>();
		
		LinkedList<Object> queue = new LinkedList<Object>();
		queue.addAll(list);
		
		while(queue.size() > 0){
			
			Object obj = queue.remove();
			if(obj instanceof List<?>){
				queue.addAll(0,(List<?>)obj);
				
			}else{
				result.add(obj);
			}
		}
		
		return result;
	}
	
	public static List<Object> createNestedList(Object... args){
		return Arrays.asList(args);
	}
}
