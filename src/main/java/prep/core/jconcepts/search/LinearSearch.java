/**
 * 
 */
package prep.core.jconcepts.search;

/**
 * @author Hareesha
 * May 29, 2017
 */
public class LinearSearch {

	/**
	 * Linear Search : Linear Search is the basic search algorithm and in this algorith
	 * elements are compared one by one.
	 * 
	 * Time complexity would be O(n) as element can be at the last of the data set.
	 */
	public static void main(String[] args) {
		
		int[] arr = new int[]{2,3,45,10,0};
		int find = 0;
		
		linearSearch(arr, find);
		
}

	
	public static void linearSearch(int[] arr,int find){
		for(int i=0;i<arr.length;i++){
			if(arr[i]==find){
				System.out.println("Element :"+find+"  found at index-->"+i);
				break;
			}
		}
	}

}
