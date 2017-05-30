/**
 * 
 */
package prep.core.jconcepts.search;

/**
 * @author Hareesha May 29, 2017 2017
 */
public class BinarySearch {

	/**
	 * Binary Search works only on the sorted data set. if dataset is not sorted
	 * then it gives the ambiguous results.
	 * 
	 * Search time comlexity is O(log n)
	 * 
	 * Every time the dataset is divided into two parts by calculating the mid
	 * And then the mid element is taken and compared with the seach item, if it
	 * is greater
	 * 
	 * the greater side of the mid is used for further search.
	 * 
	 * Again mid is calculated
	 * 
	 * new mid limits would be , [mid+1 , arrsize] or
	 * 
	 * [0,mid-1]
	 * 
	 * this is repeated until the element is found
	 */

	int[] dataset;

	int high;
	int low;
	boolean flag = false;
	int trycount;

	public BinarySearch(int[] dataset) {
		this.dataset = dataset;
		high = dataset.length - 1;
		low = 0;
		trycount = 0;
	}

	public static void main(String[] args) {
		int[] dataset = new int[] { 1110, 1112, 1113, 2224, 2225, 2226, 5557, 5558, 5559, 55510, 88811, 88812, 99913,
				99914, 99915 };
		BinarySearch bsearch = new BinarySearch(dataset);
		bsearch.binarySearchWithoutRecursion(5557);

	}

	/**
	 * This binary search using recursion
	 * 
	 * @param find
	 */
	public void binarySearch(int find) {
		trycount++;
		int mid = calculateMid(low, high);
		if (find == dataset[mid]) {
			System.out.println("Element found at index " + mid
					+ " Found after " + trycount + " tries");
			flag = true;
			return;
		} else if (find > dataset[mid]) {
			low = mid + 1;
			binarySearch(find);
		} else {
			high = mid - 1;
			binarySearch(find);
		}

	}

	public void binarySearchWithoutRecursion(int find) {
		while (!flag) {
			trycount++;
			int mid = calculateMid(low, high);
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

	private int calculateMid(int low, int high) {

		return (low + ((high - low) / 2));
	}

}
