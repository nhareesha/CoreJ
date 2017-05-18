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
	 * ConcurrentHashMap allows concurrent operators on it by multiple threads
	 * It doent allow null keys
	 * It doesnt throw ConcurrentModificationException, as segments of map are synchroised
	 * Read operator are fully concurrent
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
