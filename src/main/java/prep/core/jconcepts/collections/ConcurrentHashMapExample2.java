/**
 * 
 */
package prep.core.jconcepts.collections;

import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * @author Hareesha May 19, 2017 2017
 */
public class ConcurrentHashMapExample2 {

	/**
	 * ExecutorService , spawns 3 threads and they handle the task asynchronously 
	 * 
	 * ConcurrentHashMap is synchrinised and it is recomended to use ConcurrentHashMap
	 * whene there is need to use HashTable. 
	 */

	public static void main(String[] args) {
	ConcurrentHashMap<String, Integer> cmap = new ConcurrentHashMap<>();

		ExecutorService srvc = Executors.newFixedThreadPool(3);
		Future f1 = srvc.submit(new Callable<Object>() {

			@Override
			public Object call() throws Exception {
				System.out.println("Current Executing Thread name :"+Thread.currentThread().getName());
				for(int i=0;i<5;i++){
					cmap.put(Thread.currentThread().getName()+i, i);
				}
				return Thread.currentThread().getName();
			}
		});
		
		try {
			System.out.println(f1.get());
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ExecutionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		srvc.submit(new Callable<Object>() {

			@Override
			public Object call() throws Exception {
				System.out.println("Current Executing Thread name :"+Thread.currentThread().getName());
				for(int i=0;i<5;i++){
					cmap.put(Thread.currentThread().getName()+i, i);
				}
				return Thread.currentThread().getName();
			}
		});
		
		srvc.submit(new Callable<Object>() {

			@Override
			public Object call() throws Exception {
				System.out.println("Current Executing Thread name :"+Thread.currentThread().getName());
				for(int i=0;i<5;i++){
					cmap.put(Thread.currentThread().getName()+i, i);
				}
				return Thread.currentThread().getName();
			}
		});
		
		srvc.shutdown();
		System.out.println(cmap);
	}
}
