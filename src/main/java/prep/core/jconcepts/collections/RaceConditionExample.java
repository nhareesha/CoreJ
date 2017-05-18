/**
 * 
 */
package prep.core.jconcepts.collections;


/**
 * @author Hareesha
 * May 18, 2017
 */
public class RaceConditionExample {

	/**
	 * When multiple threads tries to modify a meant to be synchronised resource,
	 * then they end up in wrong values 
	 * 
	 * Placing gaurd conditions
	 * Synchronizing the resources 
	 * using volatile variable
	 * prevent race conditions
	 */
	static int count=1;
	public static void main(String[] args) {
		//Map<Integer,String> cmap = new ConcurrentHashMap<>();
		
		Thread t1 = new Thread(new Ticket());
		Thread t2 = new Thread(new Ticket());
		t1.start();
		t2.start();
	}
	
	public  void bookTicket(){
		//synchronized(Object.class){
			if(count>0){//this condition prevents the race condition
			count = count-1;
			System.out.println(Thread.currentThread() + " Booked Ticket" + ":Avaliable Tickets : "+count);
			}
		//}
	}

}

class Ticket implements Runnable{

	/* (non-Javadoc)
	 * @see java.lang.Runnable#run()
	 */
	@Override
	public void run() {
		System.out.println("Current Running Thread : "+Thread.currentThread());
		RaceConditionExample ex = new RaceConditionExample();
		ex.bookTicket();
	}
	
}
