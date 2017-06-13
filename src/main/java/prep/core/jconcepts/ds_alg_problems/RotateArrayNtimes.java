/**
 * 
 */
package prep.core.jconcepts.ds_alg_problems;

import java.util.Arrays;

/**
 * @author Hareesha
 * Jun 13, 2017 2017
 */
public class RotateArrayNtimes {

	/**
	 * Rotate array right n times
	 * 
	 * o(n)
	 * O(1)
	 */
	public static void main(String[] args) {
			
		int a[] = {20,30,40,50,10,11,12,13};
		//roatae 4 times
		int n = 9 ; //number of rotations to right
		
		if(n>a.length){
			n = n-a.length;
		}
		
		int b[] = new int[a.length];
		
		int j = 0;
		for(int i = n ;i<a.length;i++ ){
			b[j] = a[i];
			j++;
		}
		for(int i = 0;i<n;i++){
			b[j]=a[i];
			j++;
		}
		System.out.println(Arrays.toString(b));
	}

}
