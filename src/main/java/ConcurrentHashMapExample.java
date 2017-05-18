import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;

/**
 * 
 */

/**
 * @author Hareesha
 * May 18, 2017 2017
 */
public class ConcurrentHashMapExample {

	/**
	 * ConcurrentHashMap is like HashMa but allows concurrent operators on it by multiple threads
	 * It doent allow null keys
	 * It doesnt throw ConcurrentModificationException, as segments of map are synchroised
	 * Read operator are fully concurrent
	 * 
	 * This type of map can be used when we need multiple threads to access and modify data or
	 * 
	 */
	
	
	public static void main(String[] args) {
		
		ConcurrentHashMap<String,Integer> cmap = new ConcurrentHashMap<>();
		cmap.put("Name1", 1);
		cmap.put("Name2", 2);
		cmap.put("Name4", 4);
		Iterator<String> it = cmap.keySet().iterator();
		for(int i = 0;it.hasNext();i++){
			String next = it.next();
			if(i==cmap.size()-1)
				cmap.put("Name3", 3); //ConcurrentModificationException is not Thrown
			
				System.out.println(cmap.get(next));
			}
				
		System.out.println(cmap);
		
		
	}

}



