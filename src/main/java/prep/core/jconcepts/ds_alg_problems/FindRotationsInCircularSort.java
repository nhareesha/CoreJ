/**
 * 
 */
package prep.core.jconcepts.ds_alg_problems;

/**
 * @author Hareesha
 * May 31, 2017
 */
public class FindRotationsInCircularSort {

	/**
	 * Input : 5 6 7 1 2 3 4
	 * 
	 * If this is given, the output should be 3 times
	 * 
	 * if we can find the index of minimum , then we will know the rotations
	 * 
	 * Linear search takes O(n2)
	 * 
	 * Custom Binary search
	 */
	
	int num = -1;
	public static void main(String[] args) {
		
		int[] arr = new int[]{2,3,4,5,6,7,0,1,2};
		
		int low = 0;
		int high = arr.length-1;
		FindRotationsInCircularSort o = new FindRotationsInCircularSort();
		o.findRotations(arr,low,high);
		if(o.num > -1){
			System.out.println(o.num + " array got rotated");
		}
		
	}
	
	public  void findRotations(int[] arr , int low, int high){
		
		
		int mid = low+(high-low)/2;
		if(high-low==1){
			num = high;
			return;
		}
		
		if(arr[low] > arr[mid]){
			high = mid;
			findRotations(arr , low,high);
			
		}else if(arr[high] < arr[mid]){
			low=mid;
			findRotations(arr , low,high);
		}
	}
}
