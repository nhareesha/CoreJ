/**
 * 
 */
package prep.core.jconcepts.sorting;

/**
 * @author Hareesha May 30, 2017 2017
 */
public class MergeSort {

	/**
	 * Merge Sort
	 */
	
	public static void main(String[] args) {
		
		int[] arr = new int[] { 6, 3, 10, 9, 2, 99 };
		
		System.out.println("Before Sort");
		for(int i : arr){
			System.out.print(i+"\t");
			}
		
		divide(arr);
		System.out.println("\n After Sort");
		for(int i : arr){
			System.out.print(i+"\t");
			}
	}

	public static void divide(int[] a) {
		int n = a.length;
		if (n < 2) {
			return;
		}
		int mid = n / 2;
		int[] left = new int[mid];
		int[] right = new int[n - mid];
		
		for (int i = 0; i < mid; i++) {
			left[i] = a[i];
		}
		
		for (int i = mid; i < n; i++) {
			right[i-mid] = a[i];
		}
		
		divide(left);
		divide(right);
		
		merge(left,right,a);
		
	
	}

	public  static void merge(int[] l,int[] r,int[] a) {
		int nl = l.length;
		int nr = r.length;
		int k = 0;
		int i = 0;
		int j = 0;
		
		while(i < nl && j < nr){
			if(l[i]<=r[j]){
				a[k]=l[i];
				k=k+1;
				i=i+1;
			}else{
				a[k]=r[j];
				k=k+1;
				j=j+1;
			}
		}
		
		while(i<nl){
			a[k] = l[i];
			i++;
			k++;
		}
		while(j<nr){
			a[k] = r[j];
			j++;
			k++;
		}

	}

}
