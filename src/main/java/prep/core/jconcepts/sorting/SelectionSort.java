/**
 * 
 */
package prep.core.jconcepts.sorting;

/**
 * @author Hareesha May 30, 2017 2017
 */
public class SelectionSort {

	/**
	 * In selection sort , first elemt is taken from unsorted list as the min
	 * 
	 * and it is compared against every other element 
	 * 
	 * if any other element is found to be less than current min, then that element is made as min.
	 * 
	 * once after every iteration , the current min is swapped with the ist element of the sorted portion
	 * 
	 * this is repeated for every element
	 * 
	 * time complexity is O(N2)
	 * 
	 * Space complexity is O(1)
	 */
	public static void main(String[] args) {
		int[] a = new int[] { 10, 4, 1, 17, 0, 8 };

		System.out.println("Before Sorting ");
		for (int i : a) {
			System.out.print(i + "\t");
		}

		SelectionSort sort = new SelectionSort();
		sort.selectionSort(a);

		System.out.println("\nAfter Sorting ");
		for (int i : a) {
			System.out.print(i + "\t");
		}

	}
	
	public void selectionSort(int... a){
		for (int i = 0; i < a.length; i++) {
			int min = a[i];
			int mindx = i;
			for (int j = i + 1; j < a.length; j++) {
				if (a[j] < min) {
					min = a[j]; //minimun
					mindx = j; //the index where current min is present
				}
			}
			if(i!=mindx){
				int temp = a[i];
				a[i] = min;
				a[mindx] = temp;
			}

		}
	}

}
