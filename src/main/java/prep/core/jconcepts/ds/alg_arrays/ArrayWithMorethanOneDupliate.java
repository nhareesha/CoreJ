/**
 * 
 */
package prep.core.jconcepts.ds.alg_arrays;

import java.util.HashSet;

/**
 * @author Hareesha
 * Jul 28, 2017 2017
 */
public class ArrayWithMorethanOneDupliate {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] arr = new int[]{2,3,4,5,6,1,2};
		HashSet<Integer> set = new HashSet<Integer>();
		int count = 0;
		for(int i : arr){
			if(!set.add(i)){
				count++;
			}
			if(count>=2){
				System.out.println("More than one duplicate");
				break;
			}
		}
	}

}
