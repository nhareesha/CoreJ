/**
 * 
 */
package prep.core.jconcepts.ds_alg_problems;

/**
 * @author Hareesha
 * Jun 23, 2017 2017
 */
public class UniqueCharacters {

	/**
	 * IF string has unique characters or not?
	 */
	public static void main(String[] args) {
		
		String s = "abcdefggik";
		char[] arr = s.toCharArray();
		//ASCII characters 0-127
		int[] a = new int[128];
		
		for(char b : arr){
			a[b]++;
			if(a[b]>1){
				System.out.println("Not unique");
				return;
			}
			
		}
		System.out.println("Unique");
	}

}
