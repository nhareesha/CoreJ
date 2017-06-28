/**
 * 
 */
package prep.core.jconcepts.ds_alg_problems;

/**
 * @author Hareesha
 * Jun 28, 2017 2017
 */
public class NumerOfCharsNoLoops {

	/**
	 * Number of characters in a string without using any loops
	 */
	public static void main(String[] args) {
		String abc = "hello i am hello";
		int num = abc.length()-abc.replace("o","").length();
		System.out.println(num);
		 
		//replace all  - to remove all the white spaces
		String a = "hello i have so many spacess";
		a= a.replace(" ","");
		System.out.println(a);
	}

}
