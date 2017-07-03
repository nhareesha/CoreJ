/**
 * 
 */
package prep.core.jconcepts.ds.linkedlists;

/**
 * @author Hareesha
 * Jul 2, 2017 2017
 */
public class ReverseALinkedListAndPalindrom {

	/**
	 * everse a linked list
	 */
	public static void main(String[] args) {
		LinkedListC org = new LinkedListC();
		org.addToEnd(1);
		org.addToEnd(1);
		org.addToEnd(2);
		org.addToEnd(2);
		org.addToEnd(1);
		org.addToEnd(1);
		org.display();
		
		ListNode reverseHead = org.reverseList();
		
		ListNode orgHead = org.getHead();
		
		//comparing two lists to check if they are same or not - Palindrom
		
		boolean result = org.compareTwoLists(orgHead, reverseHead);
		
		if(result){
			System.out.println("Given List is Palindrom");
		}else{
			System.out.println("Given List is not palindrom");
		}
		
	}

}
