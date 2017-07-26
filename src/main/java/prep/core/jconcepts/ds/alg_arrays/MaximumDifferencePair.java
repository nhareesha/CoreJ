/**
 * 
 */
package prep.core.jconcepts.ds.alg_arrays;

import java.util.Arrays;

/**
 * @author Hareesha
 * Jul 13, 2017 2017
 */
public class MaximumDifferencePair {

	/**
	 * Given and array find a apir with maximun differece in an array
	 * susch that i<j and a[i] < a[j]
	 * 
	 * a = {2,3,4,1,5,9}
	 * 
	 * 1,9
	 * 
	 * If we can find the smallest element and largest element then we can
	 * then they make the pair
	 * 
	 */
	public static void main(String[] args) {
		int a[] = {2,1};
		if(a!=null && a.length<=1){
			return;
		}
		int b[] = new int[2];
		int diff = a[1]-a[0];
	//	b[0] = a[0];
	//	b[1] = a[1];
		for(int i = 0;i<a.length;i++){
			for(int j = i+1;j<a.length;j++){
				if(a[i]<a[j]){
					int diff1 = a[j]-a[i];
					if(diff1>diff){
						b[0] = a[i];
						b[1] = a[j];
						diff = diff1;
					}
				}
			}
		}
		
		System.out.println("difference : "+diff + "\n Elements :"+Arrays.toString(b));
		efficientWayToFindDiff();
	}
	
	public static void efficientWayToFindDiff(){
		int a[] = {7,9};
		if(a!=null && a.length<=1){
			return;
		}
		//base case where only two elements are there in array
		int diff = a[1]-a[0];
		if(a.length == 2){
			if(a[0] < a[1]){
				System.out.println(diff);
				return;
			}else{
				return;
			}
		}
		int min = a[0];
		for(int i = 1 ;i < a.length;i++){
			if(a[i]-min > diff){
				diff = a[i]-min;
			}
			if(a[i]<min){
				min = a[i];
			}
		}
		System.out.println(diff);
	}

}
