/**
 * 
 */
package prep.core.jconcepts;

/**
 * @author Hareesha
 * May 24, 2017
 */
public class Palindrome {

	/**
	 * Palindrome : reversed string should be same as the actual String
	 */
	public static void main(String[] args) {
		
		String str1 = "Madam";
		System.out.println("Given String "+str1+" is Palindrome : "+palindrome(str1));
		
		String str2 = "Java";
		System.out.println("Given String "+str2+" is Palindrome : "+palindrome(str2));
		
	}
	
	public static boolean palindrome(String str){
		char[] arr = str.toCharArray();
		StringBuilder sb = new StringBuilder();
		for(int i = arr.length-1 ;i>=0 ;i--){
			sb.append(arr[i]);
		}
		boolean result = sb.toString().equalsIgnoreCase(str);
		return result;
	}
}
