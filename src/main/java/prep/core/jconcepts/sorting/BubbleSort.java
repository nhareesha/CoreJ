/**
 * 
 */
package prep.core.jconcepts.sorting;

/**
 * @author Hareesha May 29, 2017 2017
 */
public class BubbleSort {

	/**
	 * In Bubble sort every element is compared with next element , if greater
	 * it is swapped.
	 * 
	 * After 1st iteration the max element will be at the end of the list sorted.
	 * 
	 * Again same procedure is continued , till the last but one element.
	 * It is done for n times
	 * 
	 * 
	 * time complexity is O(n2)
	 * 
	 * Space complexity is O(1)
	 */
	public static void main(String[] args) {

		int[] a = new int[] { 12, 1, 5, 10, 0, -6 };
		
		System.out.println("Before Sort");
		for (int i : a) {
			System.out.println(i);
		}
		
		BubbleSort sort = new BubbleSort();
		sort.bubbleSort(a);
		
		System.out.println("After Sort");
		for (int i : a) {
			System.out.println(i);
		}
	}
	
	public void bubbleSort(int[] a){
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length - i; j++) {
				if (j != a.length - 1) {
					if (a[j] > a[j+1]) {
						int temp = a[j];
						a[j] = a[j + 1];
						a[j + 1] = temp;
					}
				}
			}
		}
	}

}
