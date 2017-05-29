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
	int[] arr = null;
	int find;
	public LinearSearch(int arr[], int find){
		this.arr = arr;
		this.find = find;
	}
	public static void main(String[] args) {
		
		int[] array = {1,2,4,5,6,7,8,9,10,11};
		int search = 6;
		LinearSearch ls = new LinearSearch(array,search);
		ls.linearSearch();
		
}

	
	public  void linearSearch(){
		int trycount=0;
		for(int i=0;i<arr.length;i++){
			trycount++;
			if(arr[i]==find){
				System.out.println("Element :"+find+"  found at index-->"+i+" after  "+trycount+" tries");
				break;
			}
		}
	}

}
