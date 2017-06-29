/**
 * 
 */
package prep.core.jconcepts.ds_alg_problems.strings;

/**
 * @author Hareesha
 * Jun 28, 2017 2017
 */
public class FirstRepAndNonRepChar {

	/**
	 * Find First repeated and non repeated character
	 */
	public static void main(String[] args) {
		String s = "helloh";
		firstRepeatedChar(s);
		firstNonRepeatedChar(s);
	}
	
	public static void firstRepeatedChar(String s){
		for(int i = 0;i<s.length();i++){
			if(s.lastIndexOf(s.charAt(i))!=i){
				System.out.println("First repeated charcter : "+s.charAt(i));
				break;
			}
		}
	}
	
	public static void firstNonRepeatedChar(String s){
		for(int i = 0;i<s.length();i++){
			if(s.lastIndexOf(s.charAt(i))==i){
				System.out.println("First Non Repeated charcter : "+s.charAt(i));
				break;
			}
		}
	}
}
