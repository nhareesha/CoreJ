/**
 * 
 */
package prep.core.jconcepts.ds.alg_arrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

/**
 * @author Hareesha
 * Jul 25, 2017 2017
 */
public class SortArrayByFreq {

	/**
	 * @param args
	 * display based on increasing order of the values
	 */
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		
		int[] arr = new int[]{3,2,3,44,4,4,4,5,1,2,3,4,5};
		HashMap<Integer,Integer> map = new HashMap<>();
		for(int i = 0;i < arr.length ;i++){
			if(map.containsKey(arr[i])){
				map.put(arr[i], map.get(arr[i])+1);
			}else
			map.put(arr[i], 1);
		}
		
		//convert set to list
		List<Map.Entry<Integer,Integer>> l = new ArrayList<>(map.entrySet());
		
		Collections.sort(l,new Comparator<Entry<Integer,Integer>>(){

			public int compare(Entry<Integer,Integer> e1, Entry<Integer,Integer> e2) {
				if(e1.getValue()> e2.getValue())
				return -1;
				else if(e1.getValue() < e2.getValue())
					return 1;
				else
					return 0;
					
			}

		

		
			
		});
		
		System.out.println(l);
		
	}

}
