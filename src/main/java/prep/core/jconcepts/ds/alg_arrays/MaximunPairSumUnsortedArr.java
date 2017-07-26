/**
 * 
 */
package prep.core.jconcepts.ds.alg_arrays;

/**
 * @author Hareesha
 * Jul 25, 2017 2017
 */
public class MaximunPairSumUnsortedArr {

	/**
	 * Maximum pair sum of array in O(n)
	 */
	public static void main(String[] args) {
		
		int[] arr = {12,34,10,6,40,-1};
		int m1 = 0;
		int m2 = 0;
		for(int i = 0;i < arr.length ; i++){
			if(arr[i]>m1){
				m2 = m1;
				m1 = arr[i];
			}
		}
		System.out.println(m1 + " " + m2);
		System.out.println(m1+m2);
	}

}
