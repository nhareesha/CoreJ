/**
 * 
 */
package prep.core.jconcepts;

/**
 * @author Hareesha
 * May 24, 2017
 */
public class ReverseWords {

	/**
	 * Reverse a Word in sentence without library methods
	 */
	public static void main(String[] args) {
		String str = "Hello this is a reversed String!!";
		System.out.println(reverseWords(str));
	}
	
	public static String reverseWords(String str){
		
		String[] strArr = str.split("\\s");
		StringBuilder sb = new StringBuilder(strArr.length);
		for(int i= strArr.length-1;i>=0;i--){
			sb.append(strArr[i]+" ");
		}
		return sb.toString().trim();
	}

}
