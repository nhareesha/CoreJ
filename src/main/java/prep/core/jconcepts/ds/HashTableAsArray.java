/**
 * 
 */
package prep.core.jconcepts.ds;

/**
 * @author Hareesha May 28, 2017 2017
 */
public class HashTableAsArray {

	/**
	 * HashTable is based on hashing algorith HashTable is internally backed by
	 * a array of LinkedLists Where each entry of LinkedList hold the Key and
	 * value pair. Key would be the hash of the actual key and value would be
	 * the values associated with the key.
	 */

	// HashTable is basically an Array of LinkedLists

	Entry[] hashArr;
	int size;

	public HashTableAsArray() {
		this(5);// default size of HashTable array is 5
	}

	public HashTableAsArray(int size) {
		this.size = size;
		hashArr = new Entry[size];
		for (Entry entry : hashArr) {
			entry = null;
		}
	}

	private int getHash(int key) {
		return key % size;
	}

	public void put(int key, Object val) {
		int hashIndex = getHash(key);
		Entry arrEntryAtIndx = hashArr[hashIndex];

		Entry newEntry = new Entry(key, val);

		if (arrEntryAtIndx == null) {
			hashArr[hashIndex] = newEntry;
		} else {
			newEntry.setNext(arrEntryAtIndx);
			hashArr[hashIndex] = newEntry;
		}

	}

	public void display() {
		for (Entry e : hashArr) {
			if (e != null) {
				if (e.getNext() == null) {
					System.out.println("Key : " + e.getKey() + "Value :"
							+ e.getVal());
				} else {
					Entry head = e;
					Entry tempHead = head;
					while (tempHead.getNext() != null) {
						System.out.println("Key : " + tempHead.getKey()
								+ "Value : " + tempHead.getVal());
						tempHead = tempHead.getNext();
					}
					System.out.println("Key : " + tempHead.getKey()
							+ "Value : " + tempHead.getVal());
				}
			}
		}
	}

	public static void main(String[] args) {

		HashTableAsArray htbl = new HashTableAsArray(3);
		htbl.put(3, "Hello3");
		htbl.put(0, "Hello0");
		htbl.put(1, "Hello1");
		htbl.put(3, "Hello3");
		htbl.put(0, "Hello0");
		htbl.put(1, "Hello1");
		htbl.display();

	}

}

/**
 * This class is the model for entry of the LinkedList
 * 
 * @author Hareesha May 28, 2017
 */

class Entry {
	private Object val;
	private int key;
	private Entry next;

	public Entry(int key, Object val) {
		this.key = key;
		this.val = val;
		next = null;
	}

	public Object getVal() {
		return val;
	}

	public void setVal(Object val) {
		this.val = val;
	}

	public int getKey() {
		return key;
	}

	public void setKey(int key) {
		this.key = key;
	}

	public Entry getNext() {
		return next;
	}

	public void setNext(Entry next) {
		this.next = next;
	}

}
