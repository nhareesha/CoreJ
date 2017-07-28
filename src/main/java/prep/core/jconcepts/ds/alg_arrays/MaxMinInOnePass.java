/**
 * 
 */
package prep.core.jconcepts.ds.alg_arrays;

/**
 * @author Hareesha
 * Jul 25, 2017 2017
 */
public class MaxMinInOnePass {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] arr = {1,3,56,-1,0};
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		
		for(int i = 0 ; i<arr.length ; i++){
			if(arr[i]>max){
				max = arr[i];
			}
			if(arr[i]<min){
				min = arr[i];
			}
		}
		
		System.out.println(max+ " "+min);
	}

}
