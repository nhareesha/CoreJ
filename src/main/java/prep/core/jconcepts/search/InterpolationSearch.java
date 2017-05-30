/**
 * 
 */
package prep.core.jconcepts.search;

/**
 * @author Hareesha
 * May 29, 2017 2017
 */
public class InterpolationSearch {

	/**
	 * Interpolation Search , first finds the search area for the given item in the dataset
	 * for example, in datasets like dictionaries and for phone numbers, they have some atterns
	 * 
	 * So using binary search is not a good idea here
	 * 
	 * mid = low + ((high-low)/A[high]-A[low]) * (find - A[low])
	 * 
	 * Every time the given number is compared with the element at the new mid 
	 * 
	 * if n > A[mid]  limits would be [mid+1 , size]
	 * 
	 * if n < A[mid]  limits would be [0 , mid -1 ]
	 * 
	 * O(n) for search operation
 	 */
	int[] dataset;

	int high;
	int low;
	boolean flag = false;
	int trycount;

	public InterpolationSearch(int[] dataset) {
		this.dataset = dataset;
		high = dataset.length - 1;
		low = 0;
		trycount = 0;
	}

	public static void main(String[] args) {
		int[] dataset = new int[] { 1110, 1112, 1113, 2224, 2225, 2226, 5557, 5558, 5559, 55510, 88811, 88812, 99913,
				99914, 99915 };
		InterpolationSearch bsearch = new InterpolationSearch(dataset);
		bsearch.interpolationWithoutRecursion(5557);

	}

	/**
	 * This is interpolation search using recursion
	 * 
	 * @param find
	 */
	public void interpolationSearch(int find) {
		trycount++;
		int mid = calculateMid(low, high , find);
		if (find == dataset[mid]) {
			System.out.println("Element found at index " + mid
					+ " Found after " + trycount + " tries");
			flag = true;
			return;
		} else if (find > dataset[mid]) {
			low = mid + 1;
			interpolationSearch(find);
		} else {
			high = mid - 1;
			interpolationSearch(find);
		}

	}

	public void interpolationWithoutRecursion(int find) {
		while (!flag) {
			trycount++;
			int mid = calculateMid(low, high ,find);
			if (find == dataset[mid]) {
				System.out.println("Element found at index " + mid+ " Found after " + trycount + " tries");
				flag = true;
				return;
			} else if (find > dataset[mid]) {
				low = mid + 1;
			} else {
				high = mid - 1;
			}
		}
	}

	private int calculateMid(int low, int high , int find) {

		return (low + ((high - low) / (dataset[high]-dataset[low])) * (find - dataset[low]) );
	}


}
